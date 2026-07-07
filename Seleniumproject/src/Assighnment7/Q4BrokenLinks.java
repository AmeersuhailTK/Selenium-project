package Assighnment7;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Q4BrokenLinks {

    public static void main(String[] args) throws IOException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://demoqa.com/broken");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total links found: " + links.size());

        for (WebElement link : links) {

            String url = link.getAttribute("href");

            if (url == null || url.isEmpty()) {
                System.out.println("Skipping empty link");
                continue;
            }

            
                @SuppressWarnings("deprecation")
				HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
                conn.setRequestMethod("GET");
                conn.connect();

                int statusCode = conn.getResponseCode();

                if (statusCode >= 400) {
                    System.out.println("BROKEN LINK: " + url + " → Status: " + statusCode);
                } else {
                    System.out.println("VALID LINK: " + url + " → Status: " + statusCode);
                

                }
        }

        driver.quit();
        }
  }   

