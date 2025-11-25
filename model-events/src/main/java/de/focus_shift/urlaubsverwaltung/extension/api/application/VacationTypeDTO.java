package de.focus_shift.urlaubsverwaltung.extension.api.application;

import lombok.Builder;
import lombok.NonNull;

@Builder
public record VacationTypeDTO(
        @NonNull Long sourceId,
        @NonNull String category,
        String translationKey,
        boolean requiresApprovalToApply,
        boolean requiresApprovalToCancel,
        @NonNull String color,
        boolean visibleToEveryone
) {
}
