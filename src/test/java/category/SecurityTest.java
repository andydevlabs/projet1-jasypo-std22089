package category;

import andy.dev.labs.calendar.SecurityWorkCalendar;
import andy.dev.labs.category.Security;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SecurityTest {
    @Test
    void rakoto_security_june_working_hour(){
        List<String> juneHolidays = List.of("17 Juin", "25 Juin", "26 Juin");
        var june = new SecurityWorkCalendar(6, juneHolidays);
        var Rakoto = new Security(june, false);
        assertEquals(300, Rakoto.calculateWorkingHour());
    }

    @Test
    void rabe_night_security_june_working_hour(){
        List<String> juneHolidays = List.of("17 Juin", "25 Juin", "26 Juin");
        var june = new SecurityWorkCalendar(6, juneHolidays);
        var Rabe = new Security(june, true);
        assertEquals(420, Rabe.calculateWorkingHour());
    }


}
