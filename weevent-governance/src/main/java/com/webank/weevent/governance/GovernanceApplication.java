package com.webank.weevent.governance;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * spring boot start test
 *
 * @since 2018/12/18
 */
@Slf4j
@SpringBootApplication
@EnableTransactionManagement
public class GovernanceApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(GovernanceApplication.class);
        app.addListeners(new ApplicationPidFileWriter());
        app.run(args);
        log.info("Start Governance success");
    }
}
