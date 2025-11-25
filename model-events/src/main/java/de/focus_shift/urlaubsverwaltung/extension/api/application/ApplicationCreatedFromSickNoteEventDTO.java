package de.focus_shift.urlaubsverwaltung.extension.api.application;

import lombok.Builder;
import lombok.NonNull;

import java.time.Instant;
import java.util.UUID;

@Builder
public record ApplicationCreatedFromSickNoteEventDTO(
        @NonNull UUID id,
        @NonNull Long sourceId,
        @NonNull Instant createdAt,
        @NonNull String tenantId,
        @NonNull ApplicationPersonDTO person,
        ApplicationPersonDTO appliedBy,
        @NonNull ApplicationPeriodDTO period,
        @NonNull VacationTypeDTO vacationType,
        String reason,
        @NonNull String status,
        boolean teamInformed
) {
}
