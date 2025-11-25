package de.focus_shift.urlaubsverwaltung.extension.api.person;

import lombok.Builder;
import lombok.NonNull;

import java.time.Clock;
import java.time.Instant;
import java.util.UUID;

@Builder
public record PersonCreatedEventDTO(
        @NonNull UUID id,
        @NonNull Instant createdAt,
        @NonNull String tenantId,
        @NonNull Long personId,
        @NonNull String username,
        @NonNull String lastName,
        @NonNull String firstName,
        @NonNull String email,
        boolean enabled
) {
    public static PersonCreatedEventDTO create(
            String tenantId,
            Long personId,
            String username,
            String lastName,
            String firstName,
            String email,
            boolean enabled
    ) {
        return create(
                tenantId, personId, username, lastName, firstName, email, enabled, Clock.systemUTC());
    }

    public static PersonCreatedEventDTO create(
            String tenantId,
            Long personId,
            String username,
            String lastName,
            String firstName,
            String email,
            boolean enabled,
            Clock clock
    ) {
        return new PersonCreatedEventDTO(
                UUID.randomUUID(),
                Instant.now(clock),
                tenantId,
                personId,
                username,
                lastName,
                firstName,
                email,
                enabled);
    }
}
