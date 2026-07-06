package live.Experiments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class milWindowTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		String currentwindow = driver.getWindowHandle();
	
		WebElement tab = driver.findElement(By.cssSelector("[href='#Seperate']"));
		js.executeScript("arguments[0].click();", tab);
		
		WebElement click = driver.findElement(By.xpath("//button[@onclick='newwindow()']"));
		js.executeScript("arguments[0].click();", click);
				
		Set<String> allwindow = driver.getWindowHandles();		
		for (String newwindo : allwindow) {
			if (! newwindo.equals(currentwindow)) {
				driver.switchTo().window(newwindo);
			}
		}

		WebElement newtab2 = driver.findElement(By.xpath("//a[@href='/downloads']"));
		js.executeScript("arguments[0].click();", newtab2);
			
		driver.close();
		driver.switchTo().window(currentwindow);
		
		driver.quit();

	}

}
