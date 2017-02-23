package com.learnautomation.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import com.learnautomation.pages.Index_page_assignments;
import com.learnautomation.pages.Registration;
import com.learnautomation.pages.user_login;

import base_class.Dynamic_browser;


public class verify_Registration_page extends Dynamic_browser {
	
	private WebDriver driver;
	@BeforeClass
	public void setup() {
		driver=getDriver();
		
	}
	@Test
	private void nav_to_Reg(){
		Registration reg=new Registration(driver);
		
		System.out.println("nav to Register");
		reg.navigate_to_Register();
	}
		
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
			private void Index_Assignment1_count_no_of_box(){
				Index_page_assignments box_count=new Index_page_assignments(driver);
			int count=box_count.count_no_box();
				System.out.println(count);
				Assert.assertEquals(17, count);
			}
			
			@Test
			public void Index_Assignment2() {
				Index_page_assignments reg=new Index_page_assignments(driver);
				int count=reg.count_no_box_widget();
				if(count==7)
				{
				driver.findElement(By.xpath(".//*[@id='wrapper']/div[2]/div[2]/div[4]/ul/li[2]/a/h2")).click();
				
				driver.navigate().to("http://way2automation.com/way2auto_jquery/index.php");
				}
				else
				{
					Assert.fail("Count_no_box_widget are not matching:Found- "+count+", Expected- 7");
				}
				
			
			}			
			
	}


