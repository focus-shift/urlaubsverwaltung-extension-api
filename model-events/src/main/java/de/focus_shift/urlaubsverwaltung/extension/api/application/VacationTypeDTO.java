package de.focus_shift.urlaubsverwaltung.extension.api.application;

import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
public class VacationTypeDTO {
  @NonNull private String category;
  private boolean requiresApproval;
  @NonNull private String color;
  private boolean visibleToEveryone;
}
