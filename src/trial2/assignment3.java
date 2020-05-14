package trial2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assignment3 {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
	driver.findElement(By.xpath("//a[contains(text(),'Click to load get data via Ajax!')]")).click();
	WebDriverWait x = new WebDriverWait(driver,3);
	x.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results")));
	System.out.println(driver.findElement(By.cssSelector("#results")).getText());
	
	}

}
