package io.github.baekchan1024.message.service;

import io.github.baekchan1024.template.enums.Code;
import io.github.baekchan1024.template.enums.Type;

import java.util.Map;

public interface MessageService {

    void send(String to, Type type, Code code, Map<String, String> additionalProperties);
}
