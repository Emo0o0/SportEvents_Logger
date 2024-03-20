package com.example.sportevents_logger.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LogMessage {

    @Id
    private UUID id;
    private String logMessage;
    private Timestamp logDateAndTime;


}
