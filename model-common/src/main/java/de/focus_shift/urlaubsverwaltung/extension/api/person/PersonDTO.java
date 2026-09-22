package de.focus_shift.urlaubsverwaltung.extension.api.person;

import lombok.Builder;
import lombok.NonNull;

import java.time.Instant;
import java.util.Set;

import static de.focus_shift.urlaubsverwaltung.extension.api.person.RoleDTO.USER;

public record PersonDTO(
        Long id,
        Instant createdAt,
        @NonNull String username,
        @NonNull String lastName,
        @NonNull String firstName,
        @NonNull String email,
        Boolean enabled,
        @NonNull Set<RoleDTO> permissions,
        @NonNull Set<MailNotificationDTO> notifications
) {

    @Builder
    public PersonDTO(
            Long id,
            Instant createdAt,
            @NonNull String username,
            @NonNull String lastName,
            @NonNull String firstName,
            @NonNull String email,
            Boolean enabled,
            @NonNull Set<RoleDTO> permissions,
            @NonNull Set<MailNotificationDTO> notifications
    ) {
        this.id = id;
        this.createdAt = createdAt;
        this.username = username;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.enabled = enabled != null ? enabled : Boolean.TRUE;
        this.permissions = permissions;
        this.notifications = notifications;
    }

    @Builder
    public PersonDTO(
            Long id,
            @NonNull String username,
            @NonNull String lastName,
            @NonNull String firstName,
            @NonNull String email,
            @NonNull Set<RoleDTO> permissions,
            @NonNull Set<MailNotificationDTO> notifications
    ) {
        this(id, null, username, lastName, firstName, email, true, permissions, notifications);
    }

    public PersonDTO disable() {
        return new PersonDTO(
                id,
                createdAt,
                username,
                lastName,
                firstName,
                email,
                false,
                Set.of(),
                notifications
        );
    }

    public PersonDTO enable() {
        return new PersonDTO(
                id,
                createdAt,
                username,
                lastName,
                firstName,
                email,
                true,
                Set.of(USER),
                notifications
        );
    }
}
