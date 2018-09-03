package openkart;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register
{
	ConfigXL cnf=new ConfigXL();
	LaunchBrowser lb=new LaunchBrowser();
	WebDriver driver;
	
	public void Signup() throws IOException
	{
		String path="D:\\Users\\raanumul\\Desktop\\Selenium\\Assignment\\test data.xlsx";
        cnf.openXL(path);
        driver = lb.openBrowser();
        String url=cnf.strGetData(0, 5, 0);
        driver.get(url);
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")).click();
		for(int i=10;i<=15;i++)
		{
		int j=1;
		    
			String firstname=cnf.strGetData(0, i, j);
		    driver.findElement(By.id("input-firstname")).clear();
		    driver.findElement(By.id("input-firstname")).sendKeys(firstname);
		  
		    String lastname=cnf.strGetData(0, i, j+1);
		    driver.findElement(By.id("input-lastname")).clear();
		    driver.findElement(By.id("input-lastname")).sendKeys(lastname);
		 
		     String email=cnf.strGetData(0, i, j+2);
		     driver.findElement(By.id("input-email")).clear();
		     driver.findElement(By.id("input-email")).sendKeys(email);
		
			String telephone=cnf.strGetData(0, i, j+3);
		    driver.findElement(By.id("input-telephone")).clear();
		    driver.findElement(By.id("input-telephone")).sendKeys(telephone);
		
			String password=cnf.strGetData(0, i, j+4);
		    driver.findElement(By.id("input-password")).clear();
		    driver.findElement(By.id("input-password")).sendKeys(password);
			
			String confirm=cnf.strGetData(0, i, j+5);
		    driver.findElement(By.id("input-confirm")).clear();
		    driver.findElement(By.id("input-confirm")).sendKeys(confirm);
		   if( driver.findElement(By.name("agree")).isSelected())
		   {
			   driver.findElement(By.name("agree")).click();
		   }
		  
		    driver.findElement(By.name("agree")).click();
		    driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).submit();
		    String pagesource=driver.getPageSource();
		  
           if(pagesource.contains("Your Account Has Been Created!"))
               {
	            String result ="passed";
	            cnf.strSetData(path,0,i,j+7,result);
	           }
           else if(pagesource.contains("First Name must be between 1 and 32 characters!"))
           {
	            String result ="passed";
	            cnf.strSetData(path,0,i,j+7,result);
	           }
        	   else if(pagesource.contains("Last Name must be between 1 and 32 characters!"))   
        	   {
   	            String result ="passed";
   	            cnf.strSetData(path,0,i,j+7,result);
   	           }
           else if(pagesource.contains("Warning: E-Mail Address is already registered!"))
           {
  	            String result ="passed";
  	            cnf.strSetData(path,0,i,j+7,result);
  	           }
           else if(pagesource.contains("Telephone must be between 3 and 32 characters!"))
        	  
           { 
        	   String result="passed";
        	   cnf.strSetData(path,0,i,j+3,result);
           }
           else if(pagesource.contains("Password confirmation does not match password!"))
           { 
        	   String result="passed";
        	   cnf.strSetData(path,0,i,j+3,result);
           }
           else 
           {
        	   String result="failed";
        	   cnf.strSetData(path,0,i,j+3,result);
           }
         	  
		}
	}
public static void main(String[] args) throws IOException {
	Register r= new Register();
	r.Signup();
}
}
