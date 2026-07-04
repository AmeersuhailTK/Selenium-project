package Task;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class productSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.name("field-keywords")).sendKeys("samsung s23 ultra");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		List<WebElement> proDiscrip = driver.findElements(By.tagName("h2"));
		System.out.println(proDiscrip.size());
		
		String collectDiscription = driver.findElement(By.xpath("//span[text()='Samsung Galaxy S23 Ultra 5G, US Version, 256GB, Cream - Unlocked (Renewed)']")).getText();
		System.out.println(collectDiscription);
	}

}
