package de.focus_shift.urlaubsverwaltung.extension.api.person;

import java.time.Clock;
import java.time.Instant;
import java.util.UUID;
import lombok.NonNull;
import lombok.Value;

@Value
public class PersonCreatedEventDTO {
  @NonNull private UUID id;
  @NonNull private Instant createdAt;
  @NonNull private Integer personId;
  @NonNull private String username;
  @NonNull private String lastName;
  @NonNull private String firstName;
  @NonNull private String email;
  private boolean enabled;

  public static PersonCreatedEventDTO create(
      Integer personId,
      String username,
      String lastName,
      String firstName,
      String email,
      boolean enabled) {
    return create(personId, username, lastName, firstName, email, enabled, Clock.systemUTC());
  }

  public static PersonCreatedEventDTO create(
      Integer personId,
      String username,
      String lastName,
      String firstName,
      String email,
      boolean enabled,
      Clock clock) {
    return new PersonCreatedEventDTO(
        UUID.randomUUID(),
        Instant.now(clock),
        personId,
        username,
        lastName,
        firstName,
        email,
        enabled);
  }
}
