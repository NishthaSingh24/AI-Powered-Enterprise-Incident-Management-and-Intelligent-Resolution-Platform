package com.nishtha.incident_management.controller;

import com.nishtha.incident_management.entity.Incident;
import com.nishtha.incident_management.service.IncidentService;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/api/incidents")
public class IncidentController {

    private final IncidentService incidentService;

    public IncidentController(IncidentService incidentService) {
        this.incidentService = incidentService;
    }

    @PostMapping
    public Incident createIncident(@Valid @RequestBody Incident incident) {
        return incidentService.createIncident(incident);
    }

    @GetMapping
    public List<Incident> getAllIncidents() {
        return incidentService.getAllIncidents();
    }
}