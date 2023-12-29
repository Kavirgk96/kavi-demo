package com.goibibo;

import org.testng.annotations.Test;

import com.base.Basec;

public class Runner extends Basec{
	
	
	@Test
	public void browserLaunch()
	{
		launchBrowser("chrome");
	}


}
