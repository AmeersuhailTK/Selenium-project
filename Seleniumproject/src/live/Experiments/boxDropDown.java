package live.Experiments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class boxDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement dropdown = driver.findElement(By.tagName("select"));
		dropdown.click();
	
		Select slt = new Select(dropdown);
//		slt.selectByIndex(8); //By indexing
//		slt.selectByValue("ARG"); //By Value
		slt.selectByVisibleText("Belgium");  //By Text
		
		driver.quit();

	}

}
