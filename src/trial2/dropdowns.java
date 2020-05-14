package trial2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {
		public static void main(String[] args) {
	
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.spicejet.com/default.aspx");
				//lets select 2 adults from a dropdown button
		
			driver.findElement(By.cssSelector("#divpaxinfo")).click();
			Select s = new Select(driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_Adult")));
			s.selectByValue("2"); // siteden actik baktik "2" yazarsak 2 adults demekmis diye kodlamis
			s.selectByIndex(8); // bu da 6 adults seciyor index kullanarak
			s.selectByVisibleText("4"); // bu da direk ne gozukuyorsa oyle seciyor
			
			driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
			Select se = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
			se.selectByVisibleText("USD");
			
			
	

	}

}
