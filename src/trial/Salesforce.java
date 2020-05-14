package trial;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Salesforce {

	public static void main(String [] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://login.salesforce.com");
		driver.manage().window().maximize();  // big screen
		driver.findElement(By.id("username")).sendKeys("esatindibay");
		driver.findElement(By.name("pw")).sendKeys("0000");
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click(); // sometimes this gives error
		// trying to print error message
		System.out.println(driver.findElement(By.id("error")).getText());
		
	
		//instead of this you try "//*[@id=\'Login\']" because sometimes java doesnot accept "" inside ""
		//driver.findElement(By.id("loginbutton")).click();;
		driver.close();
	}

}
