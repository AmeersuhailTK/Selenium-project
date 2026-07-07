package live.Experiments;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class webTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		
		//value fetching y Loop Itreation
		int row = driver.findElements(By.xpath("//table/tbody/tr")).size();
		
		int cols = driver.findElements(By.xpath("//table/tbody/tr[1]/td")).size();
		
		for (int i=1; i<=row; i++)
		{
			for (int j=1; j<=cols; j++) 
			{
				String value = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(value+" ");
			}
		}
		System.out.println();
		driver.quit();
	}

}
