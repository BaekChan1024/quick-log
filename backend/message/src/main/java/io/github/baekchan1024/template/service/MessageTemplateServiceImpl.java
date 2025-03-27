package io.github.baekchan1024.template.service;

import io.github.baekchan1024.template.dto.Template;
import io.github.baekchan1024.template.entity.MessageTemplate;
import io.github.baekchan1024.template.enums.Code;
import io.github.baekchan1024.template.enums.Type;
import io.github.baekchan1024.template.repository.MessageTemplateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessageTemplateServiceImpl implements MessageTemplateService {

    private final MessageTemplateRepository messageTemplateRepository;

    @Override
    public Template find(Type type, Code code) {
        MessageTemplate messageTemplate = messageTemplateRepository.findByTypeAndCodeAndIsUsedTrue(type, code);
        return new Template(messageTemplate.getSubject(), messageTemplate.getContent());
    }
}
