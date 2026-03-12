package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.ContactDetails;

import static org.junit.jupiter.api.Assertions.*;

public class ContactDetailsFactoryTest {

    @Test
    void testCreateContactDetails(){

        ContactDetails contact = ContactDetailsFactory.createContactDetails(
                "0821234567",
                "user@email.com",
                "0211234567"
        );

        assertNotNull(contact);
        assertEquals("0821234567", contact.getCellPhone());
    }

    @Test
    void testCreateContactDetailsWithNullCellPhone(){

        ContactDetails contact = ContactDetailsFactory.createContactDetails(
                null,
                "user@email.com",
                "0211234567"
        );
        assertNull(contact);
    }
}
