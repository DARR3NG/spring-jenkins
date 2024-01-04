package org.elkastali.jenkins_spring;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JenkinsSpringApplicationTests {

    public static Logger logger= LoggerFactory.getLogger(JenkinsSpringApplicationTests.class);
    @Test
    void contextLoads() {

        logger.info("Test case executing...");
        logger.info("Test case executing second line...");
        logger.info("Test case executing third line...");
        logger.info("Test case executing fourth line...");
        assertEquals(1, 1);
    }

}
