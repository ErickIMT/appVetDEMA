package com.integrador.AppVetDEMA.config.database.auditor;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.auditing.DateTimeProvider;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing(dateTimeProviderRef = "dateTimeProvider")
public class AuditorConfigDataBase {

    public AuditorAware<String> auditorProvider() {
        return new AuditorAwareImpl();
    }


    public DateTimeProvider dateTimeProvider() {
        return new AuditorDateTimeProvider();
    }
}
