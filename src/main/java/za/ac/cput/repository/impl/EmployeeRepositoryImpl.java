package za.ac.cput.repository.impl;

import za.ac.cput.domain.Employee;
import za.ac.cput.repository.EmployeeRepository;

import java.util.*;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    private Map<String, Employee> employeeDB;

    public EmployeeRepositoryImpl() {
        employeeDB = new HashMap<>();
    }

    @Override
    public Employee save(Employee employee) {

        if(employee == null){
            return null;
        }

        employeeDB.put(employee.getEmpNum(), employee);
        return employee;
    }

    @Override
    public Employee findById(String employeeNumber) {
        return employeeDB.get(employeeNumber);
    }

    @Override
    public List<Employee> findAll() {
        return new ArrayList<>(employeeDB.values());
    }

    @Override
    public void delete(String employeeNumber) {
        employeeDB.remove(employeeNumber);
    }
}