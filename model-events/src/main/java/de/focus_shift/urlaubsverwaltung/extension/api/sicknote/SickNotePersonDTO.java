package de.focus_shift.urlaubsverwaltung.extension.api.sicknote;

import lombok.Builder;
import lombok.NonNull;

@Builder
public record SickNotePersonDTO(
        @NonNull Long personId,
        @NonNull String username
) {
}
