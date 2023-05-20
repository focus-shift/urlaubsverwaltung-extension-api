package de.focus_shift.urlaubsverwaltung.extension.api.sicknote;

import java.time.Instant;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
public class SickNotePeriodDTO {
  @NonNull private Instant startDate;
  @NonNull private Instant endDate;
}
