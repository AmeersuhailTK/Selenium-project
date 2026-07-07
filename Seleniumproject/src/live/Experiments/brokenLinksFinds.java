package live.Experiments;

import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class brokenLinksFinds {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver(); 
		driver.get("https://demoqa.com/broken");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		//search number of link
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for (WebElement Link : links) 
		{
		String url = Link.getAttribute("href");	
		
		if (url==null || url.isEmpty())
		continue;
		
		
		@SuppressWarnings("deprecation")
		java.net.HttpURLConnection conn = (java.net.HttpURLConnection)
		new java.net.URL(url).openConnection();
		
		conn.connect();
		
		if (conn.getResponseCode()>=400)
		{
		System.out.println(url+"Brokken Link");	
		}
		else {
			System.out.println(url+"Valid Link");
			}
			
		}
		
		WebElement BLi = driver.findElement(By.linkText("Click Here for Valid Link"));
		js.executeScript("arguments[0].click();", BLi);
		
		driver.navigate().back();
		
		WebElement GLi = driver.findElement(By.linkText("Click Here for Broken Link"));
		js.executeScript("arguments[0].click();", GLi);
		
		driver.navigate().back();
		
		driver.quit();
		
	}

}
