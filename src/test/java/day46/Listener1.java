package day46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener1 implements ITestListener
{
   public void OnStart(ITestContext context)
   {
	   System.out.println("test execution is started....");
   }
   public void OnTestStart(ITestResult result)
   {
	   System.out.println("test is started.........");
   }
   public void OnTestSuccess(ITestContext result)
   {
	   System.out.println("test  is success.......");
   }
   public void OnTestFailure(ITestContext result)
   {
	   System.out.println("test  is failure............");
   }
   public void OnTestSkipped(ITestContext result)
   {
	   System.out.println("test  is skipped..........");
   }
   public void OnFinish(ITestContext context)
   {
	   System.out.println("test execution is finished.......");
   }
   
}
