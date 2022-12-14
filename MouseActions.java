package Ui;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		/*
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"cookieChoiceDismiss\"]")).click();
		WebElement boxA = driver.findElement(By.xpath("//li[text()= 'A']"));
		WebElement boxD = driver.findElement(By.xpath("//li[text()= 'D']"));
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(boxA);
		actions.clickAndHold();
		actions.moveToElement(boxD);
		actions.contextClick(boxD);
		actions.doubleClick(boxD);
		actions.build().perform();
		*/
		
		

		driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"cookieChoiceDismiss\"]")).click();
		WebElement elem1 = driver.findElement(By.id("draggable"));
		WebElement elem2 = driver.findElement(By.id("droppable"));
					
		Actions actions = new Actions(driver);
		actions.dragAndDrop(elem1, elem2);
		actions.build().perform();
		Thread.sleep(3000);
		driver.quit();
		System.out.print("Done");
		
		
	}
}
