package live.Experiments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait {

	public static void main(String[] args) {
		
		EdgeDriver driver = new EdgeDriver();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement searchbox = driver.findElement(By.name("q"));
		
		//Explicitwait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
		
		//elemets clickable
		wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
		
		//url text
		wait.until(ExpectedConditions.urlContains("amazonepay"));
		
		
		//fluent wait
		
	}

}
