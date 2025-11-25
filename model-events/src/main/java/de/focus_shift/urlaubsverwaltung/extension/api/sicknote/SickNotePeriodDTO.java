package de.focus_shift.urlaubsverwaltung.extension.api.sicknote;

import java.time.Instant;
import lombok.Builder;
import lombok.NonNull;

@Builder
public record SickNotePeriodDTO(
        @NonNull Instant startDate,
        @NonNull Instant endDate,
        DayLength dayLength
) {
}
