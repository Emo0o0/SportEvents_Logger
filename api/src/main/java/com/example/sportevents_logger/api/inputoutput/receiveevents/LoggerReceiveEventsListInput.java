package com.example.sportevents_logger.api.inputoutput.receiveevents;

import com.example.sportevents_logger.api.base.OperationInput;
import lombok.*;

import java.util.Set;

@Getter
@Setter(AccessLevel.PRIVATE)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoggerReceiveEventsListInput implements OperationInput {

    Set<LoggerReceiveEventsInput> receivedLogs;

}
