package live.Experiments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class locatorFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =  new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.cssSelector("[placeholder='First Name']")).sendKeys("ADMIN");
		driver.findElement(By.cssSelector("[placeholder='Last Name']")).sendKeys("NIMDA");
		driver.findElement(By.cssSelector("[type='email']")).sendKeys("admin123@gmail.com");
		driver.findElement(By.name("radiooptions")).click();
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("submitbtn")).click();
		
		
		driver.quit();

	}

}
