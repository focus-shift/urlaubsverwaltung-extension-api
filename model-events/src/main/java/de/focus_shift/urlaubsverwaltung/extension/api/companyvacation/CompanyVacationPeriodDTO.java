package de.focus_shift.urlaubsverwaltung.extension.api.companyvacation;

import lombok.Builder;
import lombok.NonNull;

import java.time.Instant;

@Builder
public record CompanyVacationPeriodDTO(
        @NonNull Instant startDate,
        @NonNull Instant endDate,
        DayLength dayLength
) {
}
