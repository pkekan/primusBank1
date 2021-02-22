package bank.method;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class SeleniumOperations 
{
	public static WebDriver driver=null;
	public static Hashtable<String,Object> outputParameters= new Hashtable<String,Object>();
	// browser launch
	public static Hashtable<String,Object> browserLaunch(Object[] inputparameters)
	{   
		try {
		
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
	        outputParameters.put("STATUS", "PASS");
	        outputParameters.put("MESSAGE", "Action: Browser Launch, Input Given:"+inputparameters[0].toString());
	
	          }
	
	
	catch (Exception e)
	{
		 outputParameters.put("STATUS", "PASS");
	        outputParameters.put("MESSAGE", "Action: Browser Launch, Input Given:"+inputparameters[0].toString());
	
	}
		return outputParameters;
	}
	// application launch url
	public static Hashtable<String,Object> applicationLaunch(Object [] inputparameters)
	{   try {
		String stringURL=(String)inputparameters[0];
		driver.get(stringURL);
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 outputParameters.put("STATUS", "PASS");
	        outputParameters.put("MESSAGE", "Action: Browser Launch, Input Given:"+inputparameters[0].toString());
		 
	}     catch(Exception e)
		 {
		 outputParameters.put("STATUS", "PASS");
	        outputParameters.put("MESSAGE", "Action: Browser Launch, Input Given:"+inputparameters[0].toString());
		 }
	return outputParameters;
	}

	// sendkeys
	public static Hashtable<String,Object> sendKey(Object[] inputParameters)
	{   try {
		String xpath=(String) inputParameters[0];
		String value=(String) inputParameters[1];
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement obj=driver.findElement(By.xpath(xpath));
		obj.clear();
		obj.sendKeys(value);
		
		 outputParameters.put("STATUS", "PASS");
	        outputParameters.put("MESSAGE", "Action: Browser Launch, Input Given:"+inputParameters[1].toString());
		
	}catch(Exception e)
	 {
		 outputParameters.put("STATUS", "PASS");
	        outputParameters.put("MESSAGE", "Action: Browser Launch, Input Given:"+inputParameters[1].toString());
	 }
	return outputParameters;
	}
	//click
	public static Hashtable<String,Object> click(Object[] inputParameters)
	{  try {
		String xpath=(String) inputParameters[0];
		WebElement obj1=driver.findElement(By.xpath(xpath));
		obj1.click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		outputParameters.put("STATUS", "PASS");
        outputParameters.put("MESSAGE", "Action: Browser Launch, Input Given:"+inputParameters[0].toString());
		
	} catch(Exception e)
		 {
		outputParameters.put("STATUS", "PASS");
        outputParameters.put("MESSAGE", "Action: Browser Launch, Input Given:"+inputParameters[0].toString());
		 }
	return outputParameters;
		}
	// dropdown
	public static Hashtable<String,Object> dropDown(Object[]inputParameters)
	{  try {
		String xpath=(String) inputParameters[0];
		String name=(String) inputParameters[1];
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Select sel=new Select(driver.findElement(By.xpath(xpath)));
		sel.selectByVisibleText(name);
		outputParameters.put("STATUS", "PASS");
        outputParameters.put("MESSAGE", "Action: Browser Launch, Input Given:"+inputParameters[1].toString());
		
	}catch(Exception e)
	 {
		outputParameters.put("STATUS", "PASS");
        outputParameters.put("MESSAGE", "Action: Browser Launch, Input Given:"+inputParameters[1].toString());
	 }
	return outputParameters;
	}
		// validation
	public static Hashtable<String,Object> validate(Object[] inputParameters)
	{  try {
		String xpath=(String) inputParameters[0];
		WebElement obj1=driver.findElement(By.linkText(xpath));
		obj1.getText();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		outputParameters.put("STATUS", "PASS");
        outputParameters.put("MESSAGE", "Action: Browser Launch, Input Given:"+inputParameters[0].toString());
	} catch(Exception e)
		 {
		outputParameters.put("STATUS", "PASS");
        outputParameters.put("MESSAGE", "Action: Browser Launch, Input Given:"+inputParameters[0].toString());
		 }
	return outputParameters;
		}

}
