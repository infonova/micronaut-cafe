package io.bervol;

import io.micronaut.runtime.Micronaut;

import java.lang.management.ManagementFactory;

public class Application {

    public static void main(String[] args) {
        Micronaut.build(args)
                .banner(false)
                .start();
        long jvmUpTime = ManagementFactory.getRuntimeMXBean().getUptime();
        System.out.printf("JVM running since %d ms%n", jvmUpTime);
    }
}
