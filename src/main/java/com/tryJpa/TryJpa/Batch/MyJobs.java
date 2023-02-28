package com.tryJpa.TryJpa.Batch;

import com.tryJpa.TryJpa.service.SampleJobService;
import lombok.extern.slf4j.Slf4j;
import org.jobrunr.scheduling.JobScheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MyJobs {
    private final JobScheduler jobScheduler;
    private final SampleJobService sampleJobService;
    @Autowired
    public MyJobs(JobScheduler jobScheduler
            , SampleJobService sampleJobService) {
        this.jobScheduler = jobScheduler;
        this.sampleJobService = sampleJobService;
    }
    public void doJobHEre() {
        // code to run in the background
    }
    @Scheduled(cron = "0/10 * * * * ?")
    public void scheduleJob() {
        jobScheduler.enqueue(() -> sampleJobService.execute("some thing"));
    }
}
