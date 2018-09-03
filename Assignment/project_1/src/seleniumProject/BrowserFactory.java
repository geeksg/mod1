package seleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
static WebDriver driver;
	
	public static WebDriver Openbrowser (String Brow_Name, String url) {
		if(Brow_Name.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.chrome.driver", "D:\\Users\\raanumul\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
		}
		return driver;
		
	}
}
