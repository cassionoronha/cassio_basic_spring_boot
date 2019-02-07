package br.com.cassio.poc01.schedule;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "app.schedule.active",
        matchIfMissing=false)
public class PocSchedule {

    Logger LOG = LoggerFactory.getLogger(PocSchedule.class);
    private int idx = 0;

    @Scheduled(cron = " 0/1 * * ? * * ")
    private void test() {
        idx++;
        LOG.debug("teste debug " + idx);
        LOG.info("teste info" + idx);
        for (int i= 1; i<10; i++) {
            if (i%3 == 0) {
                if (idx % 2 == 0) {
                    LOG.error("teste error" + idx);
                }
                if (idx % 5 == 0) {
                    LOG.warn("teste warn " + idx);
                }
            }
        }
    }
}
