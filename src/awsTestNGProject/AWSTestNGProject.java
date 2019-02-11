package awsTestNGProject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AWSTestNGProject {
	@Test
	public static void test1() {
		System.out.println("Test1");
	}
	
	@Test
	public static void test2() {
		System.out.println("Test1");
	}
	
	@Test
	public static void test3() {
		Assert.fail("Failing the test");
	}
}
