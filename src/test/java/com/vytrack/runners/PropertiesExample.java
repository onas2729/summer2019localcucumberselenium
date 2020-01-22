package com.vytrack.runners;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class PropertiesExample {

    private static final Logger logger = LogManager.getLogger(PropertiesExample.class);

    public static void main(String[] args) {

        logger.info("this is a log");
        System.out.println("this is a log");

        diffMethod();
    }

    private static void diffMethod() {
        logger.info("another log");
        logger.error("this is a very scary message");
    }
}
