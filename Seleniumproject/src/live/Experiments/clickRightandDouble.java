package live.Experiments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class clickRightandDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//RIGHTclick action method
		Actions act = new Actions(driver);
		WebElement rightclick = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		act.contextClick(rightclick).perform();
		
		driver.findElement(By.id("authentication")).click();
		
		//DOUBLEclick
		WebElement Dclick =  driver.findElement(By.cssSelector("[ondblclick='myFunction()']"));
		act.doubleClick(Dclick).perform();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
	}

}
