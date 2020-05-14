package trial;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


public class aolMalil {
	
	
	public static WebDriver driver;
	public static void main(String [] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		driver = new  FirefoxDriver ();
		// in this example firefox driver is used. its called gecko driver!! dont confused
		test("https://login.aol.com/");	
		driver.close();
	}
	
	
	public static void test(String url){
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.id("login-username")).sendKeys("k.selim");
		driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
		driver.findElement(By.className("password")).sendKeys("yenigun");
		driver.findElement(By.id("login-signin")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//p[@class='error-msg']")).isDisplayed());
	}
	

}

