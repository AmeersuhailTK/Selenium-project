package live.Experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class pageScroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new EdgeDriver();
		JavascriptExecutor js =(JavascriptExecutor) driver;
		
		//window scroll DOWN
		js.executeScript("window.scrllby(0.500)");
		
		//window scroll TOP to BTM
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		
		//window scroll by specific element 
		WebElement element = driver.findElement(By.tagName("input"));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		
		
	}

}
