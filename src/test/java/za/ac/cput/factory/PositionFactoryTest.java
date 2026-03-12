package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Position;
import za.ac.cput.domain.PositionStatus;

import static org.junit.jupiter.api.Assertions.*;

public class PositionFactoryTest {

    @Test
    void testCreatePosition(){

        Position position = PositionFactory.createPosition(
                "DEV001",
                PositionStatus.OPEN
        );

        assertNotNull(position);
        assertEquals("DEV001", position.getPositionCode());
    }

    @Test
    void testCreatePositionWithNullCode(){

        Position position = PositionFactory.createPosition(
                null,
                PositionStatus.OPEN
        );

        assertNull(position);
    }
}
