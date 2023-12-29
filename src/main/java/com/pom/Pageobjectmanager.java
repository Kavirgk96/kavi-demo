package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class Pageobjectmanager extends TestBase {
	
	public Pageobjectmanager() {
		PageFactory.initElements(driver, this);
		}
	
	private Pageobjectmanager pom ;
	public Pageobjectmanager getPageobjectmanager(){
		
		pom=new Pageobjectmanager();
		return pom;
		
		
	}
	
	
	@FindBy(id = "input-firstname" )
	private WebElement firtname;
	public WebElement getFirtname() {
		return firtname;
	}

	
	@FindBy(id = "input-lastname" )
	private WebElement lastname;
	public WebElement getLastname() {
		return lastname;
	}
	
	@FindBy(id = "input-email" )
	private WebElement email;
	public WebElement getEmail() {
		return email;
	}
	
		
	@FindBy(id="input-telephone")
	private WebElement telephone;
	public WebElement gettelephone() {
		return telephone;
	}
		@FindBy(id="input-password")
		private WebElement password;
		public WebElement getpassword() {
			return password;
		
	}
		@FindBy(id="input-confirm")
		private WebElement passwordcon;
		public WebElement getpasswordcon() {
			return passwordcon;
	
		
		}
	@FindBy(name="agree")
	private WebElement checkbox;
	public WebElement getcheckbox()
	{
		return checkbox;
		
	}
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement submit;
	public WebElement getsubmit()
	{
		return submit;
		
	}
	

}
