package trial2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css {

	public static void main(String[] args) {
	/*
xpath //tagName[@attribute='value']
css  tagName[attribute='value']
*/
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://login.salesforce.com/");
		dr.findElement(By.cssSelector("#username")).sendKeys("bu # kullanarak@icloud.com");
		dr.findElement(By.cssSelector("#password")).sendKeys("1452364568798985546521sda2sd1");
		dr.findElement(By.cssSelector("#Login")).click();
		//these are with #
		dr.findElement(By.cssSelector(".input.r4.wide.mb16.mt8.username")).sendKeys("bu da . kullanarak@icloud.com");
		dr.findElement(By.cssSelector(".input.r4.wide.mb16.mt8.password")).sendKeys("1452364568798985546521sda2sd1");
		dr.findElement(By.cssSelector(".button.r4.wide.primary")).click();
		//these are with . using
	}

}
