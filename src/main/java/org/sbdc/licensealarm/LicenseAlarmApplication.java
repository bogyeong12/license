package org.sbdc.licensealarm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@EnableScheduling
@SpringBootApplication
public class LicenseAlarmApplication {

    @Scheduled(cron = "0 0 10 * * *")
    public void run() {
        System.out.println("현재시간은" + new Date());
    }
    public static void main(String[] args) {
        SpringApplication.run(LicenseAlarmApplication.class, args);
    }

}
