package trial;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class testcase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// lets do the same thing for internet explorer
		System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
		WebDriver driver  = new  InternetExplorerDriver (); 
		driver.get("https://www.tesla.com");
		System.out.println(driver.getTitle());
	}
}
