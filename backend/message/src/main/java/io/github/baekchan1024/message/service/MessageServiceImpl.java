package io.github.baekchan1024.message.service;

import io.github.baekchan1024.template.dto.Template;
import io.github.baekchan1024.template.entity.MessageTemplate;
import io.github.baekchan1024.template.enums.Code;
import io.github.baekchan1024.template.enums.Type;
import io.github.baekchan1024.template.service.MessageTemplateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class MessageServiceImpl implements MessageService {

    private final MessageTemplateService messageTemplateService;

    @Override
    public void send(String to, Type type, Code code, Map<String, String> additionalProperties) {
        Template template = messageTemplateService.find(type, code);

        String content = template.getContent();
        for (Map.Entry<String, String> entry : additionalProperties.entrySet()) {
            content = content.replace("{{" + entry.getKey() + "}}", entry.getValue());
        }
    }
}
