package org.elkastali.jenkins_spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsSpringApplication {

     public static Logger logger= LoggerFactory.getLogger(JenkinsSpringApplication.class);

    public static void main(String[] args) {
        logger.info("Application started");
        SpringApplication.run(JenkinsSpringApplication.class, args);


    }


    public void init(){
        logger.info("Application started");
    }


}
