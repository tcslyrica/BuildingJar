package app1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingDemo {
	public static Logger logger = LogManager.getLogger(LoggingDemo.class);
	public static void main(String[] args) {
		logger.fatal("fatality");
		logger.error("this is error");
		logger.warn("warning");
		logger.info("infomration");
		logger.debug("this is a debug message");
		logger.trace("This is trace");
	}
	}


