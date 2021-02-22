package shopingweb;

import bank.method.SeleniumOperations;

public class Shopingstepexicute {

	public static void main(String[] args) 
	{
	    // browser launch
			Object[]input = new Object[2];
			input[0]="Chrome";
			input[1]="E://Automation software//chromedriver.exe";
			ShopingOperation.browserLaunch(input);
	      // application launch url
			Object[]input1=new Object[1];
			input1[0]="http://automationpractice.com/index.php";
			ShopingOperation.applicationLaunch(input1);
			// click on sign in
			Object[] input2=new Object[1];
			input2[0]="//*[@class='login']";
			ShopingOperation.click(input2);
	//  enter uname
			Object[]input3=new Object[2];
			input3[0]="//*[@id='email']";
			input3[1]="pkekan6@gmail.com";
			ShopingOperation.sendKey(input3);
	// enter password
			Object[] input4=new Object[2];
			input4[0]="//*[@id='passwd']";
			input4[1]="Hero@9443";
			ShopingOperation.sendKey(input4);
	// click on login button
			Object[] input5=new Object[1];
			input5[0]="//*[@id='SubmitLogin']";
			ShopingOperation.click(input5);
	//  click on address
			Object[] input6=new Object[1];
			input6[0]="//*[@class='icon-building']";
			ShopingOperation.click(input6);
	// logout
			Object[] input7=new Object[1];
			input7[0]="//*[@class='logout']";
			ShopingOperation.click(input7);

			
	}

}
