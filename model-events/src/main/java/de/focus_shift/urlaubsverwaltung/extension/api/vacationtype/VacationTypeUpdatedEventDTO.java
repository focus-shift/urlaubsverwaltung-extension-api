package de.focus_shift.urlaubsverwaltung.extension.api.vacationtype;

import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
public class VacationTypeUpdatedEventDTO {
  @NonNull UUID id;
  @NonNull String tenantId;
  @NonNull Long sourceId;
  @NonNull String category;
  boolean requiresApprovalToApply;
  boolean requiresApprovalToCancel;
  @NonNull String color;
  boolean visibleToEveryone;
  @NonNull Map<Locale, String> label;
}
