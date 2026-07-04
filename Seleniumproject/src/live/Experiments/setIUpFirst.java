package live.Experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class setIUpFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//call interface
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.selenium.dev/");
		driver.findElement(By.linkText("Documentation")).click();
		driver.quit();
	}

}
