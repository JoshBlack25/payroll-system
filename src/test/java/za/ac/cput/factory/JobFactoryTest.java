package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Job;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class JobFactoryTest {

    @Test
    void testCreateJob(){

        Job job = JobFactory.createJob(
                "Software Developer",
                new ArrayList<>()
        );

        assertNotNull(job);
        assertEquals("Software Developer", job.getTitle());
    }

    @Test
    void testCreateJobWithNullTitle(){

        Job job = JobFactory.createJob(
                null,
                new ArrayList<>()
        );
        assertNull(job);
    }
}
