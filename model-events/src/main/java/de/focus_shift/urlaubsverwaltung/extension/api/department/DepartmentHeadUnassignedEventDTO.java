package de.focus_shift.urlaubsverwaltung.extension.api.department;

import java.time.Clock;
import java.time.Instant;
import java.util.UUID;

/**
 * Published when a department head has been unassigned from a department.
 *
 * @param id unique event identifier
 * @param sourceId identifier of the department in the source system
 * @param createdAt timestamp when the event was created
 * @param tenantId identifier of the tenant
 * @param departmentHeadUsername unique username of the unassigned department head (OIDC subject)
 */
public record DepartmentHeadUnassignedEventDTO(
    UUID id, Long sourceId, Instant createdAt, String tenantId, String departmentHeadUsername) {

  public static DepartmentHeadUnassignedEventDTO create(
      Long sourceId, String tenantId, String departmentHeadUsername) {
    return create(sourceId, tenantId, departmentHeadUsername, Clock.systemUTC());
  }

  public static DepartmentHeadUnassignedEventDTO create(
      Long sourceId, String tenantId, String departmentHeadUsername, Clock clock) {
    return new DepartmentHeadUnassignedEventDTO(
        UUID.randomUUID(), sourceId, Instant.now(clock), tenantId, departmentHeadUsername);
  }
}
