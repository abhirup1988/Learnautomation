package com.learnautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import Get_properties.Get_property;


public class user_login
{

private WebDriver driver;
	
	public user_login(WebDriver driver)
	{
		this.driver=driver;
	}
	Get_property all_info=new Get_property();
	protected String[] all_information=all_info.credentials().split(",",9);
	
	protected String username=all_information[7];
	protected String password=all_information[8];

public String login()
{
	String result = "true";
	try
	{
	driver.findElement(By.partialLinkText("Signin")).click();
	driver.findElement(By.cssSelector("div[id=login]>#load_form>fieldset>input[name=username]")).sendKeys(username);
	driver.findElement(By.cssSelector("div[id=login]>#load_form>fieldset>input[name=password]")).sendKeys(password);
	driver.findElement(By.cssSelector("div[id=login]>form[id=load_form]>div[class='bottom row']>div[align=center]>input[class=button]")).click();
	}
	catch(Exception e){System.out.println("not found");
	result="false";}
	return result;


}
}
