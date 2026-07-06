package live.Experiments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class mulWindowSeprated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		String parentwindow = driver.getWindowHandle();
		
		WebElement tabsep = driver.findElement(By.linkText("Open Seperate Multiple Windows"));
		js.executeScript("arguments[0].click();", tabsep);
		
		WebElement clickbtn = driver.findElement(By.cssSelector("[onclick='multiwindow()']"));
		js.executeScript("arguments[0].click();", clickbtn);
		
		Set<String> firstTab = driver.getWindowHandles();
		//convert SET to LIST
		List<String> windows = new ArrayList<>(firstTab);

		// Switch to FIRST child window
		driver.switchTo().window(windows.get(1));
		
		WebElement window1 = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].value = 'admin123@gmail.com';", window1);
		
		WebElement click = driver.findElement(By.id("enterimg"));
		js.executeScript("arguments[0].click();", click);
		
		//driver.close();
		

		// Switch to FIRST child window
		driver.switchTo().window(windows.get(2));

		WebElement newtab2 = driver.findElement(By.xpath("//a[@href='/downloads']"));
		js.executeScript("arguments[0].click();", newtab2);
		
		driver.switchTo().window(parentwindow);
		
		String hedding = driver.findElement(By.tagName("h1")).getText();
		System.out.println(hedding);
		
		
		driver.quit();
		
	}//Try to use ITREATOR

}
