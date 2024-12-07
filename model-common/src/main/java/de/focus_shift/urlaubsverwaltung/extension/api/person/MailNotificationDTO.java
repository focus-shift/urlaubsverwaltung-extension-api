package de.focus_shift.urlaubsverwaltung.extension.api.person;

/** Describes which kind of mail notifications a person can have. */
public enum MailNotificationDTO {
  NOTIFICATION_EMAIL_APPLICATION_MANAGEMENT_APPLIED,
  NOTIFICATION_EMAIL_APPLICATION_MANAGEMENT_ALLOWED,
  NOTIFICATION_EMAIL_APPLICATION_MANAGEMENT_REVOKED,
  NOTIFICATION_EMAIL_APPLICATION_MANAGEMENT_REJECTED,
  NOTIFICATION_EMAIL_APPLICATION_MANAGEMENT_TEMPORARY_ALLOWED,
  NOTIFICATION_EMAIL_APPLICATION_MANAGEMENT_CANCELLATION,
  NOTIFICATION_EMAIL_APPLICATION_MANAGEMENT_EDITED,
  NOTIFICATION_EMAIL_APPLICATION_MANAGEMENT_CONVERTED,
  NOTIFICATION_EMAIL_APPLICATION_MANAGEMENT_WAITING_REMINDER,

  NOTIFICATION_EMAIL_APPLICATION_MANAGEMENT_CANCELLATION_REQUESTED,

  NOTIFICATION_EMAIL_APPLICATION_APPLIED,
  NOTIFICATION_EMAIL_APPLICATION_ALLOWED,
  NOTIFICATION_EMAIL_APPLICATION_REVOKED,
  NOTIFICATION_EMAIL_APPLICATION_REJECTED,
  NOTIFICATION_EMAIL_APPLICATION_TEMPORARY_ALLOWED,
  NOTIFICATION_EMAIL_APPLICATION_CANCELLATION,
  NOTIFICATION_EMAIL_APPLICATION_EDITED,
  NOTIFICATION_EMAIL_APPLICATION_CONVERTED,
  NOTIFICATION_EMAIL_APPLICATION_UPCOMING,

  NOTIFICATION_EMAIL_APPLICATION_HOLIDAY_REPLACEMENT,
  NOTIFICATION_EMAIL_APPLICATION_HOLIDAY_REPLACEMENT_UPCOMING,

  NOTIFICATION_EMAIL_APPLICATION_COLLEAGUES_ALLOWED,
  NOTIFICATION_EMAIL_APPLICATION_COLLEAGUES_CANCELLATION,

  NOTIFICATION_EMAIL_PERSON_NEW_MANAGEMENT_ALL,

  NOTIFICATION_EMAIL_OVERTIME_MANAGEMENT_APPLIED,
  NOTIFICATION_EMAIL_OVERTIME_APPLIED_BY_MANAGEMENT,
  NOTIFICATION_EMAIL_OVERTIME_APPLIED,

  NOTIFICATION_EMAIL_SICK_NOTE_SUBMITTED_BY_USER_TO_USER,
  NOTIFICATION_EMAIL_SICK_NOTE_SUBMITTED_BY_USER_TO_MANAGEMENT,
  NOTIFICATION_EMAIL_SICK_NOTE_CREATED_BY_MANAGEMENT,
  NOTIFICATION_EMAIL_SICK_NOTE_CREATED_BY_MANAGEMENT_TO_MANAGEMENT,
  NOTIFICATION_EMAIL_SICK_NOTE_ACCEPTED_BY_MANAGEMENT_TO_USER,
  NOTIFICATION_EMAIL_SICK_NOTE_ACCEPTED_BY_MANAGEMENT_TO_MANAGEMENT,
  NOTIFICATION_EMAIL_SICK_NOTE_EDITED_BY_MANAGEMENT,
  NOTIFICATION_EMAIL_SICK_NOTE_CANCELLED_BY_MANAGEMENT,
  NOTIFICATION_EMAIL_SICK_NOTE_COLLEAGUES_CREATED,
  NOTIFICATION_EMAIL_SICK_NOTE_COLLEAGUES_CANCELLED;
}