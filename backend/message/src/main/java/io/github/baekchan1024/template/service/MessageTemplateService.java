package io.github.baekchan1024.template.service;

import io.github.baekchan1024.template.dto.Template;
import io.github.baekchan1024.template.enums.Code;
import io.github.baekchan1024.template.enums.Type;

public interface MessageTemplateService {

    Template find(Type type, Code code);
}
