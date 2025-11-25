package de.focus_shift.urlaubsverwaltung.extension.api.application;

import lombok.Builder;
import lombok.NonNull;

import java.time.Duration;
import java.time.Instant;
import java.util.UUID;

@Builder
public record ApplicationCancelledEventDTO(
        @NonNull UUID id,
        @NonNull Long sourceId,
        @NonNull Instant createdAt,
        @NonNull String tenantId,
        @NonNull ApplicationPersonDTO person,
        ApplicationPersonDTO appliedBy,
        ApplicationPersonDTO cancelledBy,
        boolean twoStageApproval,
        @NonNull ApplicationPeriodDTO period,
        @NonNull VacationTypeDTO vacationType,
        String reason,
        @NonNull String status,
        boolean teamInformed,
        Duration hours
) {
}
