package andy.dev.labs.employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@ToString
public class Employee {
    private String firstName;
    private String lastName;
    private String identificationNumber;
    private LocalDate dateOfBirth;
    private LocalDate hiringDate;
    private LocalDate endOfContract;
    private double salary;
    private CategoryName categoryName;
}
