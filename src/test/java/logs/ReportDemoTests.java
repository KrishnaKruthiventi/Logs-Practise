package logs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReportDemoTests {
	
	@Test
	public void testAddition(){
		Assert.assertEquals(2 + 2, 4, "Addition test failed");
	}
	
	@Test
	public void testSubtraction() {
		Assert.assertEquals(5- 3, 2, "Subtraction test failed");
	}
	
	@Test
	public void failingTest() {
		Assert.assertEquals(10 / 0, 1, "This test should fail");
	}
	
	@Test(dependsOnMethods = "failingTest")
	public void skippedTest() {
		System.out.println("This test will be skipped");
	}
}
