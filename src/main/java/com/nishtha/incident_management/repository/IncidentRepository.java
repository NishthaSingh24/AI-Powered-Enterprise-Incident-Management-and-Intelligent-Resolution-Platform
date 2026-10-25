package com.nishtha.incident_management.repository;

import com.nishtha.incident_management.entity.Incident;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncidentRepository extends JpaRepository<Incident, Long> {
}