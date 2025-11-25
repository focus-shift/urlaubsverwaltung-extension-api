package de.focus_shift.urlaubsverwaltung.extension.api.person;

import lombok.Builder;
import lombok.NonNull;

import java.time.Clock;
import java.time.Instant;
import java.util.UUID;

@Builder
public record PersonUpdatedEventDTO(
        @NonNull UUID id,
        @NonNull Instant createdAt,
        @NonNull String tenantId,
        @NonNull Long personId,
        @NonNull String username,
        @NonNull String lastName,
        @NonNull String firstName,
        @NonNull String email,
        @NonNull boolean enabled
) {
    public static PersonUpdatedEventDTO create(
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

    public static PersonUpdatedEventDTO create(
            String tenantId,
            Long personId,
            String username,
            String lastName,
            String firstName,
            String email,
            boolean enabled,
            Clock clock
    ) {
        return new PersonUpdatedEventDTO(
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
