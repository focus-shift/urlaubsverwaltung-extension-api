package de.focus_shift.urlaubsverwaltung.extension.api.department;

import java.time.Clock;
import java.time.Instant;
import java.util.UUID;

/**
 * Published when a new department has been created.
 *
 * @param id unique event identifier
 * @param sourceId identifier of the department in the source system
 * @param createdAt timestamp when the event was created
 * @param tenantId identifier of the tenant
 * @param departmentName name of the department
 * @param memberCount number of members in the department at creation time
 */
public record DepartmentCreatedEventDTO(
    UUID id,
    Long sourceId,
    Instant createdAt,
    String tenantId,
    String departmentName,
    int memberCount) {

  public static DepartmentCreatedEventDTO create(
      Long sourceId, String tenantId, String departmentName, int memberCount) {
    return create(sourceId, tenantId, departmentName, memberCount, Clock.systemUTC());
  }

  public static DepartmentCreatedEventDTO create(
      Long sourceId, String tenantId, String departmentName, int memberCount, Clock clock) {
    return new DepartmentCreatedEventDTO(
        UUID.randomUUID(), sourceId, Instant.now(clock), tenantId, departmentName, memberCount);
  }
}
