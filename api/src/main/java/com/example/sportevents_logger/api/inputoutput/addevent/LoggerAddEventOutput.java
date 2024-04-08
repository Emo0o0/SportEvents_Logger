package com.example.sportevents_logger.api.inputoutput.addevent;

import com.example.sportevents_logger.api.base.OperationResult;
import lombok.*;

@Getter
@Setter(AccessLevel.PRIVATE)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoggerAddEventOutput implements OperationResult {

    private String id;
    private String logMessage;
    private String timestamp;


}
