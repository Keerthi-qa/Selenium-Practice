package Synechron.Selenium_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelExecution {
	
@Test	
	
public void launchbrowserchrome() {
		
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
				
	}

@Test
public void launchbrowserff() {
	
	WebDriverManager.firefoxdriver().setup();
	
	
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://www.bing.com");
	

	
}




	

}



