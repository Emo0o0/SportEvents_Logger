package com.example.sportevents_logger.core.services;

import com.example.sportevents_logger.api.inputoutput.LoggerAddEventInput;
import com.example.sportevents_logger.api.inputoutput.LoggerAddEventOperation;
import com.example.sportevents_logger.api.inputoutput.LoggerAddEventOutput;
import org.springframework.stereotype.Service;

@Service
public class LoggerAddEventOperationProcessor implements LoggerAddEventOperation {
    @Override
    public LoggerAddEventOutput process(LoggerAddEventInput input) {
        return null;
    }
}
