package com.devsda.learning.designpatterns;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {


    private static final Logger log = LoggerFactory.getLogger(LogTest.class);

    @Test
    public void logTest() {
        log.info("INFO");
        log.debug("DEBUG");
        log.warn("WARN");
        log.error("ERROR");
    }
}
