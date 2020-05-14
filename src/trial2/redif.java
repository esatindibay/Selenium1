package trial2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class redif {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://rediff.com");
		driver.findElement(By.cssSelector("a[title*='Already'")).click(); // title in tamamini almadim bi
																		 //kismini aldim yetiyo *= var ya
		driver.findElement(By.id("login1")).sendKeys("indibayesat@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
}
