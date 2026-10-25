package com.nishtha.incident_management.service;

import com.nishtha.incident_management.entity.Incident;
import com.nishtha.incident_management.repository.IncidentRepository;
import org.springframework.stereotype.Service;
import com.nishtha.incident_management.ai.IncidentClassificationService;
import com.nishtha.incident_management.ai.IncidentClassificationResult;

import java.util.List;

@Service
public class IncidentService {

    private final IncidentRepository incidentRepository;
    private final IncidentClassificationService classificationService;

    public IncidentService(
            IncidentRepository incidentRepository,
            IncidentClassificationService classificationService) {

        this.incidentRepository = incidentRepository;
        this.classificationService = classificationService;
    }

    public Incident createIncident(Incident incident) {

        IncidentClassificationResult result =
                classificationService.classify(incident);

        incident.setCategory(result.getCategory());
        incident.setDepartment(result.getDepartment());
        incident.setPriority(result.getPriority());
        incident.setSeverity(result.getSeverity());

        return incidentRepository.save(incident);
    }

    public List<Incident> getAllIncidents() {
        return incidentRepository.findAll();
    }
}