package io.bervol;

import io.micronaut.runtime.Micronaut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.management.ManagementFactory;

public class Application {

    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        Micronaut.build(args)
                .banner(false)
                .start();
        long jvmUpTime = ManagementFactory.getRuntimeMXBean().getUptime();
        logger.info("JVM running since {}", jvmUpTime);
    }
}
