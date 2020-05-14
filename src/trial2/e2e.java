package trial2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com"); 
		Thread.sleep(100L);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(100L);
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		Thread.sleep(100L);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		Thread.sleep(100L);
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		Thread.sleep(100L);
		Select s = new Select(driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_Adult")));
		Thread.sleep(100L);
		s.selectByValue("5");
		Thread.sleep(100L);
		driver.findElement(By.cssSelector("#ctl00_mainContent_chk_friendsandfamily")).click();
		Thread.sleep(100L);
		driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
		
		
	}

}
