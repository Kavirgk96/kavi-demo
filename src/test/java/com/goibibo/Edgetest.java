package com.goibibo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pom.Pageobjectmanager;

public class Edgetest extends TestBase {
	Pageobjectmanager ip=new Pageobjectmanager();
	   
	@Test(priority = 5)
	public void  lanuchbrowser() {
		browserLaunch("edge");
		launchUrl("https://tutorialsninja.com/demo/index.php?route=account/register");
	}
	@Parameters({"firstname","lastname","gmail","telephone","pass","confirmpass"})
	@Test(priority = 6)
  public void edgebrowser(String firstname,String lastname,String gmail,String telephone,String pass,String confirmpass)
	{
		inputValues(ip.getPageobjectmanager().getFirtname(), firstname);
		inputValues(ip.getPageobjectmanager().getLastname(), lastname);
		inputValues(ip.getPageobjectmanager().getEmail(), gmail);
		inputValues(ip.getPageobjectmanager().gettelephone(), telephone);
		inputValues(ip.getPageobjectmanager().getpassword(), pass);
		inputValues(ip.getPageobjectmanager().getpasswordcon(), confirmpass);
		

	}
	
	
}
