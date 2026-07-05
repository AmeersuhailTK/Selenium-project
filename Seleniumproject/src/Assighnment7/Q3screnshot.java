package Assighnment7;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Q3screnshot {
		public static void main(String[] args) throws IOException {
			
			WebDriver driver = new EdgeDriver();
			driver.get("https://demo.automationtesting.in/Frames.html");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File("C:/Users/Smart Axis/git/Selenium-project/Seleniumproject/src/Assighnment7/screenshot/Home.png");
			FileUtils.copyFile(source, destination);
			
			driver.quit();
		}
	}
