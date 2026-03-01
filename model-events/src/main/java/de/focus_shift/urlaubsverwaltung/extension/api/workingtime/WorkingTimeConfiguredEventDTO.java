package de.focus_shift.urlaubsverwaltung.extension.api.workingtime;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

/**
 * Published when a person's working time has been configured.
 *
 * @param id unique event identifier
 * @param createdAt timestamp when the event was created
 * @param tenantId identifier of the tenant
 * @param username unique username of the person (OIDC subject)
 * @param validFrom date from which the working time configuration is valid
 * @param workingDays list of working day names (e.g. "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY",
 *     "FRIDAY")
 * @param federalState the federal state for public holiday calculation (e.g.
 *     "GERMANY_BADEN_WUERTTEMBERG"), {@code null} if system default is used
 */
public record WorkingTimeConfiguredEventDTO(
    UUID id,
    Instant createdAt,
    String tenantId,
    String username,
    LocalDate validFrom,
    List<String> workingDays,
    String federalState) {

  public static WorkingTimeConfiguredEventDTO create(
      String tenantId,
      String username,
      LocalDate validFrom,
      List<String> workingDays,
      String federalState) {
    return create(tenantId, username, validFrom, workingDays, federalState, Clock.systemUTC());
  }

  public static WorkingTimeConfiguredEventDTO create(
      String tenantId,
      String username,
      LocalDate validFrom,
      List<String> workingDays,
      String federalState,
      Clock clock) {
    return new WorkingTimeConfiguredEventDTO(
        UUID.randomUUID(),
        Instant.now(clock),
        tenantId,
        username,
        validFrom,
        workingDays,
        federalState);
  }
}
