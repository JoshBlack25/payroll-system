package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeFactoryTest {

    @Test
    void testCreateEmployee() {

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

        Employee employee = EmployeeFactory.createEmployee(
                "EMP001",
                "John Doe",
                EmploymentType.PERMANENT,
                "South African",
                contact,
                address,
                position,
                new ArrayList<>()
        );

        assertNotNull(employee);
        assertEquals("EMP001", employee.getEmpNum());
    }

    @Test
    void testCreateEmployeeWithNullEmpNum() {

        Employee employee = EmployeeFactory.createEmployee(
                null,
                "John Doe",
                EmploymentType.PERMANENT,
                "South African",
                null,
                null,
                null,
                null
        );

        assertNull(employee);
    }
}
