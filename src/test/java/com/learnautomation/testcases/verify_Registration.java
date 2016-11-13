package com.learnautomation.testcases;
import com.learnautomation.pages.*;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base_class.Dynamic_browser;

public class verify_Registration extends Dynamic_browser {
	
private WebDriver driver;

@BeforeClass
public void setup()
{
	driver=getDriver();
	
}
	
	
	@Test
	private void Registration(){
		Registration reg=new Registration(driver);
		String verify_reg=reg.Register_user();
		Assert.assertEquals("true", verify_reg);
			
	}
	@Test
	private void Login(){
		Registration reg=new Registration(driver);
		String verify_Login=reg.Login();
		System.out.println("Registration Test " +verify_Login);
		Assert.assertEquals("true", verify_Login);
	
	}

}
