package de.focus_shift.urlaubsverwaltung.extension.api.department;

import java.time.Clock;
import java.time.Instant;
import java.util.UUID;

/**
 * Published when a department has been deleted.
 *
 * @param id unique event identifier
 * @param sourceId identifier of the department in the source system
 * @param createdAt timestamp when the event was created
 * @param tenantId identifier of the tenant
 */
public record DepartmentDeletedEventDTO(
    UUID id, Long sourceId, Instant createdAt, String tenantId) {

  public static DepartmentDeletedEventDTO create(Long sourceId, String tenantId) {
    return create(sourceId, tenantId, Clock.systemUTC());
  }

  public static DepartmentDeletedEventDTO create(Long sourceId, String tenantId, Clock clock) {
    return new DepartmentDeletedEventDTO(UUID.randomUUID(), sourceId, Instant.now(clock), tenantId);
  }
}
