package live.Experiments;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class browserNavigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.google.com/?zx=1783337736047");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("q")).sendKeys("browsernavigation",Keys.ENTER);
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		
		
		//driver.quit();
		
		
	}

}
