package miniproject;

import org.testng.annotations.Test;

import com.base.TestBase;

public class Selectahotel extends TestBase {
	
	Pageobject ip= new Pageobject();
	
	
	@Test(priority = 1)
	public void browserLaunch()
	{
		browserLaunch("chrome");
		launchUrl("https://www.goibibo.com/hotels/itc-grand-chola-a-luxury-collection-hotel-in-chennai-8353476183493538901/?hquery={%22ci%22:%2220240117%22,%22co%22:%2220240119%22,%22r%22:%221-2-0%22,%22ibp%22:%22%22}&cc=IN&vcid=4354390963378411938&locusId=CTMAA&locusType=city&cityCode=CTMAA");
	}
	@Test(priority = 2)
		public void viewplandploices() {
			
			clickOnWebelement(ip.getPageobjectmanager().getviewplandploices());
		
		}
	@Test(priority = 3)
	public void takescreenshot() {
		screenShot("ploices");
		
	}
	@Test(priority = 4)
	public void closeview() {
		clickOnWebelement(ip.getPageobjectmanager().getclose());
	}
	@Test(priority = 5)
	public void selectroom() {
		clickOnWebelement(ip.getPageobjectmanager().getselectroom());
	}
	
	
	}



