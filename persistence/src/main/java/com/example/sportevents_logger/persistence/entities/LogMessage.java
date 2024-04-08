package com.example.sportevents_logger.persistence.entities;

import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String logMessage;
    private Timestamp logDateAndTime;


}
