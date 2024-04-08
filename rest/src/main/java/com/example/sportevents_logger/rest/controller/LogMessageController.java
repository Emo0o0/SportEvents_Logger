package com.example.sportevents_logger.rest.controller;

import com.example.sportevents_logger.api.inputoutput.addevent.LoggerAddEventInput;
import com.example.sportevents_logger.api.inputoutput.addevent.LoggerAddEventOperation;
import com.example.sportevents_logger.api.inputoutput.addevent.LoggerAddEventOutput;
import com.example.sportevents_logger.api.inputoutput.receiveevents.LoggerReceiveEventsListInput;
import com.example.sportevents_logger.api.inputoutput.receiveevents.LoggerReceiveEventsOperation;
import com.example.sportevents_logger.api.inputoutput.receiveevents.LoggerReceiveEventsOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
@RequiredArgsConstructor
public class LogMessageController {

    private final LoggerAddEventOperation loggerAddEventOperation;
    private final LoggerReceiveEventsOperation loggerReceiveEventsOperation;

    @PostMapping("/addEvent")
    public ResponseEntity<LoggerAddEventOutput> addEvent(@RequestBody LoggerAddEventInput input) {
        return ResponseEntity.status(201).body(loggerAddEventOperation.process(input));
    }

    @PostMapping("/receiveEvents")
    public ResponseEntity<LoggerReceiveEventsOutput> receiveEvents(@RequestBody LoggerReceiveEventsListInput input) {
        return ResponseEntity.status(201).body(loggerReceiveEventsOperation.process(input));
    }

}
