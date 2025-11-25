package de.focus_shift.urlaubsverwaltung.extension.api.person;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.Instant;
import org.junit.jupiter.api.Test;

class PersonUpdatedEventDTOTest {

  @Test
  void happyPath() {
    final PersonUpdatedEventDTO event =
        PersonUpdatedEventDTO.create(
            "default",
            1L,
            "61f886fd-e07c-4cc3-add0-d869520172e1",
            "Muster",
            "Marlene",
            "marlene.muster@example.org",
            true);

    assertThat(event).isNotNull();
    assertThat(event.id()).isNotNull();
    assertThat(event.createdAt()).isBeforeOrEqualTo(Instant.now());
    assertThat(event.tenantId()).isEqualTo("default");
    assertThat(event.username()).isEqualTo("61f886fd-e07c-4cc3-add0-d869520172e1");
    assertThat(event.lastName()).isEqualTo("Muster");
    assertThat(event.firstName()).isEqualTo("Marlene");
    assertThat(event.email()).isEqualTo("marlene.muster@example.org");
    assertThat(event.enabled()).isTrue();
  }
}
