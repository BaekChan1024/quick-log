package io.github.baekchan1024.template.repository;

import io.github.baekchan1024.template.entity.MessageTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageTemplateRepository extends JpaRepository<MessageTemplate, Long> {
    MessageTemplate findByTypeAndCodeAndIsUsedTrue(MessageTemplate.Type type, MessageTemplate.Code code);
}
