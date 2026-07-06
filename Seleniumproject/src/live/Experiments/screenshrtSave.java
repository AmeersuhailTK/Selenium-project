package live.Experiments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class screenshrtSave {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		//get system filepath
		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
		
		//common file and name replaced by new file generation
		File destination = new File("C:/Users/Smart Axis/git/Selenium-project/Screenshort/Test.png");
		FileUtils.copyFile(source, destination);
		
		
		//for UIQUE name setup
		String timestamp = String.valueOf(System.currentTimeMillis());
		File destination1 = new File("C:/Users/Smart Axis/git/Selenium-project/Screenshort/web" + timestamp +".png");
		FileUtils.copyFile(source, destination1);
		
		
		

	}

}
