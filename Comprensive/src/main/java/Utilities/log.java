package Utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log {

	public static Logger logger = LogManager.getLogger(log.class);

	public void info(String info) {
		logger.info(info);

	}
	public void warn(String warn) {
		logger.warn(warn);
	}
	

	public void error(String error) {
		logger.error(error);
	}

	public void fatal(String fatal) {
		logger.fatal(fatal);
	}

	public void debug(String debug) {
		logger.debug(debug);
	}
	

}
