package andy.dev.labs.category;


import andy.dev.labs.calendar.SecurityWorkCalendar;

import java.util.List;

public final class Security extends Category{
    private boolean nightShift;

    private SecurityWorkCalendar securityWorkCalendar;

    public Security(SecurityWorkCalendar securityWorkCalendar, boolean nightShift) {
        this.securityWorkCalendar = securityWorkCalendar;
        this.nightShift = nightShift;
    }

    @Override
    public int calculateWorkingHour() {
        if(nightShift) {
            return (securityWorkCalendar.getNumberOfWorkingDays() * 14);
        } else {
            return securityWorkCalendar.getNumberOfWorkingDays() * 10;
        }
    }

}
