package com.learnautomation.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.learnautomation.pages.*;

import base_class.Dynamic_browser;

public class verify_title_testcase extends Dynamic_browser {
	
private WebDriver driver;



	@BeforeClass
	public void setup() {
		driver=getDriver();
		
	}
	


	@Test
	private void verify_title(){
		homepage_title title=new homepage_title(driver);
		String title1=title.get_title();
		System.out.println(title1);	
		System.out.println("Hi this is" +title1);
		Assert.assertEquals("Welcome", title1);
        System.out.println("Hi this is verify_title");
	}		
	
//Registration Methods
	/*
	@Test
	private void nav_to_Reg(){
		Registration reg=new Registration(driver);
		reg.navigate_to_Register();
			
	}
	/*
	@Test
	private void Enter_reg_details(){
		Registration reg=new Registration(driver);
		String verify_Login=reg.Enter_Registration_details();
		System.out.println("Registration Test " +verify_Login);
		Assert.assertEquals("true", verify_Login);
	}	
	
	@Test
	private void user_Login(){
		user_login login=new user_login(driver);
		String verify_Login=login.login();
		System.out.println("Registration Test " +verify_Login);
		Assert.assertEquals("true", verify_Login);
	}
		

@Test
private void Index_Assignment1_count_no_of_box() {
		Index_page_assignments box_count=new Index_page_assignments(driver);
		int count=box_count.count_no_box();
		System.out.println(count);
		Assert.assertEquals(17, count);
	
	}
		*/
}


