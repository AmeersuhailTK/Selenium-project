package live.Experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageScroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=null;
		JavascriptExecutor js =(JavascriptExecutor) driver;
		
		//window scroll DOWN
		js.executeScript("window.scrllby(0.500)");
		
		//window scroll TOP to BTM
		js.executeScript("window.scrllto(0.document.body.scrollhieght)");
		
		//window scroll by specific element 
		WebElement element = driver.findElement(By.tagName("input"));
		js.executeScript("window.scrllIntoView();",element);
				
	}

}
