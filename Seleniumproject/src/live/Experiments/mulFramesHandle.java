package live.Experiments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class mulFramesHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//first tab
		WebElement fsingl = driver.findElement(By.xpath("//a[@href='#Single']"));
		js.executeScript("arguments[0].click();", fsingl);
		
		// first Frame
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("[type='text']")).sendKeys("TEXT HERE");
		
		//exit first frame
		driver.switchTo().defaultContent();
		
		//second tab
		WebElement framesecond = driver.findElement(By.cssSelector("[href='#Multiple']"));
		js.executeScript("arguments[0].click();", framesecond);
		
		//second frame
		driver.switchTo().frame(0);
		driver.switchTo().frame(1);
		WebElement input = driver.findElement(By.cssSelector("input[type='text']"));
		js.executeScript("arguments[0].value='TEXT HERE';", input);

		
		List<WebElement> iframe = driver.findElements(By.tagName("iframe"));
		System.out.println("total frame: "+iframe.size());
		

	}

}
