package de.focus_shift.urlaubsverwaltung.extension.api.person;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.Set;
import org.junit.jupiter.api.Test;

class PersonDTOTest {

  @Test
  void happyPath() {

    final PersonDTO person =
        PersonDTO.builder()
            .username("61f886fd-e07c-4cc3-add0-d869520172e1")
            .lastName("Muster")
            .firstName("Marlene")
            .email("marlene.muster@example.org")
            .permissions(Set.of(RoleDTO.USER))
            .notifications(Set.of(MailNotificationDTO.NOTIFICATION_EMAIL_APPLICATION_APPLIED))
            .build();

    assertThat(person).isNotNull();
    assertThat(person.id()).isNull();
    assertThat(person.username()).isEqualTo("61f886fd-e07c-4cc3-add0-d869520172e1");
    assertThat(person.lastName()).isEqualTo("Muster");
    assertThat(person.firstName()).isEqualTo("Marlene");
    assertThat(person.email()).isEqualTo("marlene.muster@example.org");
    assertThat(person.enabled()).isTrue();
    assertThat(person.permissions()).containsOnly(RoleDTO.USER);
    assertThat(person.notifications())
        .containsOnly(MailNotificationDTO.NOTIFICATION_EMAIL_APPLICATION_APPLIED);
  }

  @Test
  void canBeEnabled() {
    assertThat(anyPerson().enable().enabled()).isTrue();
  }

  @Test
  void canBeDisabled() {
    assertThat(anyPerson().disable().enabled()).isFalse();
  }

  @Test
  void handlesMissingParams() {

    assertThatThrownBy(() -> PersonDTO.builder().build())
        .isInstanceOf(NullPointerException.class)
        .hasMessageStartingWith("username is marked non-null but is null");
  }

  private static PersonDTO anyPerson() {
    return PersonDTO.builder()
        .username("61f886fd-e07c-4cc3-add0-d869520172e1")
        .lastName("Muster")
        .firstName("Marlene")
        .email("marlene.muster@example.org")
        .permissions(Set.of(RoleDTO.USER))
        .notifications(Set.of(MailNotificationDTO.NOTIFICATION_EMAIL_APPLICATION_APPLIED))
        .build();
  }
}
