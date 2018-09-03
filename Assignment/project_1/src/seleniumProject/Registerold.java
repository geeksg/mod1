package seleniumProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Registerold {
	WebDriver driver;
	Row row;
	Cell cell;
	
	public void signup() throws IOException
	{
		FileInputStream fis2=new FileInputStream("D:\\Users\\raanumul\\Desktop\\Selenium\\Assignment\\test data.xlsx");
		
		XSSFWorkbook workbook2= new XSSFWorkbook(fis2);
		XSSFSheet sheet2=  workbook2.getSheetAt(0);
		row=sheet2.getRow(1);
		cell =row.getCell(1);
		String cellval2=cell.toString();
		//System.out.println(cell);
	
		if(cellval2.equals("Chrome"))
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
	
		FileInputStream fis1=new FileInputStream("D:\\Users\\raanumul\\Desktop\\Selenium\\Assignment questions\\project1\\selenium1.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook workbook1= new XSSFWorkbook(fis1);
		XSSFSheet sheet1=  workbook1.getSheetAt(0);
		row=sheet1.getRow(3);
	 cell =row.getCell(3);
		String cellval=cell.toString();
		//System.out.println(cellval);
		driver.get(cellval);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")).click();
		int i=1;
		int j=1;
		FileInputStream fis=new FileInputStream("D:\\Users\\raanumul\\Desktop\\Selenium\\Assignment\\test data.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet=  workbook.getSheetAt(1);
		    row=sheet.getRow(i);
			cell =row.getCell(j);
			String firstname=cell.toString();
		driver.findElement(By.id("input-firstname")).sendKeys(firstname);
		    row=sheet.getRow(i);
		    cell =row.getCell(j+1);
		    String lastname=cell.toString();
		driver.findElement(By.id("input-lastname")).sendKeys(lastname);
		    row=sheet.getRow(i);
		    cell =row.getCell(j+2);
		     String email=cell.toString();
		driver.findElement(By.id("input-email")).sendKeys(email);
			row=sheet.getRow(i);
		    cell =row.getCell(j+3);
			String telephone=cell.toString();
		driver.findElement(By.id("input-telephone")).sendKeys(telephone);
			row=sheet.getRow(i);
		    cell =row.getCell(j+4);
			String password=cell.toString();
		driver.findElement(By.id("input-password")).sendKeys(password);
			row=sheet.getRow(i);
			cell =row.getCell(j+5);
			String confirm=cell.toString();
		driver.findElement(By.id("input-confirm")).sendKeys(confirm);
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).submit();
		String acttitle=driver.getTitle();
		String exptitle="Your Account Has Been Created!";
	     //Assert.assertEquals( acttitle, exptitle);
		Assert.assertEquals( acttitle, exptitle);
	
		
		
		
		
		
	}
	
	public static void main(String[] args) throws IOException {
		//LaunchAndOpenSite f=new Register();
		//f.launchBrowser();
		//f.openSite();
		
		Registerold r= new Registerold();
		r.signup();
	}

}
