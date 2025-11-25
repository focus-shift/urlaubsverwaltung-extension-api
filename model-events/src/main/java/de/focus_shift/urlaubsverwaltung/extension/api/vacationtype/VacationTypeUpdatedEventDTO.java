package de.focus_shift.urlaubsverwaltung.extension.api.vacationtype;

import lombok.Builder;
import lombok.NonNull;

import java.util.Locale;
import java.util.Map;
import java.util.UUID;

@Builder
public record VacationTypeUpdatedEventDTO(
        @NonNull UUID id,
        @NonNull String tenantId,
        @NonNull Long sourceId,
        @NonNull String category,
        boolean requiresApprovalToApply,
        boolean requiresApprovalToCancel,
        @NonNull String color,
        boolean visibleToEveryone,
        @NonNull Map<Locale, String> label
) {
}
