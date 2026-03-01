package de.focus_shift.urlaubsverwaltung.extension.api.overtime;

import java.time.Clock;
import java.time.Instant;
import java.util.UUID;

/**
 * Published when the overtime feature has been deactivated in the settings.
 *
 * @param id unique event identifier
 * @param createdAt timestamp when the event was created
 * @param tenantId identifier of the tenant
 */
public record OvertimeSettingsDeactivatedEventDTO(UUID id, Instant createdAt, String tenantId) {

  public static OvertimeSettingsDeactivatedEventDTO create(String tenantId) {
    return create(tenantId, Clock.systemUTC());
  }

  public static OvertimeSettingsDeactivatedEventDTO create(String tenantId, Clock clock) {
    return new OvertimeSettingsDeactivatedEventDTO(UUID.randomUUID(), Instant.now(clock), tenantId);
  }
}
