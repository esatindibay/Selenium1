package trial2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class britishRepeat {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.get("https://www.britishairways.com/travel/home/public/en_gb/");
		System.out.println(driver.findElement(By.xpath("//*[@id=\"sb-Flight-pax-mix\"]")).getText());
		driver.findElement(By.xpath("//*[@id=\"sb-Flight-pax-mix\"]")).click();
		for(int i =0; i<4; i++) {
			// in for loop i press 4 times and finally my passenger number becomes 5
		driver.findElement(By.xpath("//*[@id=\"AdultKey0\"]/div[3]/div/button[2]")).click();
		}
		driver.findElement(By.xpath("//*[@id=\"sb-Flight-pax-mix-pop-up\"]/button")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"sb-Flight-pax-mix\"]")).getText());
		
		

	}

}
