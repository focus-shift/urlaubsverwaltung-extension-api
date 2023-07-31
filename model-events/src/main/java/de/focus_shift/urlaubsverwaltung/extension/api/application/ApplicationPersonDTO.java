package de.focus_shift.urlaubsverwaltung.extension.api.application;

import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
public class ApplicationPersonDTO {
  @NonNull private Long personId;
  @NonNull private String username;
}
