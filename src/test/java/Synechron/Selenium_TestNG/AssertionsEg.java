package Synechron.Selenium_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionsEg {
	
	@Test
	
	
	public void softassertion() throws InterruptedException {
		
		
		
        WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
						
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		driver.manage().window().maximize();
	
		Thread.sleep(2000);
		
		String expectedtitle = "";
		
		String actualtitle = driver.getTitle();
		
		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals(actualtitle, expectedtitle);
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		Thread.sleep(2000);
		
		
		
		
		
		
			
	}

}
