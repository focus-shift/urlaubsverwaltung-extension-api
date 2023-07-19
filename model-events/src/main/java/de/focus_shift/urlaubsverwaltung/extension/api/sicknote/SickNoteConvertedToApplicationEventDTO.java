package de.focus_shift.urlaubsverwaltung.extension.api.sicknote;

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
public class SickNoteConvertedToApplicationEventDTO {
  @NonNull private UUID id;

  @NonNull private Integer sourceId;

  @NonNull private Instant createdAt;

  @NonNull private String tenantId;

  @NonNull private SickNotePersonDTO person;

  @NonNull private SickNotePersonDTO applier;

  @NonNull private String type;
  @NonNull private String status;

  @NonNull private SickNotePeriodDTO period;

  private SickNotePeriodDTO medicalCertificatePeriod;

  @NonNull private Set<LocalDate> absentWorkingDays;
}
