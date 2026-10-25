package com.nishtha.incident_management.ai;

import com.nishtha.incident_management.entity.Incident;
import com.nishtha.incident_management.enums.IncidentCategory;
import com.nishtha.incident_management.enums.IncidentDepartment;
import com.nishtha.incident_management.enums.IncidentPriority;
import com.nishtha.incident_management.enums.IncidentSeverity;
import org.springframework.stereotype.Service;

@Service
public class IncidentClassificationService {

    public IncidentClassificationResult classify(Incident incident) {

        IncidentClassificationResult result = new IncidentClassificationResult();

        result.setCategory(IncidentCategory.OTHER);
        result.setDepartment(IncidentDepartment.IT);
        result.setPriority(IncidentPriority.MEDIUM);
        result.setSeverity(IncidentSeverity.MEDIUM);

        return result;
    }
}