package Assighnment7;

import org.openqa.selenium.WebDriver;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class googleSearchboxFind {

	public static void main(String[] args) throws InterruptedException {
		
	
				WebDriver chrome = new EdgeDriver();
				chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				chrome.get("https://www.google.com/");
				
				WebElement searchbox = chrome.findElement(By.name("q"));
				searchbox.sendKeys("selenium webdriver");
				searchbox.sendKeys(Keys.ENTER);
				Thread.sleep(3000);
				
				chrome.quit();
			

	}

}
