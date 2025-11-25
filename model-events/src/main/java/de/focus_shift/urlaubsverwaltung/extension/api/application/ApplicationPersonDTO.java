package de.focus_shift.urlaubsverwaltung.extension.api.application;

import lombok.Builder;
import lombok.NonNull;

@Builder
public record ApplicationPersonDTO(
        @NonNull Long personId,
        @NonNull String username
) {
}
