package de.focus_shift.urlaubsverwaltung.extension.api.person;

import java.time.Clock;
import java.time.Instant;
import java.util.UUID;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
public class PersonUpdatedEventDTO {
  @NonNull private UUID id;
  @NonNull private Instant createdAt;
  @NonNull private String tenantId;
  @NonNull private Long personId;
  @NonNull private String username;
  @NonNull private String lastName;
  @NonNull private String firstName;
  @NonNull private String email;
  @NonNull private boolean enabled;

  public static PersonUpdatedEventDTO create(
      String tenantId,
      Long personId,
      String username,
      String lastName,
      String firstName,
      String email,
      boolean enabled) {
    return create(
        tenantId, personId, username, lastName, firstName, email, enabled, Clock.systemUTC());
  }

  public static PersonUpdatedEventDTO create(
      String tenantId,
      Long personId,
      String username,
      String lastName,
      String firstName,
      String email,
      boolean enabled,
      Clock clock) {
    return new PersonUpdatedEventDTO(
        UUID.randomUUID(),
        Instant.now(clock),
        tenantId,
        personId,
        username,
        lastName,
        firstName,
        email,
        enabled);
  }
}
