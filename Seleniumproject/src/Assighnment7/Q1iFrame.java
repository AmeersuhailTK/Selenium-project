package Assighnment7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Q1iFrame {
		public static void main(String[] args) {
			
			WebDriver driver = new EdgeDriver();
			driver.get("https://demo.automationtesting.in/Frames.html");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.cssSelector("[class='analystic']")).click();
			
			driver.switchTo().frame("SingleFrame");
			driver.findElement(By.cssSelector("[type='text']")).sendKeys("ADMIN");

			driver.switchTo().parentFrame();
		}
	}

