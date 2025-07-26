package logs;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterLoggingTests {
	
	@Test
	public void testWithReporter() {
		Reporter.log("Starting testWithReporter", true);
		Reporter.log("This message will appear in TestNG reports", false);
		
		Reporter.log("INFO level message", true);
		Reporter.log("WARN level message", 1, true);
		Reporter.log("ERROR level message", 2, true);
		Reporter.log("DEBUG level message", 3, true);
	}
}
