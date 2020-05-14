package trial2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AutoSuggestive {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[2]/ul/li[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"fromCity\"]")).click();
		WebElement source = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"));
			source.sendKeys("MUM");
				source.sendKeys(Keys.ARROW_DOWN);
					source.sendKeys(Keys.ENTER);
					//here i used webelement then avoided to write samething again again
					//yere num yaziyoz ayni yere asagi basiyoz ve ayni yere enter diyoz
		
		WebElement s = driver.findElement(By.cssSelector("#root > div > div.minContainer > div > div > div.fsw.widgetOpen > div.fsw_inner > div.fsw_inputBox.searchToCity.inactiveWidget.activeWidget > div:nth-child(2) > div > div > div > input"));
			s.sendKeys("BLR");
			Thread.sleep(2500L);
			for(int i = 0; i <3; i ++) {
				s.sendKeys(Keys.ARROW_DOWN);
				Thread.sleep(2000L);
			}
					s.sendKeys(Keys.ENTER);
					Assert.assertFalse(driver.findElement(By.xpath("//*[contains(@class,'activeItem')] ")).isSelected()  );
					String x = (driver.findElement(By.xpath("//*[contains(@class,'activeItem')] ")).getText());
					if(x.equalsIgnoreCase("student fare")) 
						System.out.println("true");
				 				
	}
}
