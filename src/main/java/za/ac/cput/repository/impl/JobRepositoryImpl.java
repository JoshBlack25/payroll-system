package za.ac.cput.repository.impl;

import za.ac.cput.domain.Job;
import za.ac.cput.repository.JobRepository;

import java.util.*;

public class JobRepositoryImpl implements JobRepository {

    private Map<String, Job> jobDB;

    public JobRepositoryImpl() {
        jobDB = new HashMap<>();
    }

    @Override
    public Job save(Job job) {

        if(job == null){
            return null;
        }

        jobDB.put(job.getTitle(), job);
        return job;
    }

    @Override
    public Job findByTitle(String title) {
        return jobDB.get(title);
    }

    @Override
    public List<Job> findAll() {
        return new ArrayList<>(jobDB.values());
    }
}