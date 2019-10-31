package com.averyxu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author bxu
 * @since 20191029
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Application.class);
        logger.info("Hi Logger is coming!");
        SpringApplication.run(Application.class,args);
    }
}
