package Synechron.Selenium_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {
	
	@Test
	
	
	
	public void homepage() {
	
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://practicetestautomation.com/practice-test-login/");
	
	//id locator
	
	WebElement username = driver.findElement(By.id("username"));
	
	username.sendKeys("student");
	
	//name locator
	
	WebElement password = driver.findElement(By.id("password"));
	
	password.sendKeys("Password123");
	
	WebElement id = driver.findElement(By.xpath("//button[@id='submit']"));
	
	id.click();
	
	
//	WebElement logo = driver.findElement(By.className("Custom=logo-link"));
	
//	if(logo.isDisplayed()) {
		
//		System.out.println("home page is displayed");
//		
		
		
		
	}
	
//	WebElement name = driver.findElement(By.xpath("//a[normalize-space()='Log out']"));
//	
//	id.click();
	
//	driver.close();			
	
	
	
	
	
	

}


