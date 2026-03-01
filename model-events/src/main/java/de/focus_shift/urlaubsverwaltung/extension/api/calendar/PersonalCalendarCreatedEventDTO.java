package de.focus_shift.urlaubsverwaltung.extension.api.calendar;

import java.time.Clock;
import java.time.Instant;
import java.util.UUID;

/**
 * Published when a personal calendar has been created for a person.
 *
 * @param id unique event identifier
 * @param createdAt timestamp when the event was created
 * @param tenantId identifier of the tenant
 * @param username unique username of the person (OIDC subject)
 */
public record PersonalCalendarCreatedEventDTO(
    UUID id, Instant createdAt, String tenantId, String username) {

  public static PersonalCalendarCreatedEventDTO create(String tenantId, String username) {
    return create(tenantId, username, Clock.systemUTC());
  }

  public static PersonalCalendarCreatedEventDTO create(
      String tenantId, String username, Clock clock) {
    return new PersonalCalendarCreatedEventDTO(
        UUID.randomUUID(), Instant.now(clock), tenantId, username);
  }
}
