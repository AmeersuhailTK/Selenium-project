package live.Experiments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multtipleBrowserLaunch {

    public static void main(String[] args) {

        String browser = "Chrome";   // change to: chrome / edge / firefox
        WebDriver driver = null;

        switch (browser.toLowerCase()) {

            case "chrome":
               
                driver = new ChromeDriver();
                break;

            case "edge":
               
                driver = new EdgeDriver();
                break;

            case "firefox":
             
                driver = new FirefoxDriver();
                break;

            default:
                System.out.println("Invalid browser name");
                System.exit(0);
        }

        // Open YouTube
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com");

        // Close browser
        driver.quit();
    }
}
