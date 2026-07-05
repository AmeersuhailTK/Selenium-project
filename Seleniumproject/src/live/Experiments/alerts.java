package live.Experiments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
//		driver.manage().window().maximize();
		driver.get("https://vinothqaacademy.com/alert-and-popup/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		driver.findElement(By.xpath("//button[@onclick='myFunctionOne()']")).click();
		
		//alert handle
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
		
//		//timed alert
//		driver.findElement(By.id("timerAlertButton")).click();
//		Alert alert2 = wait.until(ExpectedConditions.alertIsPresent());
//		alert2.accept();
//		

		driver.findElement(By.xpath("//button[@onclick='myFunctionTwo()']")).click();

		Alert alert3 = driver.switchTo().alert();
		alert3.dismiss();
		
		
		driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
		
		
		Alert alert4 = driver.switchTo().alert();
		alert4.sendKeys("yes");
		alert4.accept();
		
		
		
		//driver.quit();
		
		
		
	}

}
