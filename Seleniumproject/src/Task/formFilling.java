package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class formFilling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//JS executer
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//for heading text withtagname
		WebElement headtext = driver.findElement(By.tagName("h2"));
		 String text =(String) js.executeScript("return arguments[0].innerText;", headtext);
	        System.out.println(text);
		
	    // Enter Text 
		WebElement textbox1 = driver.findElement(By.tagName("input"));
		js.executeScript("arguments[0].value = 'ADMIN';", textbox1);
		
		WebElement textbox = driver.findElement(By.cssSelector("[placeholder='Last Name']"));
		js.executeScript("arguments[0].value = 'NIMDA';", textbox);
		
		WebElement emailbox = driver.findElement(By.cssSelector("[type='email']"));
		js.executeScript("arguments[0].value = 'admin123@gmail.com';", emailbox);
		
		WebElement number = driver.findElement(By.cssSelector("[type='tel']"));
		js.executeScript("arguments[0].value = '1234567890';", number);

		
		WebElement pswrd  = driver.findElement(By.id("secondpassword"));
		js.executeScript("arguments[0].value = '1234567890';", pswrd);
		
		driver.findElement(By.name("radiooptions")).click();
		
		WebElement scroll = driver.findElement(By.id("checkbox1"));
		js.executeScript("arguments[0].click();", scroll);
		
		//scroll to be seen element
		js.executeScript("arguments[0].scrollIntoView(true);", scroll);

		
		//Click element
        WebElement submit = driver.findElement(By.id("submitbtn"));
        js.executeScript("arguments[0].click();", submit);
        
        //Get button text with xpath 
        String text1 =(String) js.executeScript
        		("return arguments[0].innerText;", submit);
        System.out.println(text1);
        
        driver.quit();

	}

}
