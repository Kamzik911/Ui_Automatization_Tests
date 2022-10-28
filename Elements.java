package Ui;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Elements {

	public static void main (String[] args) throws InterruptedException {
		
		//webdriver chrome
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		
		//go to URL
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.id("W0wltc")).click();
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Blábol", Keys.ENTER);
		
		/*driver.navigate().to("https://trytestingthis.netlify.app/");
		List<WebElement> options = driver.findElements(By.name("Optionwithcheck[]"));
		
		for (WebElement element : options) {
			System.out.println(element.getText());
		}
		driver.findElement(By.id("fname")).sendKeys("Jan");
		*/
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(loginButton)).sendKeys("Jejda");
		Thread.sleep(5000);
		driver.close();
		
		
	}
}