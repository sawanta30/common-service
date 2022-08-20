package com.ril;

import com.ril.utils.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommonServiceApplication {
	private static final Logger log = LoggerFactory.make();

	public static void main(String[] args) {
		log.info("Starting common service application");
		SpringApplication.run(CommonServiceApplication.class, args);
		log.info("Started common service application");

	}

}
