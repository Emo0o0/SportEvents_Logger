package com.example.sportevents_logger.restexport;

import com.example.sportevents_logger.api.inputoutput.receiveevents.LoggerReceiveEventsListInput;
import com.example.sportevents_logger.api.inputoutput.receiveevents.LoggerReceiveEventsOutput;
import feign.Headers;
import feign.RequestLine;

@Headers({"Content-Type: application/json"})
public interface SportEventsLoggerRestClient {

    @RequestLine("POST /controller/receiveEvents")
    LoggerReceiveEventsOutput receiveEvents(LoggerReceiveEventsListInput input);

}
