package com.learnautomation.pages;
import org.openqa.selenium.WebDriver;

import base_class.Dynamic_browser;

import com.learnautomation.pages.*;

public class homepage_title {
	private WebDriver driver;
	
	public homepage_title(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public String get_title(){
	   String title=driver.getTitle();
		return title;
	
	}

}
