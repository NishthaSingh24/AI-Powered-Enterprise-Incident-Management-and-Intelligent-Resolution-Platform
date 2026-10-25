package com.nishtha.incident_management.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import jakarta.persistence.PrePersist;
import jakarta.validation.constraints.NotBlank;
import com.nishtha.incident_management.enums.IncidentStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import com.nishtha.incident_management.enums.IncidentPriority;
import com.nishtha.incident_management.enums.IncidentSeverity;
import com.nishtha.incident_management.enums.IncidentCategory;
import com.nishtha.incident_management.enums.IncidentDepartment;

@Entity
public class Incident {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String title;

    @NotBlank
    private String description;

    @Enumerated(EnumType.STRING)
    private IncidentStatus status = IncidentStatus.OPEN;

    @Enumerated(EnumType.STRING)
    private IncidentPriority priority;

    @Enumerated(EnumType.STRING)
    private IncidentSeverity severity;

    @Enumerated(EnumType.STRING)
    private IncidentCategory category;

    @Enumerated(EnumType.STRING)
    private IncidentDepartment department;

    private LocalDateTime createdAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public IncidentStatus getStatus() {
        return status;
    }

    public void setStatus(IncidentStatus status) {
        this.status = status;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }
}