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
            .build();

    assertThat(person).isNotNull();
    assertThat(person.getId()).isNull();
    assertThat(person.getUsername()).isEqualTo("61f886fd-e07c-4cc3-add0-d869520172e1");
    assertThat(person.getLastName()).isEqualTo("Muster");
    assertThat(person.getFirstName()).isEqualTo("Marlene");
    assertThat(person.getEmail()).isEqualTo("marlene.muster@example.org");
    assertThat(person.isEnabled()).isTrue();
    assertThat(person.getPermissions()).containsOnly(RoleDTO.USER);
  }

  @Test
  void canBeEnabled() {
    assertThat(anyPerson().enable().isEnabled()).isTrue();
  }

  @Test
  void canBeDisabled() {
    assertThat(anyPerson().disable().isEnabled()).isFalse();
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
        .build();
  }
}
