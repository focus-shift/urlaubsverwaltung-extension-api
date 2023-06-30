package de.focus_shift.urlaubsverwaltung.extension.api.application;

public enum DayLength {

    FULL(false),
    MORNING(true),
    NOON(true);
    private final boolean isHalfDay;

    DayLength(boolean isHalfDay) {
        this.isHalfDay = isHalfDay;
    }

    public boolean isHalfDay() {
        return isHalfDay;
    }
}


