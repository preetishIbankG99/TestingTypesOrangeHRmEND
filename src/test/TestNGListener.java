package test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener  implements ITestListener{
	@Override		
    public void onFinish(ITestContext result) {					
		 System.out.println("Testcases Finished and TestCasedetails are: "+result.getName());				
        		
    }		

    @Override		
    public void onStart(ITestContext result) {					
      System.out.println("Testcases Started and TestCasedetails are: "+result.getName());				
        		
    }		

    @Override		
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {					
    	 System.out.println("Testcases failed with success and Testcase details are: "+result.getName());			
        		
    }		

    @Override		
    public void onTestFailure(ITestResult result) {					
        System.out.println("TestCases Testfailed and Testcase details are: "+result.getName());				

    }
    @Override		
    public void onTestSkipped(ITestResult result) {					
    	  System.out.println("TestCases Testskipped and Testcase details are: "+result.getName());		
    }        		
    	

    @Override		
    public void onTestStart(ITestResult result) {					
    	  System.out.println("TestCases TestStarted and Testcase details are: "+result.getName());				
        		
    }		

    @Override		
    public void onTestSuccess(ITestResult result) {					
    	  System.out.println("TestCases Success Hurray and Testcase details are: "+result.getName());				
        		
    }	

}
