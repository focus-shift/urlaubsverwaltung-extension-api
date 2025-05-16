package de.focus_shift.urlaubsverwaltung.extension.api.application;

import java.time.Duration;
import java.time.Instant;
import java.util.UUID;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
public class ApplicationAllowedEventDTO {
  @NonNull private UUID id;

  @NonNull private Long sourceId;

  @NonNull private Instant createdAt;

  @NonNull private String tenantId;

  @NonNull private ApplicationPersonDTO person;

  private ApplicationPersonDTO appliedBy;

  private ApplicationPersonDTO allowedBy;

  private boolean twoStageApproval;

  @NonNull private ApplicationPeriodDTO period;

  @NonNull private VacationTypeDTO vacationType;

  private String reason;

  @NonNull private String status;

  private boolean teamInformed;

  private Duration hours;
}
