package com.log.learnLog4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Log2Application {
	private static   Logger Log =LogManager.getLogger(Log2Application.class);
	public static void main(String[] args) {
		SpringApplication.run(Log2Application.class, args);
		Log.debug("this is debug");
        Log.error("Error", new NullPointerException());
        Log.warn("Warn");
        Log.fatal("Fatal");
        Log.info("info");
        Log.trace("Trace");
        
	}

}
