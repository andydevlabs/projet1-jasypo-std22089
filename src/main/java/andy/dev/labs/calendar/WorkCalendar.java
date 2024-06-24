package andy.dev.labs.calendar;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class workCalendar{
    private int month;
    private int numberOfWorkingDays;
    private int DaysOfTheMonth;
    private int numberOfPublicHolidays;
    private List<String> publicHolidayForTheMonth;


    private int countSundays() {
        LocalDate firstDateOfTheMonth = LocalDate.now().withMonth(month).with(TemporalAdjusters.firstDayOfMonth());
        LocalDate lastDateOfTheMonth = firstDateOfTheMonth.with(TemporalAdjusters.lastDayOfMonth());
        return (int) firstDateOfTheMonth.datesUntil(lastDateOfTheMonth.plusDays(1))
                .filter(date -> date.getDayOfWeek() == DayOfWeek.SUNDAY)
                .count();
    }

    public void setNumberOfSundays() {
        this.numberOfSundays = countSundays();
    }
}


// return new JuneCalendar(setWorkingDays, setNumberOfPublicHolidays)