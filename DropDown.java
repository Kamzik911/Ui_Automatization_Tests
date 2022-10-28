package Ui;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
		public static void main(String[] args) throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.get("https://trytestingthis.netlify.app");
			Thread.sleep(2000);
			WebElement optdown = driver.findElement(By.id("option"));
			Select selectObject = new Select(optdown);
			Thread.sleep(1000);
			selectObject.selectByIndex(1);
			Thread.sleep(1000);
			selectObject.selectByValue("option 2");
			Thread.sleep(1000);
			selectObject.selectByVisibleText("Option 3");
			
			Thread.sleep(5000);
			driver.quit();
			System.out.println("Done");
	}
}
