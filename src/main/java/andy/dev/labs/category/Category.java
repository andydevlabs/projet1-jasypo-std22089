package andy.dev.labs.category;

import andy.dev.labs.employee.CategoryName;
import lombok.Getter;

@Getter
public abstract sealed class Category permits Superior, Normal, Security, Driver{
    private CategoryName categoryName;
    private int weeklyNormalWorkingHour;
    private double weeklySalary;
    private double compensation;

    abstract int calculateWorkingHour();
}
