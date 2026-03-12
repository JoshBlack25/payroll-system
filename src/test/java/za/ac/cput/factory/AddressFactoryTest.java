package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Address;

import static org.junit.jupiter.api.Assertions.*;

public class AddressFactoryTest {

    @Test
    void testCreateAddress(){

        Address address = AddressFactory.createAddress(
                "10 Long street",
                "PO box 123"
        );

        assertNotNull(address);
        assertEquals("10 Long street", address.getStreetAddress());
    }

    @Test
    void testCreateAddressWithNullStreet(){

        Address address = AddressFactory.createAddress(
                null,
                "PO Box 123"
        );

        assertNull(address);
    }
}
