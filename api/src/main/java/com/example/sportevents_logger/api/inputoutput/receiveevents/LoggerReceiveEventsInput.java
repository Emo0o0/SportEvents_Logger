package com.example.sportevents_logger.api.inputoutput.receiveevents;

import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter(AccessLevel.PRIVATE)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoggerReceiveEventsInput {

    private String logMessage;
    private Timestamp timestamp;

}
