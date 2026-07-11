package M.End.Assesments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class returnUrlonRegistrationFormT3 {

	    public static void main(String[] args) {

	        // Open the URL
	        WebDriver driver = new EdgeDriver();
	        driver.navigate().to("https://practice.qabrains.com/registration");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Wait until all form elements are visible
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("input")));

	        // Step 3–9: Fill the form
	        driver.findElement(By.id("name")).sendKeys("Admin");

	        WebElement countries = driver.findElement(By.name("country"));
	        Select country = new Select(countries);
	        country.selectByVisibleText("India");

	        Select accountType = new Select(driver.findElement(By.cssSelector("[name='account']")));
	        accountType.selectByVisibleText("Engineer");

	        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
	        email.sendKeys("ameer.qa@test.com");
	        WebElement pswd = driver.findElement(By.id("password"));
	        pswd.sendKeys("admin123");
	        WebElement repswd = driver.findElement(By.id("confirm_password"));
	        repswd.sendKeys("admin123");

	        WebElement submit = driver.findElement(By.cssSelector("[data-slot='button']"));
		    js.executeScript("arguments[0].click();", submit);
		    js.executeScript("arguments[0].scrollIntoView(true)", submit);
		    
	        // Wait until URL contains "registered=true"
	        wait.until(ExpectedConditions.urlContains("registered=true"));

	        // Capture final URL
	        String finalURL = driver.getCurrentUrl();
	       

	        // Print the final URL
	        System.out.println("Redirected URL: " + finalURL);

	        // Close browser
	        driver.quit();
	    }
	}

