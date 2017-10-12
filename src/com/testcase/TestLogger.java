package com.testcase;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestLogger {

	final static Logger logger=Logger.getLogger(TestLogger.class);
	
	public static void main(String[] args) {
		System.out.println("!!!!@@@@####$$$$%%%%^^^^&&&&****");
		PropertyConfigurator.configure("log4j.properties");
		logger.debug("gebug");
		logger.warn("warn");
		logger.error("nlkg");
		logger.fatal("sjhfnkjglal");
		logger.info("fkjhbsadkjfh");
	}
}
