package de.focus_shift.urlaubsverwaltung.extension.api.companyvacation;

import lombok.Builder;
import lombok.NonNull;

import java.time.Instant;
import java.util.UUID;

@Builder
public record CompanyVacationDeletedEventDto(
        @NonNull UUID id,
        @NonNull String sourceId,
        @NonNull Instant createdAt,
        @NonNull String tenantId) {
}
