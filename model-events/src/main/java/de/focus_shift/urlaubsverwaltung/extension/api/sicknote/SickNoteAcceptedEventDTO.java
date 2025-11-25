package de.focus_shift.urlaubsverwaltung.extension.api.sicknote;

import lombok.Builder;
import lombok.NonNull;

import java.time.Instant;
import java.util.UUID;

@Builder
public record SickNoteAcceptedEventDTO(
        @NonNull UUID id,
        @NonNull Long sourceId,
        @NonNull Instant createdAt,
        @NonNull String tenantId,
        @NonNull SickNotePersonDTO person,
        SickNotePersonDTO applier,
        @NonNull String type,
        @NonNull String status,
        @NonNull SickNotePeriodDTO period,
        SickNotePeriodDTO medicalCertificatePeriod
) {
}
