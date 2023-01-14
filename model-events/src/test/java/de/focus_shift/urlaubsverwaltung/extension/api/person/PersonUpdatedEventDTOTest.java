package de.focus_shift.urlaubsverwaltung.extension.api.person;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.Instant;
import org.junit.jupiter.api.Test;

class PersonUpdatedEventDTOTest {

  @Test
  void happyPath() {
    final PersonUpdatedEventDTO event =
        PersonUpdatedEventDTO.create(
            1,
            "61f886fd-e07c-4cc3-add0-d869520172e1",
            "Muster",
            "Marlene",
            "marlene.muster@example.org",
            true);

    assertThat(event).isNotNull();
    assertThat(event.getId()).isNotNull();
    assertThat(event.getCreatedAt()).isBeforeOrEqualTo(Instant.now());
    assertThat(event.getUsername()).isEqualTo("61f886fd-e07c-4cc3-add0-d869520172e1");
    assertThat(event.getLastName()).isEqualTo("Muster");
    assertThat(event.getFirstName()).isEqualTo("Marlene");
    assertThat(event.getEmail()).isEqualTo("marlene.muster@example.org");
    assertThat(event.isEnabled()).isTrue();
  }
}
