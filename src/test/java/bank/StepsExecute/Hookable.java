package bank.StepsExecute;

import java.net.UnknownHostException;

import bank.method.HTMLReportGenerator;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hookable
{
	
	@Before
	public void before(Scenario scenario) throws UnknownHostException
	{
		HTMLReportGenerator.TestSuiteStart("E:\\Automation software\\bank.html", "primusbank");
		HTMLReportGenerator.TestCaseStart(scenario.getName(), scenario.getStatus());
		System.out.println(".....................Scenario Start....................");
	}
   @After
   public void after(Scenario scenario)
	{
		System.out.println(".................Scenario End...........................");
		HTMLReportGenerator.TestCaseEnd();
		HTMLReportGenerator.TestSuiteEnd();
	}
}
