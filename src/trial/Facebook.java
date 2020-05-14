package trial;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Facebook {

	public static void main(String [] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();  //it maximizes window
		driver.findElement(By.id("email")).sendKeys("harbiyeli_masumdur");	
		driver.findElement(By.name("pass")).sendKeys("12345");
		driver.findElement(By.linkText("Forgot account?")).click();;
		driver.findElement(By.id("loginbutton")).click();;
		driver.close();
	}

}
