
package calendar;


import andy.dev.labs.calendar.NormalWorkCalendar;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NormalWorkCalendarTest {
    @Test
    void number_of_working_days(){
        List<String> juneHolidays = List.of("17 Juin", "25 Juin", "26 Juin");
        var juneCalendar = new NormalWorkCalendar(6, juneHolidays);
        assertEquals(22, juneCalendar.getNumberOfWorkingDays());
    }
}
