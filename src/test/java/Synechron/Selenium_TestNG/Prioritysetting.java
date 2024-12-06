package Synechron.Selenium_TestNG;

import org.testng.annotations.Test;

public class Prioritysetting {
	
	@Test(priority =1)
	
	
	public void launchbrowser() {
		
		System.out.println("Launching browser");
	}
	
	@Test
	
    public void login() {
		
		System.out.println("Logging in");
	}
    
	@Test(enabled= false)
    
    public void selectproduct() {
		
		System.out.println("product selected ");
	}



}
