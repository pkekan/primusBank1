package bank.StepsExecute;

import java.util.Hashtable;

import bank.method.HTMLReportGenerator;
import bank.method.SeleniumOperations;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login 
{
	@Given ("^user opens \"([^\"]*)\" browser with exe \"([^\"]*)\"$")
	public void browserLaunch(String bname,String exe)
	{
		Object[] input=new Object[2];
		input[0]=bname;
		input[1]=exe;
		SeleniumOperations.browserLaunch(input);
	}
	@Given ("^user enters url \"([^\"]*)\"$")
	public void url(String url1)
	{
		Object[] input1=new Object[1];
		input1[0]=url1;
		SeleniumOperations.applicationLaunch(input1);
	}
	
	@Given ("^user enters \"([^\"]*)\" as username$")
	
	public void username(String uname)
	{
		Object[]input2=new Object[2];
		input2[0]="//*[@id='txtuId']";
		input2[1]="Admin";
		Hashtable<String,Object>input2op=SeleniumOperations.sendKey(input2);
		
		HTMLReportGenerator.StepDetails(input2op.get("STATUS").toString(),"user enters \"([^\"]*)\" as username",input2op.get("MESSAGE").toString());
		}
	
	@When("^user enters \"([^\"]*)\" as password$")
	public void password(String pass) throws Throwable 
	{
		Object[] input3=new Object[2];
		input3[0]="//*[@id='txtPword']";
		input3[1]="Admin";
		Hashtable<String,Object>input3op=SeleniumOperations.sendKey(input3);
		HTMLReportGenerator.StepDetails(input3op.get("STATUS").toString(),"user enters \"([^\"]*)\" as password",input3op.get("MESSAGE").toString());
	}

	@When("^user click on the \"([^\"]*)\" button$")
	public void login(String pass) throws Throwable
	{
		Object[] input4=new Object[1];
		input4[0]="//*[@id='login']";
		Hashtable<String,Object>input4op=SeleniumOperations.click(input4); 
		HTMLReportGenerator.StepDetails(input4op.get("STATUS").toString(),"user click on the \"([^\"]*)\" button",input4op.get("MESSAGE").toString());
	}

	@When("^user able to click on \"([^\"]*)\" button$")
	public void branches(String pass) throws Throwable 
	{
		Object[] input5=new Object[1];
		input5[0]="//*[@src='images/Branches_but.jpg']";
		Hashtable<String,Object>input5op=SeleniumOperations.click(input5);  
		HTMLReportGenerator.StepDetails(input5op.get("STATUS").toString(),"user able to click on \"([^\"]*)\" button",input5op.get("MESSAGE").toString());
	}

	@When("^user able to select Country as \"([^\"]*)\"$")
	public void country(String pass) throws Throwable
	{
		Object[] input6=new Object[2];
		input6[0]="//*[@name='lst_countryS']";
		input6[1]="INDIA";
		Hashtable<String,Object>input6op=SeleniumOperations.dropDown(input6);
		HTMLReportGenerator.StepDetails(input6op.get("STATUS").toString(),"user able to select Country as \"([^\"]*)\"",input6op.get("MESSAGE").toString());
	}

	@When("^user able to select State as \"([^\"]*)\"$")
	public void state(String pass) throws Throwable
	{
		Object[] input7=new Object[2];
		input7[0]="//*[@name='lst_stateS']";
		input7[1]="MAHARASTRA";
		Hashtable<String,Object>input7op=SeleniumOperations.dropDown(input7);
		HTMLReportGenerator.StepDetails(input7op.get("STATUS").toString(),"user able to select State as \"([^\"]*)\"",input7op.get("MESSAGE").toString());
	}

	@When("^user able to select City as \"([^\"]*)\"$")
	public void City(String pass) throws Throwable 
	{
		Object[] input8=new Object[2];
		input8[0]="//*[@name='lst_cityS']";
		input8[1]="MUMBAI";
		Hashtable<String,Object>input8op=SeleniumOperations.dropDown(input8);  
		HTMLReportGenerator.StepDetails(input8op.get("STATUS").toString(),"user able to select City as \"([^\"]*)\"",input8op.get("MESSAGE").toString());
	}

	@When("^user able to click \"([^\"]*)\" button$")
	public void clickbutton(String pass) throws Throwable 
	{
		Object[] input9=new Object[1];
		input9[0]="//*[@name='btn_search']";
		Hashtable<String,Object>input9op=SeleniumOperations.click(input9);  
		HTMLReportGenerator.StepDetails(input9op.get("STATUS").toString(),"user able to click \"([^\"]*)\" button",input9op.get("MESSAGE").toString());
	}
	@Then("^Application shows search result for \"([^\"]*)\" city$")
	public void showsresult(String pass) throws Throwable 
	{
		Object[] input10=new Object[1];
		 
		   input10[0]="MUMBAI";
		   Hashtable<String,Object>input10op=SeleniumOperations.validate(input10);
		   HTMLReportGenerator.StepDetails(input10op.get("STATUS").toString(),"Application shows search result for \"([^\"]*)\" city",input10op.get("MESSAGE").toString());
	}


	}


