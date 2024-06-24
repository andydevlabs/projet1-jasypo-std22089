package andy.dev.labs.employee;

public sealed class Category permits (Superior, Normal, Security, Driver){
    private String categoryName;
    private int weeklyNormalWorkingHour;
    private double weeklySalary;
    private double compensation;
}
