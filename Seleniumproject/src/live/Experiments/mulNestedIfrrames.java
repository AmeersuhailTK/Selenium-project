package live.Experiments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class mulNestedIfrrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Click Multiple tab
		WebElement click = driver.findElement(By.cssSelector("[href='#Multiple']"));
		js.executeScript("arguments[0].click();", click);

		// Switch to outer frame
		WebElement outer = 	driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(0);
		System.out.println(" frames: " + outer.getText());
		System.out.println(driver.findElements(By.tagName("iframe")).size());

		// Switch to inner frame (index 0, not 1)
		WebElement inner = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(inner);

		// Enter text
		WebElement input = driver.findElement(By.cssSelector("input[type='text']"));
		js.executeScript("arguments[0].value='TEXT HERE';", input);

	  driver.quit();
	}

}
