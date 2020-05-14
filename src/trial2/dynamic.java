package trial2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com"); //URL in the browser
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
 // radio button
	//  //a[@value='MAA']  - Xpath for chennai

	//  //a[@value='BLR']
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	driver.findElement(By.xpath("//a[@value='BLR']")).click();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
//simdi de calendar dan tarih secelim zaten varilacak yeri secince direk kendisi aciyo biz de bugunu secelim bu unique
	Thread.sleep(1500);
	driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).click();
//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
System.out.println(driver.findElement(By.cssSelector("#Div1")).getAttribute("style"));
driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_0")).click();
System.out.println(driver.findElement(By.cssSelector("#Div1")).getAttribute("style"));
	}
		
	}

/* bizim bu asagidaki kod neden olmadi biliyon mu cunku biz //input[] aliyoz bu adam div[] aliyo biz sadece kutucuk
 bu adam butun asagi cikan herseyi birden aliyo
 driver.get("https://www.spicejet.com/default.aspx");
 */

/*
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000L);
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		//boyle index kullanmak yerine parent//child relationship kullanilabilir
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_destinationStation1_CTXT//a[@value='MAA']")).click();
		*/