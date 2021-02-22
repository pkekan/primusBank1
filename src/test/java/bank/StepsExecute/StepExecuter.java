package bank.StepsExecute;

import bank.method.SeleniumOperations;

public class StepExecuter {

	public static void main(String[] args) 
	{      // browser launch
		Object[]input = new Object[2];
		input[0]="Chrome";
		input[1]="E://Automation software//chromedriver.exe";
		SeleniumOperations.browserLaunch(input);
      // application launch url
		Object[]input1=new Object[1];
		input1[0]="http://primusbank.qedgetech.com/";
		SeleniumOperations.applicationLaunch(input1);
//  enter uname
		Object[]input2=new Object[2];
		input2[0]="//*[@id='txtuId']";
		input2[1]="Admin";
		SeleniumOperations.sendKey(input2);
// enter password
		Object[] input3=new Object[2];
		input3[0]="//*[@id='txtPword']";
		input3[1]="Admin";
		SeleniumOperations.sendKey(input3);
// click on login button
		Object[] input4=new Object[1];
		input4[0]="//*[@id='login']";
		SeleniumOperations.click(input4);
//  click on branches
		Object[] input5=new Object[1];
		input5[0]="//*[@src='images/Branches_but.jpg']";
		SeleniumOperations.click(input5);
// select country
		Object[] input6=new Object[2];
		input6[0]="//*[@name='lst_countryS']";
		input6[1]="INDIA";
		SeleniumOperations.dropDown(input6);
// select state
		Object[] input7=new Object[2];
		input7[0]="//*[@name='lst_stateS']";
		input7[1]="MAHARASTRA";
		SeleniumOperations.dropDown(input7);
// select city
		Object[] input8=new Object[2];
		input8[0]="//*[@name='lst_cityS']";
		input8[1]="MUMBAI";
		SeleniumOperations.dropDown(input8);
// click on search button
		Object[] input9=new Object[1];
		input9[0]="//*[@name='btn_search']";
		SeleniumOperations.click(input9);
// validate
		 Object[] input10=new Object[1];
		 
		   input10[0]="MUMBAI";
		   SeleniumOperations.validate(input10);


	}

}
