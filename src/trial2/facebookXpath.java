package trial2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		/*
		driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("saganorenn@yandex.com");
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("123456789");
		driver.findElement(By.xpath("//*[@id=\'u_0_b\']")).click();
		*/
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("saganen@yandex.com");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("123456789");
		driver.findElement(By.id("u_0_2")).click();
		
		
	}

}
