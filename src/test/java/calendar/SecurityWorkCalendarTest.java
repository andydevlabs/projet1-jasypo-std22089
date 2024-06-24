package calendar;

import andy.dev.labs.calendar.SecurityWorkCalendar;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SecurityWorkCalendarTest {
    @Test
    void number_of_working_days(){
        List<String> juneHolidays = List.of("17 Juin", "25 Juin", "26 Juin");
        var juneCalendar = new SecurityWorkCalendar(6, juneHolidays);
        assertEquals(30, juneCalendar.getNumberOfWorkingDays());
    }
}
