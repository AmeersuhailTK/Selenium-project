package live.Experiments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class mulWindowClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
	
		WebElement tab = driver.findElement(By.xpath("//a[@href='#Tabbed']"));
		tab.click();
		
		//find window id
		String currentwindow = driver.getWindowHandle();
		System.out.println(currentwindow);
		
		WebElement clickbtn = driver.findElement(By.xpath("(//button[@class='btn btn-info'])[1]"));
		js.executeScript("arguments[0].click();", clickbtn);
		
		//Get id for all opened window
		Set<String> allwindows =   driver.getWindowHandles();
		for (String newwindo : allwindows) {
			if (!newwindo.equals(currentwindow)) {
				driver.switchTo().window(newwindo);
			}
		}
		System.out.println(allwindows);
		
		driver.findElement(By.linkText("About")).click();

		WebElement newtab = driver.findElement(By.xpath("//a[@href='/downloads']"));
		js.executeScript("arguments[0].click();", newtab);
		
		driver.close();
		
		driver.switchTo().window(currentwindow);
		
		
		
		driver.quit();		
	}

}

