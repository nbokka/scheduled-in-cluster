package voters.jobs;

import org.slf4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;

import static org.slf4j.LoggerFactory.getLogger;

public class Job3 {

    private static final Logger log = getLogger(Job3.class);

    @Scheduled(cron = "0 0/1 * * * ?")
    public void execute() {
      log.info("Executing job3");
    }
}
