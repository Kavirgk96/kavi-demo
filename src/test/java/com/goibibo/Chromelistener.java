package com.goibibo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.TestBase;

public class Chromelistener extends TestBase{
	@Test(retryAnalyzer = Retry.class )
	public void Page() {
		browserLaunch("edge");
		launchUrl("https://tutorialsninja.com/demo/index.php?route=account/register");
		String actual = driver.getTitle();
		
		Assert.assertEquals("ninja", actual);
		
		SoftAssert soft = new SoftAssert();
		
	}

}
