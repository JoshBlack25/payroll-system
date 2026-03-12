package za.ac.cput.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.*;
import za.ac.cput.factory.*;
import za.ac.cput.repository.impl.EmployeeRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeRepositoryTest {

    private EmployeeRepository repository;
    private Employee employee;

    @BeforeEach
    void setUp(){

        repository = new EmployeeRepositoryImpl();

        ContactDetails contact = ContactDetailsFactory.createContactDetails(
                "0821234567",
                "user@email.com",
                "0211234567"
        );

        Address address = AddressFactory.createAddress(
                "10 Long Street",
                "PO Box 123"
        );

        Position position = PositionFactory.createPosition(
                "DEV001",
                PositionStatus.OPEN
        );

        employee = EmployeeFactory.createEmployee(
                "EMP001",
                "John Doe",
                EmploymentType.PERMANENT,
                "South African",
                contact,
                address,
                position,
                new ArrayList<>()
        );
    }

    @Test
    void testSave(){

        Employee savedEmployee = repository.save(employee);

        assertNotNull(savedEmployee);
        assertEquals("EMP001", savedEmployee.getEmpNum());
    }

    @Test
    void testFindById() {

        repository.save(employee);

        Employee found = repository.findById("EMP001");

        assertNotNull(found);
        assertEquals("EMP001", found.getEmpNum());
    }

    @Test
    void testFindAll() {

        repository.save(employee);

        List<Employee> employees = repository.findAll();

        assertEquals(1, employees.size());
    }

    @Test
    void testDelete() {

        repository.save(employee);
        repository.delete("EMP001");

        Employee deleted = repository.findById("EMP001");

        assertNull(deleted);
    }
}
