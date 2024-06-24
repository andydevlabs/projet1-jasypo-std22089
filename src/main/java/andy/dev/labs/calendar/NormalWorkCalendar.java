package andy.dev.labs.calendar;

import java.util.List;

public final class NormalWorkCalendar extends WorkCalendar {

    public NormalWorkCalendar(int month,
                              List<String> publicHolidayForTheMonth) {
        super(month, publicHolidayForTheMonth);
        this.numberOfWorkingDays = countDaysOfTheMonth() - countSundays() - countPublicHolidays();
        this.numberOfPublicHolidays = countPublicHolidays();
    }

}
