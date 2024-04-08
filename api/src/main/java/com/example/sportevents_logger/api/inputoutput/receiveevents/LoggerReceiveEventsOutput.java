package com.example.sportevents_logger.api.inputoutput.receiveevents;

import com.example.sportevents_logger.api.base.OperationResult;
import lombok.*;

@Getter
@Setter(AccessLevel.PRIVATE)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoggerReceiveEventsOutput implements OperationResult {

    private Boolean receivedSuccessfully;

}
