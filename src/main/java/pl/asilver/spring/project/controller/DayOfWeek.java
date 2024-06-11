package pl.asilver.spring.project.controller;

public enum DayOfWeek {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");
    private final String name;

    DayOfWeek(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static DayOfWeek printDayInRussian(String englishName) {
        return DayOfWeek.valueOf(englishName.toUpperCase());
    }
}