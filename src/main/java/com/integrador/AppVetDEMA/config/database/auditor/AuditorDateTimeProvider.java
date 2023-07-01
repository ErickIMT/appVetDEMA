package com.integrador.AppVetDEMA.config.database.auditor;

import org.springframework.data.auditing.DateTimeProvider;

import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.Optional;

public class AuditorDateTimeProvider implements DateTimeProvider {
    @Override
    public Optional<TemporalAccessor> getNow() {

        return Optional.of(new Date().toInstant());
    }
}
