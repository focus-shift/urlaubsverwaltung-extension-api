package de.focus_shift.urlaubsverwaltung.extension.api.application;

import lombok.Builder;
import lombok.NonNull;

import java.time.Instant;

@Builder
public record ApplicationPeriodDTO(
        @NonNull Instant startDate,
        @NonNull Instant endDate,
        @NonNull DayLength dayLength
) {
}
