package M.End.Assesments;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class validatingRegistrationFormT1 {


    public static  String getPageTitle() {

        // Open the URL
        WebDriver driver = new EdgeDriver();
        driver.get("https://practice.qabrains.com/registration");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Wait until page loads
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.urlContains("registration"));        
        
        // Retrieve webpage title
        String actualTitle = driver.getTitle();

        // Validate the page title
        String expectedTitle = "QA Practice Site";

        if (actualTitle.equals(expectedTitle)) {
       
            System.out.println("Actual Title: " + actualTitle);
            System.out.println("Expected Title: " + expectedTitle);
            
        } else {
            System.out.println("Title Verification Failed!");
            
        }

        // Close browser and return title
        driver.quit();
        return actualTitle;
    }
        
        public static void main(String[] args) {
            getPageTitle();
        
    }

   
}


