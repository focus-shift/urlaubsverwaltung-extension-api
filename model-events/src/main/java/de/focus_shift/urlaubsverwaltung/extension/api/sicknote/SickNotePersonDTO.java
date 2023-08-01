package de.focus_shift.urlaubsverwaltung.extension.api.sicknote;

import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
public class SickNotePersonDTO {
  @NonNull private Long personId;
  @NonNull private String username;
}
