package de.focus_shift.urlaubsverwaltung.extension.api.person;

import java.util.Set;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

@Value
@Builder
public class PersonDTO {
  private Long id;
  @NonNull private String username;
  @NonNull private String lastName;

  @NonNull private String firstName;
  @NonNull private String email;
  @Builder.Default private boolean enabled = true;
  @NonNull private Set<RoleDTO> permissions;
  @NonNull private Set<MailNotificationDTO> notifications;

  public PersonDTO disable() {
    return new PersonDTO(
        getId(),
        getUsername(),
        getLastName(),
        getFirstName(),
        getEmail(),
        false,
        Set.of(),
        getNotifications());
  }

  public PersonDTO enable() {
    return new PersonDTO(
        getId(),
        getUsername(),
        getLastName(),
        getFirstName(),
        getEmail(),
        true,
        Set.of(RoleDTO.USER),
        getNotifications());
  }
}
