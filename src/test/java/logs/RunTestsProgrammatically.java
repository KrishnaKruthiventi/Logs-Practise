package logs;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class RunTestsProgrammatically {
	
	@Test
	public static void main(String[] args) {
		
		TestNG testng = new TestNG();
		testng.setTestClasses(new Class[] {ReportDemoTests.class});
		
		testng.setOutputDirectory("target/testng-reports");
		
		testng.run();

	}

}
