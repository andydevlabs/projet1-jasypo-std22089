package andy.dev.labs.calendar;


import lombok.Getter;
import lombok.ToString;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.List;

@ToString
@Getter

abstract sealed class WorkCalendar permits NormalWorkCalendar, SecurityWorkCalendar{
    protected final int month;
    protected final List<String> publicHolidayForTheMonth;
    protected int numberOfWorkingDays;
    protected int numberOfPublicHolidays;

    public WorkCalendar(int month, List<String> publicHolidayForTheMonth) {
        this.month = month;
        this.publicHolidayForTheMonth = publicHolidayForTheMonth;
    }

    protected int countSundays() {
        LocalDate firstDateOfTheMonth = LocalDate.now().withMonth(month).with(TemporalAdjusters.firstDayOfMonth());
        LocalDate lastDateOfTheMonth = firstDateOfTheMonth.with(TemporalAdjusters.lastDayOfMonth());
        return (int) firstDateOfTheMonth.datesUntil(lastDateOfTheMonth.plusDays(1))
                .filter(date -> date.getDayOfWeek() == DayOfWeek.SUNDAY)
                .count();
    }

    protected int countDaysOfTheMonth(){
        Calendar calendar = Calendar.getInstance();
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    protected int countPublicHolidays() {
        return publicHolidayForTheMonth.size();
    }

}
