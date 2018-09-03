package seleniumProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\raanumul\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		driver.get("https://demo.opencart.com");
		 driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")).click();

		String sample =driver.findElement(By.xpath("//*[@id=\"content\"]/p/text()[1]")).
		System.out.println(sample);
		
	}

}
