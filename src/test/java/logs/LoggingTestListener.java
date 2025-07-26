package logs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class LoggingTestListener implements ITestListener{
	
	private static final Logger logger = LogManager.getLogger(LoggingTestListener.class);
	
	@Override
	public void onTestStart(ITestResult result) {
		logger.info("Test starting: {}", result.getName());
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("Test passed: {}", result.getName());
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		logger.error("Test failed: {}", result.getName(), result.getThrowable());
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		logger.warn("Test skipped: {}", result.getName());
	}
}
