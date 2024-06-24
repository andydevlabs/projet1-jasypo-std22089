package andy.dev.labs.category;

import andy.dev.labs.calendar.NormalWorkCalendar;

public final class Normal extends Category{
    private final NormalWorkCalendar normalWorkCalendar;

    public Normal(NormalWorkCalendar normalWorkCalendar){
        this.normalWorkCalendar = normalWorkCalendar;
    }

    @Override
    public int calculateWorkingHour(){
        return (normalWorkCalendar.getNumberOfWorkingDays() * 8);
    }
}
