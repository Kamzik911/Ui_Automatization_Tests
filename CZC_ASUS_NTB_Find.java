package Ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CZC_ASUS_NTB_Find {
	
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Testing\\browserdrivers\\chromedriver.exe");
	
	//Driver set
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.czc.cz");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"ccp-popup\"]/div/div[2]/button[3]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"fulltext\"]")).sendKeys("ASUS");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/div[2]/div/div[1]/form/button")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"product-list-container\"]/div[4]/a[2]/h3")).click();
	
	driver.close();
	
	}
}
