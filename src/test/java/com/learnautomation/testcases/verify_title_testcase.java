package com.learnautomation.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.learnautomation.pages.*;

import base_class.Dynamic_browser;

public class ver_title extends Dynamic_browser {
	
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
}


