package de.focus_shift.urlaubsverwaltung.extension.api.overtime;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.util.UUID;

/**
 * Published when a new overtime record has been created.
 *
 * @param id unique event identifier
 * @param sourceId identifier of the overtime record in the source system
 * @param createdAt timestamp when the event was created
 * @param tenantId identifier of the tenant
 * @param username unique username of the person (OIDC subject)
 * @param startDate start date of the overtime period
 * @param endDate end date of the overtime period
 * @param duration duration of the overtime
 */
public record OvertimeCreatedEventDTO(
    UUID id,
    Long sourceId,
    Instant createdAt,
    String tenantId,
    String username,
    LocalDate startDate,
    LocalDate endDate,
    Duration duration) {

  public static OvertimeCreatedEventDTO create(
      Long sourceId,
      String tenantId,
      String username,
      LocalDate startDate,
      LocalDate endDate,
      Duration duration) {
    return create(sourceId, tenantId, username, startDate, endDate, duration, Clock.systemUTC());
  }

  public static OvertimeCreatedEventDTO create(
      Long sourceId,
      String tenantId,
      String username,
      LocalDate startDate,
      LocalDate endDate,
      Duration duration,
      Clock clock) {
    return new OvertimeCreatedEventDTO(
        UUID.randomUUID(),
        sourceId,
        Instant.now(clock),
        tenantId,
        username,
        startDate,
        endDate,
        duration);
  }
}
