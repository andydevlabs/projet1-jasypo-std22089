package employee;

import andy.dev.labs.employee.Employee;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static andy.dev.labs.employee.CategoryName.SECURITY;

class EmployeeTest {
    @Test
    void employee_rakoto(){
        var dateOfBirth = LocalDate.of(1980,5,7);
        var hiringDate = LocalDate.of(2022,4,3);
        var endOfContract = LocalDate.of(2025,7,3);
        var Rakoto = new Employee(
                "Rakoto",
                "DEBA",
                "AZER1",
                dateOfBirth,
                hiringDate,
                endOfContract,
                100000.0,
                SECURITY
        );
    }

    void employee_rabe(){
        var dateOfBirth = LocalDate.of(1978,7,3);
        var hiringDate = LocalDate.of(2022,5,12);
        var endOfContract = LocalDate.of(2025,7,3);
        var Rakoto = new Employee(
                "Rabe",
                "KILAO",
                "AZER2",
                dateOfBirth,
                hiringDate,
                endOfContract,
                100000.0,
                SECURITY
        );
    }
}
