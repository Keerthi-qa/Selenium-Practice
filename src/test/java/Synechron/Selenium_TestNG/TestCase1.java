package Synechron.Selenium_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {
	
	@Test(groups = {"Regression","sanity"})
	
	
	public void launchbrowser() {
		
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
	
		
	}
	

}
