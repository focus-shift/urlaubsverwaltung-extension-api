package de.focus_shift.urlaubsverwaltung.extension.api.person;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.Instant;
import org.junit.jupiter.api.Test;

class PersonDeletedEventDTOTest {
  @Test
  void happyPath() {
    final PersonDeletedEventDTO event =
        PersonDeletedEventDTO.create(
            "default",
            1L,
            "61f886fd-e07c-4cc3-add0-d869520172e1",
            "Muster",
            "Marlene",
            "marlene.muster@example.org",
            true);

    assertThat(event).isNotNull();
    assertThat(event.getId()).isNotNull();
    assertThat(event.getCreatedAt()).isBeforeOrEqualTo(Instant.now());
    assertThat(event.getTenantId()).isEqualTo("default");
    assertThat(event.getUsername()).isEqualTo("61f886fd-e07c-4cc3-add0-d869520172e1");
    assertThat(event.getLastName()).isEqualTo("Muster");
    assertThat(event.getFirstName()).isEqualTo("Marlene");
    assertThat(event.getEmail()).isEqualTo("marlene.muster@example.org");
    assertThat(event.isEnabled()).isTrue();
  }
}
