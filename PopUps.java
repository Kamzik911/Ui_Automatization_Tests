package Ui;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopUps {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Web driver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//timeouts
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		//Tasks
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(2000);
		
		//JS Alert
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert1.getText());
		alert1.accept();
		if (driver.getPageSource().contains("You successfully clicked an alert"))System.out.println("You successfully clicked an alert");
		
		Thread.sleep(2000);
		
		//JS Confirm
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.dismiss();
		if (driver.getPageSource().contains("You clicked: Cancel"))System.out.println("You clicked: Cancel");
		
		//JS Promt
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		Alert alert3 = driver.switchTo().alert();
		System.out.println(alert3.getText());
		alert3.sendKeys("Done");
		Thread.sleep(2000);
		alert3.accept();
		if (driver.getPageSource().contains("You entered: Done"))System.out.println("You entered: Done");
		Thread.sleep(3000);
		driver.close();
		
	}

}
