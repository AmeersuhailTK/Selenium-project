package M.End.Assesments;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class verifyAllElemntsonRegistrationFormT2 {
	
	    public static void main(String[] args) {

	        // Open the url
	        WebDriver driver = new EdgeDriver();
	        driver.get("https://practice.qabrains.com/registration");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        
	        
	        // Wait until all elements are visible
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("input")));

	        // Create a HashMap to store results
	        Map<String, Boolean> formElements = new HashMap<>();

	        // Find each element on the page
	        WebElement name = driver.findElement(By.id("name"));
	        WebElement country = driver.findElement(By.id("country"));
	        WebElement accountType = driver.findElement(By.id("account_type"));
	        WebElement email = driver.findElement(By.id("email"));
	        WebElement password = driver.findElement(By.id("password"));
	        WebElement confirmPassword = driver.findElement(By.id("confirm_password"));
	        WebElement signUpButton = driver.findElement(By.id("submit"));

	        // Store visibility results in the HashMap
	        formElements.put("nameField", name.isDisplayed());
	        formElements.put("Country", country.isDisplayed());
	        formElements.put("AccountType", accountType.isDisplayed());
	        formElements.put("EmailField", email.isDisplayed());
	        formElements.put("PasswordField", password.isDisplayed());
	        formElements.put("ConfirmPasswordField", confirmPassword.isDisplayed());
	        formElements.put("SignUpButton", signUpButton.isDisplayed());

	        // Print the final result
	        System.out.println(formElements);

	        // Close browser
	        driver.quit();
	    }
	}
