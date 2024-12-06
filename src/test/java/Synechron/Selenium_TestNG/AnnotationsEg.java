package Synechron.Selenium_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsEg {
	
	@Test
	public void testcase1() {
		
		System.out.println("Executing testcase 1");
	}
	
	@Test
	
 public void testcase2() {
		
		System.out.println("Executing testcase 2");
	}
	
	@Test

 public void testcase3() {
	
	System.out.println("Executing testcase 3");
}
	@BeforeMethod
	
	public void beforemethod() {
		
		System.out.println("launching browser");
	}
	
	@AfterMethod
	
public void aftermethod() {
		
		System.out.println("closing browser");
	}
	
	@BeforeClass
	
public void beforeclass() {
		
		System.out.println("DB connection opening ");
		
		
	}
	
	@AfterClass
	
public void afterclass() {
		
		System.out.println("DB connection closed ");
	}
	



}
