package trial2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) throws InterruptedException {
		String t ="selim";
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
Thread.sleep(2000L);
		driver.manage().window().maximize();
Thread.sleep(2000L);
		driver.findElement(By.name("enter-name")).sendKeys(t);
Thread.sleep(2000L);
		driver.findElement(By.id("alertbtn")).click();
Thread.sleep(2000L);
		System.out.println(driver.switchTo().alert().getText());
Thread.sleep(2000L);
		driver.switchTo().alert().accept();
Thread.sleep(2000L);
		driver.findElement(By.name("enter-name")).sendKeys(t+t);
Thread.sleep(2000L);
		driver.findElement(By.id("confirmbtn")).click();
Thread.sleep(2000L);
		driver.switchTo().alert().dismiss();

	}

}
