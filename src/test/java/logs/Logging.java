package logs;

import org.testng.annotations.Test;

public class Logging {
	
	@Test
	public void testWithSystemAOut() {
		System.out.println("Starting testWithSystemOut");
		System.out.println("Performing step 1...");
		System.out.println("Performing step 2...");
		System.out.println("Test completed successfully");
	}
	
	@Test
	public void testWithSystemErr() {
		System.err.println("This is an error message");
		System.err.println("Something might be wrong here");
	}
}
