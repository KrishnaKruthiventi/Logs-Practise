package logs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class Log4j2Tests {
	
	private static final Logger logger = LogManager.getLogger(Log4j2Tests.class);
	
	@Test
	public void testWithLog4j2() {
		logger.trace("This is a TRACE message");
		logger.debug("This is a DEBUG message");
		logger.info("Starting testWithLog4j2");
		logger.warn("This is a WARN message");
		logger.error("This is an ERROR message");
		logger.fatal("This is a FATAL message");
		
		try {
			int result = 10 / 0;
		} catch (Exception e) {
			logger.error("Exception occured: ", e);
		}
	}
	
	@Test
	public void testWithParameterizedLogging() {
		String user = "testuser";
		int attempt = 3;
		
		logger.info("User {} attempted login {} times", user, attempt);
		logger.debug("Processing data for user: {}", user);
		
	}
	
}
