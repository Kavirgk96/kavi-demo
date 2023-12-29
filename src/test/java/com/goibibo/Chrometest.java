package com.goibibo;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pom.Pageobjectmanager;

public class Chrometest extends TestBase {

	
	Pageobjectmanager ip=new Pageobjectmanager();
	   
	@Test(priority = 1)
	public void  lanuchbrowser() {
		browserLaunch("chrome");
		launchUrl("https://tutorialsninja.com/demo/index.php?route=account/register");
	}
	
	@Test(priority = 2)
	public void firstname() {
		inputValues(ip.getPageobjectmanager().getFirtname(), "kavi");
		inputValues(ip.getPageobjectmanager().getLastname(), "rgk");
		inputValues(ip.getPageobjectmanager().getEmail(), "kavirgk@gmail.com");
		inputValues(ip.getPageobjectmanager().gettelephone(), "123456789");
		inputValues(ip.getPageobjectmanager().getpassword(), "123456780");
		inputValues(ip.getPageobjectmanager().getpasswordcon(), "123456780");
		
		
	}
	@Test(priority = 3)
	public void  checkbox() {
		
         
      clickOnElement(ip.getPageobjectmanager().getcheckbox());
	}
	@Test(priority =4)
	public void sumbit() {
		clickOnWebelement(ip.getPageobjectmanager().getsubmit());
	}
		
		
	
	
	
	
	
	
}

