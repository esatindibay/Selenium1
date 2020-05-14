package trial2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		WebElement source = driver.findElement(By.xpath("//input[@title='Depart date']"));
		source.click();
		Thread.sleep(500L);
		source.sendKeys(Keys.ENTER);
		Thread.sleep(500L);
		driver.findElement(By.cssSelector("#Adults")).click();
		Thread.sleep(500L);
		Select s  = new Select(driver.findElement(By.cssSelector("#Adults")));
		s.selectByValue("2");
		Thread.sleep(500L);
		driver.findElement(By.cssSelector("#MoreOptionsLink")).click();
		Thread.sleep(500L);
		WebElement source2 = driver.findElement(By.cssSelector("#AirlineAutocomplete"));
		source2.click();
		Thread.sleep(500L);
		source2.sendKeys("British Airways (BA)");
		Thread.sleep(500L);
		driver.findElement(By.cssSelector("#SearchBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("#homeErrorMessage")).getText());
		driver.close();
		

	}

}
