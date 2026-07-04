package Assighnment7;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alert {
	public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
        
        Alert stayAlert = driver.switchTo().alert();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
        Alert alert1 = wait.until(ExpectedConditions.alertIsPresent());
        alert1.accept();
        System.out.println("You successfully clicked an alert");
        Thread.sleep(3000);
        
        driver.quit();
	}
}