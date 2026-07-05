package live.Experiments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait {

	public static void main(String[] args) {
		
		EdgeDriver driver = new EdgeDriver();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//Explicitwait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q"))); //q is a attribute of searchbox
		                                                                  
		//elemets clickable
		wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
		
		//url text
		wait.until(ExpectedConditions.urlContains("amazonepay"));
		
		
		//fluent wait
		
	}

}
