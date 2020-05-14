package trial;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class testcase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// lets do the same thing for firefox
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		WebDriver driver  = new  FirefoxDriver (); 
		driver.get("https://www.tesla.com");
		System.out.println(driver.getTitle());
		driver.quit();
		
		// quit is different from close().
		// quit closes all browsers and exits
		// close() method clsoes only current browser
			
	}
}
