package openkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowser
{
	ConfigXL cnf=new ConfigXL();
	String driverpath;
	public WebDriver driver;

	public WebDriver openBrowser()	
	 
	{
		String cellval=cnf.strGetData(0,1,1);                 // for chrome use(0,1,1) and for ie use (0,2,1)
	
               if(cellval.equalsIgnoreCase("Google Chrome"))
	             {
		           driverpath=cnf.strGetData(0,1,2);
	               System.setProperty("webdriver.chrome.driver", driverpath);
	               driver =new ChromeDriver();
	             }
      
              if(cellval.equalsIgnoreCase("Internet explorer"))
	            {
    	          driverpath=cnf.strGetData(0,2,2); 
		          System.setProperty("webdriver.ie.driver",driverpath);
		          driver=new InternetExplorerDriver();
	            }
              
              return driver;
	}

}
