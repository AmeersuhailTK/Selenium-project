package Assighnment6;

import org.openqa.selenium.WebDriver;

import java.sql.Driver;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.pagefactory.AjaxElementLocator;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class googleSearchboxFind {

	public static void main(String[] args) throws InterruptedException {
		
	
				WebDriver drver = new EdgeDriver();
				drver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				drver.get("https://www.google.com/");
				
				WebElement searchbox = drver.findElement(By.name("q"));
				
				WebDriverWait wait = new WebDriverWait(drver, Duration.ofSeconds(20));
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
				
				
				searchbox.sendKeys("selenium webdriver");
				searchbox.sendKeys(Keys.ENTER);
				Thread.sleep(3000);
				
				drver.quit();
			

	
	}

}
