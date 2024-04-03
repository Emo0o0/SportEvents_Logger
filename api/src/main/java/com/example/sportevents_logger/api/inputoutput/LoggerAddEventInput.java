package com.example.sportevents_logger.api.inputoutput;

import com.example.sportevents_logger.api.base.OperationInput;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoggerAddEventInput implements OperationInput {

    private String id;
    private String logMessage;

}
