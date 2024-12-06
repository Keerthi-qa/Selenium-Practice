package Synechron.Selenium_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(ListenersEg.class)

public class ParametersEg {
	
	
	@Test
	
	@Parameters("browser")
	
	
	public void launchbrowser(String browser) {
		
		if(browser.equals("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			
			
			WebDriver driver = new FirefoxDriver();
			
			driver.get("https://www.bing.com");
			
		} else if (browser.equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.google.com");
		}
		
		
		
	}

}
