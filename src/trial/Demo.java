package trial;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create Driver object for chrome browser
			/*	Class name= X
						X driver = new X();  */
		//ChromeDriver driver = new ChromeDriver();
		// invoke.exe file first	 
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe"); 
		//System.setProperty(String browser driver, browser application(.exe) path in your machine); 
		// most of error comes from missing this setProperty step
		WebDriver driver  = new ChromeDriver (); // example of polymorphism
		// its invoking chrome browser
		driver.get("https://www.google.com");  // hit url on  the browser
// bu acilan sayfanin adi ne diye de sordurabilirz mesela www.bjk.com dur ama adi sanli-besiktastir sitenin
		System.out.println(driver.getTitle()); // validate if your page name is correct
		System.out.println(driver.getCurrentUrl());   // validate if you are landed on correct url
		System.out.println(driver.getPageSource());  // PRINT PAGE SOURCE IF THERE IS NO RIGTH CLICK
		driver.navigate().to("https://apple.com");  // goes to that url as a second website
		driver.navigate().back();                  // comes back to google
		driver.navigate().forward();
		driver.close();
	}

}
