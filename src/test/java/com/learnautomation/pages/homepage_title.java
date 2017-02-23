package com.learnautomation.pages;
import org.openqa.selenium.WebDriver;





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
