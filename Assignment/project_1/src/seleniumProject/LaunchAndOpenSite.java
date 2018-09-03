package seleniumProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchAndOpenSite {
	WebDriver driver;
	public void launchBrowser() throws IOException
	{
		FileInputStream fis=new FileInputStream("D:\\Users\\raanumul\\Desktop\\Selenium\\Assignment\\test data.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet=  workbook.getSheetAt(0);
		Row row=sheet.getRow(1);
		Cell cell =row.getCell(1);
		String cellval=cell.toString();
		//System.out.println(cell);
	
		if(cellval.equals("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\raanumul\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
		 driver =new ChromeDriver();
		//driver.get("https://demo.opencart.com");
		}
		else
		{
			System.setProperty("webdriver.ie.driver", "D:\\Users\\raanumul\\Desktop\\Selenium\\Drivers\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			//driver.get("https://demo.opencart.com");
		}
	}
	public void openSite() throws IOException
	{
		FileInputStream fis=new FileInputStream("D:\\Users\\raanumul\\Desktop\\Selenium\\Assignment questions\\project1\\selenium1.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet=  workbook.getSheetAt(0);
		Row row=sheet.getRow(2);
		Cell cell =row.getCell(1);
		String cellval=cell.toString();
		driver.get(cellval);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	public static void main(String[] args) throws IOException {
		LaunchAndOpenSite f=new LaunchAndOpenSite();
		f.launchBrowser();
		f.openSite();
		
		
	}

}
