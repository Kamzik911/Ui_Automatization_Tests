package Ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class KbActions {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		/*
		//send Keys
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"W0wltc\"]/div")).click();
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Tempo", Keys.ENTER);
		*/
		
		/*
		//KeyDown
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"W0wltc\"]/div")).click();
		driver.findElement(By.name("q")).sendKeys("Techno", Keys.ENTER);
		Actions actionProvider = new Actions(driver);
		Action keydown = actionProvider.keyDown(Keys.CONTROL).sendKeys("a").build();
		keydown.perform();
		*/
		
		//KeyUp
		Actions actions = new Actions(driver);
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"W0wltc\"]/div")).click();
		WebElement searchBox = driver.findElement(By.name("q"));
		actions.keyDown(Keys.SHIFT).sendKeys(searchBox,"selenium").keyUp(Keys.SHIFT).sendKeys(" selenium").perform();
		searchBox.clear();
		
		Thread.sleep(5000);
		driver.quit();
	}

}
