package live.Experiments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class tableValueFinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement row1 = driver.findElement(By.xpath("(//tr)[3]"));
		System.out.println(row1.getText());
		
		//total value of the table
		List<WebElement> colum = driver.findElements(By.tagName("td"));
		for (WebElement TTcl : colum) {
			System.out.println("name: "+TTcl.getText());
		}
		
		
		//get a full raw texted value
		List<WebElement>Firstrow = driver.findElements(By.xpath("(//tr)[2]//td"));
		
		for (WebElement td : Firstrow) {
			System.out.println("TBody: "+td.getText()); 
	}	
			
		//Total TBody
		List<WebElement> Fullrows = driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println(Fullrows.size());
		for (WebElement table : Fullrows) {
			System.out.println("table: "+table.getText());
	
			}
		}
		
	}


