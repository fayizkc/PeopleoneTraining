package TestBlock;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jTest {
	private static Logger logger = LogManager.getLogger(Log4jTest.class);
	
	public static void main(String[] args) {
		System.out.println("Helloo");
		logger.info("informaiton");
		logger.error("Error message:");
		logger.warn("Warning");
		
		
		logger.debug("Hello from Log4j 2");
		logger.debug("This is a Debug Message!");
		logger.info("This is an Info Message!");
		logger.error("This Error message:");
	}

}
