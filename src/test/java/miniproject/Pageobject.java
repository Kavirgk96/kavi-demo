package miniproject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class Pageobject extends TestBase {

	
	public Pageobject() {
		PageFactory.initElements(driver, this);
		}
	
	private Pageobject pom ;
	public Pageobject getPageobjectmanager(){
		
		pom=new Pageobject();
		return pom;
		
		
	}
	
	
	@FindBy(xpath = "(//a[text()='View plan details & policies'])[1]" )
	private WebElement viewplandploices;
	public WebElement getviewplandploices() {
		return viewplandploices;
	}
	
	@FindBy(xpath  ="(//*[name()='svg'][@class='HappyCloseIcon-sc-nbfb2j-0 bmjMDO'])[1]")
	private WebElement close;
	public WebElement getclose() {
		return  close;
}
	
	@FindBy(xpath="(//button[@data-testid='selectRoomBtn'])[1]")
	private WebElement selectroom;
	public WebElement getselectroom() {
		return  selectroom;
}

}


