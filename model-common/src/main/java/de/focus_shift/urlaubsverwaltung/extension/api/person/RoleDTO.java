package de.focus_shift.urlaubsverwaltung.extension.api.person;

/** Enum describing possible types of rights/roles a user may have. */
public enum RoleDTO {
  USER,
  DEPARTMENT_HEAD,
  SECOND_STAGE_AUTHORITY,
  BOSS,
  OFFICE,
  ADMIN,
  APPLICATION_ADD,
  APPLICATION_CANCEL,
  APPLICATION_CANCELLATION_REQUESTED,
  SICK_NOTE_VIEW,
  SICK_NOTE_ADD,
  SICK_NOTE_EDIT,
  SICK_NOTE_CANCEL,
  SICK_NOTE_COMMENT;
}
