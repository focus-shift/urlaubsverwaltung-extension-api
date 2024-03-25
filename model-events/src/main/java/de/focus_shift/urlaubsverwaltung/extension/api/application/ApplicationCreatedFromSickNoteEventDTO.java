package de.focus_shift.urlaubsverwaltung.extension.api.application;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
public class ApplicationCreatedFromSickNoteEventDTO {

  @NonNull private UUID id;

  @NonNull private Long sourceId;

  @NonNull private Instant createdAt;

  @NonNull private String tenantId;

  @NonNull private ApplicationPersonDTO person;

  private ApplicationPersonDTO appliedBy;

  @NonNull private ApplicationPeriodDTO period;

  @NonNull private VacationTypeDTO vacationType;

  private String reason;

  @NonNull private String status;

  private boolean teamInformed;

  @NonNull private Set<LocalDate> absentWorkingDays;
}
