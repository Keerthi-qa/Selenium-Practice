package Synechron.Selenium_TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase2 {
	
	@Test
	
	
	public void checkboxhandling() throws InterruptedException {
	
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	WebElement radio = driver.findElement(By.xpath("//input[@value='radio2']"));
	
	radio.click();
		
	List<WebElement> chkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
	
	int size = chkboxes.size();
	
	System.out.println(size);
	
	for (int i=0; i<=size; i++){
		
		chkboxes.get(i).click();
	}
	}
}
	
		
