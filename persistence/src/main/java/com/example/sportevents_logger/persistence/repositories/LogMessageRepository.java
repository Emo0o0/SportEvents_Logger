package com.example.sportevents_logger.persistence.repositories;

import com.example.sportevents_logger.persistence.entities.LogMessage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LogMessageRepository extends JpaRepository<LogMessage, UUID> {
}
