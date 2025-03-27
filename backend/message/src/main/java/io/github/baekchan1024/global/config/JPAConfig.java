package io.github.baekchan1024.global.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = {"io.github.baekchan1024.template.repository"})
@EntityScan(basePackages = {"io.github.baekchan1024.template.entity"})
public class JPAConfig {
}
