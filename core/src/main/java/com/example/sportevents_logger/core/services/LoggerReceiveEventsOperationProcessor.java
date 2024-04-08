package com.example.sportevents_logger.core.services;

import com.example.sportevents_logger.api.inputoutput.receiveevents.LoggerReceiveEventsInput;
import com.example.sportevents_logger.api.inputoutput.receiveevents.LoggerReceiveEventsListInput;
import com.example.sportevents_logger.api.inputoutput.receiveevents.LoggerReceiveEventsOperation;
import com.example.sportevents_logger.api.inputoutput.receiveevents.LoggerReceiveEventsOutput;
import com.example.sportevents_logger.persistence.entities.LogMessage;
import com.example.sportevents_logger.persistence.repositories.LogMessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class LoggerReceiveEventsOperationProcessor implements LoggerReceiveEventsOperation {

    private final LogMessageRepository logMessageRepository;

    @Override
    public LoggerReceiveEventsOutput process(LoggerReceiveEventsListInput input) {

        List<LogMessage> logs = new ArrayList<>();
        for (LoggerReceiveEventsInput l : input.getReceivedLogs()) {

            LogMessage logMap = LogMessage.builder()
                    .logMessage(l.getLogMessage())
                    .logDateAndTime(l.getTimestamp())
                    .build();

            logs.add(logMap);
        }
        logMessageRepository.saveAll(logs);

        return LoggerReceiveEventsOutput.builder()
                .receivedSuccessfully(true)
                .build();

    }
}
