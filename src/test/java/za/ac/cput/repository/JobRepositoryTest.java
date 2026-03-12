package za.ac.cput.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Job;
import za.ac.cput.factory.JobFactory;
import za.ac.cput.repository.impl.JobRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class JobRepositoryTest {

    private JobRepository repository;
    private Job job;

    @BeforeEach
    void setUp() {

        repository = new JobRepositoryImpl();

        job = JobFactory.createJob(
                "Software Developer",
                new ArrayList<>()
        );
    }

    @Test
    void testSave() {

        Job savedJob = repository.save(job);

        assertNotNull(savedJob);
        assertEquals("Software Developer", savedJob.getTitle());
    }

    @Test
    void testFindByTitle() {

        repository.save(job);

        Job found = repository.findByTitle("Software Developer");

        assertNotNull(found);
        assertEquals("Software Developer", found.getTitle());
    }

    @Test
    void testFindAll() {

        repository.save(job);

        List<Job> jobs = repository.findAll();

        assertEquals(1, jobs.size());
    }
}
