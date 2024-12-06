package Synechron.Selenium_TestNG;

import org.testng.annotations.Test;

public class DependsOnMethodEg {
	
	@Test
	public void login() {
		
		System.out.println("Login");
	}
	
	
	@Test(dependsOnMethods =("login"))
	public void addtocart() {
		
		System.out.println("add to cart");
	}

}
