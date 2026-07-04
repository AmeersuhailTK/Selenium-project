package Task;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class automateYoutube {
	public static void main(String[] args) throws Exception {

		// Setup Edge
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		Actions actions = new Actions(driver);

		// 1️⃣ Open YouTube
		driver.get("https://www.youtube.com");

		// Wait for search box
		WebElement searchBox = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.name("search_query"))
	        );	

		// 2️⃣ Search Malayalam trending songs
		searchBox.sendKeys("songs");
		searchBox.sendKeys(Keys.ENTER);

		// Wait for results
		Thread.sleep(4000);

		// 3️⃣ Hover mouse over the list of videos
		List<WebElement> videoList = driver.findElements(By.xpath("//a[@id='video-title']"));

	        System.out.println("Total videos found: " + videoList.size());

	        // Hover over each video
	        for (WebElement video : videoList) {
	            actions.moveToElement(video).perform();
	            Thread.sleep(500);
	        }

	        // 4️⃣ Right-click on the first video
	        WebElement firstVideo = videoList.get(0);
	        actions.contextClick(firstVideo).perform();
	        Thread.sleep(2000);

	        // 5️⃣ Click the first video to play
	        firstVideo.click();

	        // Wait for video page to load
	        Thread.sleep(5000);

	        // 7️⃣ Navigate back after video completes
	        driver.navigate().back();
	        Thread.sleep(4000);

	        // 9️⃣ Close browser
	        driver.quit();
	    }
	}

