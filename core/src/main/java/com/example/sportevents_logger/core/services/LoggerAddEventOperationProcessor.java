package com.example.sportevents_logger.core.services;

import com.example.sportevents_logger.api.inputoutput.addevent.LoggerAddEventInput;
import com.example.sportevents_logger.api.inputoutput.addevent.LoggerAddEventOperation;
import com.example.sportevents_logger.api.inputoutput.addevent.LoggerAddEventOutput;
import com.example.sportevents_logger.persistence.entities.LogMessage;
import com.example.sportevents_logger.persistence.repositories.LogMessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoggerAddEventOperationProcessor implements LoggerAddEventOperation {

    private final LogMessageRepository logMessageRepository;

    @Override
    public LoggerAddEventOutput process(LoggerAddEventInput input) {

        LogMessage logMessage = LogMessage.builder()
                .logMessage(input.getLogMessage())
                .logDateAndTime(input.getTimestamp())
                .build();

        logMessageRepository.save(logMessage);

        return LoggerAddEventOutput.builder()
                .id(logMessage.getId().toString())
                .logMessage(logMessage.getLogMessage())
                .timestamp(logMessage.getLogDateAndTime().toString())
                .build();
    }
}
