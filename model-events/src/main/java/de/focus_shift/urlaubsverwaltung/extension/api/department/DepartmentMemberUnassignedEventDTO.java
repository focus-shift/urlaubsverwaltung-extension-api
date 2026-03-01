package de.focus_shift.urlaubsverwaltung.extension.api.department;

import java.time.Clock;
import java.time.Instant;
import java.util.UUID;

/**
 * Published when a member has been unassigned from a department.
 *
 * @param id unique event identifier
 * @param sourceId identifier of the department in the source system
 * @param createdAt timestamp when the event was created
 * @param tenantId identifier of the tenant
 * @param username unique username of the unassigned member (OIDC subject)
 */
public record DepartmentMemberUnassignedEventDTO(
    UUID id, Long sourceId, Instant createdAt, String tenantId, String username) {

  public static DepartmentMemberUnassignedEventDTO create(
      Long sourceId, String tenantId, String username) {
    return create(sourceId, tenantId, username, Clock.systemUTC());
  }

  public static DepartmentMemberUnassignedEventDTO create(
      Long sourceId, String tenantId, String username, Clock clock) {
    return new DepartmentMemberUnassignedEventDTO(
        UUID.randomUUID(), sourceId, Instant.now(clock), tenantId, username);
  }
}
