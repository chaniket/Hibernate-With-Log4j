package com.cb.main;

import java.io.IOException;

import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.apache.log4j.MDC;
import org.apache.log4j.PropertyConfigurator;

public class log4jExample {
	/* Get actual class name to be printed on */
	static Logger log = Logger.getLogger(log4jExample.class.getName());
	static int user = 1;

	public static void main(String[] args) throws IOException, SQLException {
		MDC.put("user", 101);
		 //PropertyConfigurator.configure("src/main/java/log4j.properties");
		log.info(user);
		log.debug("in Main");
		String s = "";
		for (int i = 1; i <= 100; i++) {
			s += i + " ";
		}
		log.info(s);
		log.info("main end");
		System.out.println("end");
		log.info("now this project is in GitHub");
	}
}
