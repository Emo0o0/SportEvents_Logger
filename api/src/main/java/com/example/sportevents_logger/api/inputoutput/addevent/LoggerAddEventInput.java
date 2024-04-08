package com.example.sportevents_logger.api.inputoutput.addevent;

import com.example.sportevents_logger.api.base.OperationInput;
import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter(AccessLevel.PRIVATE)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoggerAddEventInput implements OperationInput {

    private String logMessage;
    private Timestamp timestamp;

}
