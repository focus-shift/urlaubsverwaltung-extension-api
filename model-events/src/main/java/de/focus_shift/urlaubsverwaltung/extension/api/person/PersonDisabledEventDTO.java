package de.focus_shift.urlaubsverwaltung.extension.api.person;

import lombok.Builder;
import lombok.NonNull;

import java.time.Clock;
import java.time.Instant;
import java.util.UUID;

@Builder
public record PersonDisabledEventDTO(
        UUID id,
        @NonNull Instant createdAt,
        @NonNull String tenantId,
        @NonNull Long personId,
        @NonNull String username,
        @NonNull String lastName,
        @NonNull String firstName,
        @NonNull String email,
        boolean enabled
) {

    public static PersonDisabledEventDTO create(
            String tenantId,
            Long personId,
            String username,
            String lastName,
            String firstName,
            String email
    ) {
        return create(tenantId, personId, username, lastName, firstName, email, Clock.systemUTC());
    }

    public static PersonDisabledEventDTO create(
            String tenantId,
            Long personId,
            String username,
            String lastName,
            String firstName,
            String email,
            Clock clock
    ) {
        return new PersonDisabledEventDTO(
                UUID.randomUUID(),
                Instant.now(clock),
                tenantId,
                personId,
                username,
                lastName,
                firstName,
                email,
                false
        );
    }
}
