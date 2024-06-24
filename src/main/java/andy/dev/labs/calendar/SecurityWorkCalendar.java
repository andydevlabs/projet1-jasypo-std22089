package andy.dev.labs.calendar;

import java.util.List;


public final class SecurityWorkCalendar extends WorkCalendar{
    public SecurityWorkCalendar(int month, List<String> publicHolidayForTheMonth) {
        super(month, publicHolidayForTheMonth);
        this.numberOfWorkingDays = countDaysOfTheMonth();
        this.numberOfPublicHolidays = countPublicHolidays();
    }
}
