package FrameworkLibraries;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FWLogger {
	private Logger fwLogger;
	
	public FWLogger(Logger  fwLogger) {
		this.fwLogger=fwLogger;	
	}
	
	public static FWLogger getLogger(String name) {
		Logger fwLogger = LogManager.getLogger(name);
		return new FWLogger(fwLogger);
	}
	
	public void debug(String msg) {
		this.fwLogger.debug(msg);
	}
	
	public void info(String msg) {
		this.fwLogger.info(msg);
	}
	
	public void warn(String msg) {
		this.fwLogger.warn(msg);
	}
	
	public void error(String msg) {
		this.fwLogger.error(msg);
	}
	
	
		


}
