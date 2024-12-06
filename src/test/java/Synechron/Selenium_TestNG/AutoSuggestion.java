package Synechron.Selenium_TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestion {
	
	String expectedtext = "lambdatest";
	
	@Test
	
	public void autosugg() throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		WebElement searchbox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		
		searchbox.sendKeys("lambda");
		
		Thread.sleep(2000);
		
		List<WebElement> autosuggestionslist = searchbox.findElements(By.xpath(".//li"));
		
		for(WebElement listtext : autosuggestionslist ) {
			
			WebElement term = listtext.findElement(By.xpath(".//span"));
			
			System.out.println(listtext.getText());
		}
		
	
		
	}

}
