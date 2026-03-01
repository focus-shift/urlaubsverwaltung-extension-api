package de.focus_shift.urlaubsverwaltung.extension.api.calendar;

import java.time.Clock;
import java.time.Instant;
import java.util.UUID;

/**
 * Published when the company calendar has been disabled.
 *
 * @param id unique event identifier
 * @param createdAt timestamp when the event was created
 * @param tenantId identifier of the tenant
 */
public record CompanyCalendarDisabledEventDTO(UUID id, Instant createdAt, String tenantId) {

  public static CompanyCalendarDisabledEventDTO create(String tenantId) {
    return create(tenantId, Clock.systemUTC());
  }

  public static CompanyCalendarDisabledEventDTO create(String tenantId, Clock clock) {
    return new CompanyCalendarDisabledEventDTO(UUID.randomUUID(), Instant.now(clock), tenantId);
  }
}
