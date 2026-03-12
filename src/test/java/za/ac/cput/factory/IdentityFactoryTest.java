package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Identity;

import static org.junit.jupiter.api.Assertions.*;

public class IdentityFactoryTest {

    @Test
    void testCreateIdentity(){

        Identity identity = IdentityFactory.createIdentity(
                "Passport",
                "ZG1234"
        );

        assertNotNull(identity);
        assertEquals("Passport", identity.getIdentityType());
    }

    @Test
    void testCreateIdentityWithNullType(){

        Identity identity = IdentityFactory.createIdentity(
                null,
                "ZG1234"
        );

        assertNull(identity);
    }

}
