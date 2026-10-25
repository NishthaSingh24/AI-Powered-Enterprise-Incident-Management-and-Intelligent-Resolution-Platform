package com.nishtha.incident_management.ai;

import com.nishtha.incident_management.enums.IncidentCategory;
import com.nishtha.incident_management.enums.IncidentDepartment;
import com.nishtha.incident_management.enums.IncidentPriority;
import com.nishtha.incident_management.enums.IncidentSeverity;

public class IncidentClassificationResult {

    private IncidentCategory category;
    private IncidentDepartment department;
    private IncidentPriority priority;
    private IncidentSeverity severity;

    public IncidentCategory getCategory() {
        return category;
    }

    public void setCategory(IncidentCategory category) {
        this.category = category;
    }

    public IncidentDepartment getDepartment() {
        return department;
    }

    public void setDepartment(IncidentDepartment department) {
        this.department = department;
    }

    public IncidentPriority getPriority() {
        return priority;
    }

    public void setPriority(IncidentPriority priority) {
        this.priority = priority;
    }

    public IncidentSeverity getSeverity() {
        return severity;
    }

    public void setSeverity(IncidentSeverity severity) {
        this.severity = severity;
    }
}