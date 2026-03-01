package de.focus_shift.urlaubsverwaltung.extension.api.person;

import java.time.Clock;
import java.time.Instant;
import java.util.List;
import java.util.UUID;

/**
 * Published when a person's permissions have been changed.
 *
 * @param id unique event identifier
 * @param createdAt timestamp when the event was created
 * @param tenantId identifier of the tenant
 * @param username unique username of the person (OIDC subject)
 * @param currentPermissions permissions after the change (e.g. "USER", "OFFICE")
 * @param grantedPermissions permissions that were added
 * @param revokedPermissions permissions that were removed
 */
public record PersonPermissionsChangedEventDTO(
    UUID id,
    Instant createdAt,
    String tenantId,
    String username,
    List<String> currentPermissions,
    List<String> grantedPermissions,
    List<String> revokedPermissions) {

  public static PersonPermissionsChangedEventDTO create(
      String tenantId,
      String username,
      List<String> currentPermissions,
      List<String> grantedPermissions,
      List<String> revokedPermissions) {
    return create(
        tenantId,
        username,
        currentPermissions,
        grantedPermissions,
        revokedPermissions,
        Clock.systemUTC());
  }

  public static PersonPermissionsChangedEventDTO create(
      String tenantId,
      String username,
      List<String> currentPermissions,
      List<String> grantedPermissions,
      List<String> revokedPermissions,
      Clock clock) {
    return new PersonPermissionsChangedEventDTO(
        UUID.randomUUID(),
        Instant.now(clock),
        tenantId,
        username,
        currentPermissions,
        grantedPermissions,
        revokedPermissions);
  }
}
