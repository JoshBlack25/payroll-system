package za.ac.cput.repository;

import za.ac.cput.domain.Employee;
import java.util.List;

public interface EmployeeRepository {

    Employee save(Employee employee);
    Employee findById(String empNum);
    List<Employee> findAll();
    void delete(String empNum);
}
