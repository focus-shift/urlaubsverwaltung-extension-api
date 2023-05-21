package de.focus_shift.urlaubsverwaltung.extension.api.application;

import java.time.Instant;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
public class ApplicationPeriodDTO {
  @NonNull private Instant startDate;
  @NonNull private Instant endDate;
}
