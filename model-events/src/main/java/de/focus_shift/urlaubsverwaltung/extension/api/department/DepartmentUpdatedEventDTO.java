package de.focus_shift.urlaubsverwaltung.extension.api.department;

import java.time.Clock;
import java.time.Instant;
import java.util.UUID;

/**
 * Published when a department has been updated.
 *
 * @param id unique event identifier
 * @param sourceId identifier of the department in the source system
 * @param createdAt timestamp when the event was created
 * @param tenantId identifier of the tenant
 * @param departmentName name of the department
 * @param memberCount number of members in the department after the update
 */
public record DepartmentUpdatedEventDTO(
    UUID id,
    Long sourceId,
    Instant createdAt,
    String tenantId,
    String departmentName,
    int memberCount) {

  public static DepartmentUpdatedEventDTO create(
      Long sourceId, String tenantId, String departmentName, int memberCount) {
    return create(sourceId, tenantId, departmentName, memberCount, Clock.systemUTC());
  }

  public static DepartmentUpdatedEventDTO create(
      Long sourceId, String tenantId, String departmentName, int memberCount, Clock clock) {
    return new DepartmentUpdatedEventDTO(
        UUID.randomUUID(), sourceId, Instant.now(clock), tenantId, departmentName, memberCount);
  }
}
