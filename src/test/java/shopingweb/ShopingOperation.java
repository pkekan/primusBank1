package shopingweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ShopingOperation 
{
	public static WebDriver driver=null;
	// browser launcch
	public static void browserLaunch(Object[]inputparameters)
	{   try {
		
	        String bname=(String)inputparameters[0];
	        String exepath=(String)inputparameters[1];	
	        if (bname.equalsIgnoreCase("Chrome"))
	        {
		     System.setProperty("webdriver.chrome.driver", exepath);
		     driver=new ChromeDriver();
		     driver.manage().window().maximize();
		     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	         }
	         else if (bname.equalsIgnoreCase("FireFox"))
	         {
		     System.setProperty("webdriver.gecko.driver", exepath);
		     driver=new FirefoxDriver();
		      driver.manage().window().maximize();	
		      driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	         }
	
	          }
	
	
	catch (Exception e)
	{
		System.out.println(e);
	}
	}
	// application launch url
	public static void applicationLaunch(Object [] inputparameters)
	{   try {
		String stringURL=(String)inputparameters[0];
		driver.get(stringURL);
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}     catch(Exception e)
		 {
			 System.out.println(e);
		 }
	}

	// sendkeys
	public static void sendKey(Object[] inputParameters)
	{   try {
		String xpath=(String) inputParameters[0];
		String value=(String) inputParameters[1];
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement obj=driver.findElement(By.xpath(xpath));
		obj.clear();
		obj.sendKeys(value);
		
	}catch(Exception e)
	 {
		 System.out.println(e);
	 }
	}
	//click
	public static void click(Object[] inputParameters)
	{  try {
		String xpath=(String) inputParameters[0];
		WebElement obj1=driver.findElement(By.xpath(xpath));
		obj1.click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	} catch(Exception e)
		 {
			 System.out.println(e);
		 }
		}
	
	
	}

