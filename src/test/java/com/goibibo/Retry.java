package com.goibibo;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer{
	
	int count=1;
	int max =3;
	
	
	
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		 if(count<=max)
		 {
			 System.out.println(result.getMethod().getMethodName()+count);
			 ++count;
			 return true;
		 }
		
		
		return false;
	}

}
