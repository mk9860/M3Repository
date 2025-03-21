package genericLibrary;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

public class MyListener extends BaseTest implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
//		// TODO Auto-generated method stub
//		ITestListener.super.onTestStart(result);
		Reporter.log("--test--"+result.getName()+" Started",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
//		// TODO Auto-generated method stub
//		ITestListener.super.onTestSuccess(result);
		Reporter.log("--test--"+result.getName()+" succeeded",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String failedMethod = result.getName();
		String ldt = LocalDateTime.now().toString();
		String timeStamp = ldt.replaceAll(":", "-");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./errorshots/"+failedMethod+timeStamp+".png");
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
	//	ITestListener.super.onTestSkipped(result);
		Reporter.log("--test--"+result.getName()+" Skipped",true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	//	ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
		Reporter.log("--test--"+result.getName()+" failed within success percentage",true);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
	//	ITestListener.super.onTestFailedWithTimeout(result);
		Reporter.log("--test--"+result.getName()+" Failed with Timeout",true);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	//	ITestListener.super.onStart(context);
		Reporter.log("<test> "+context.getName()+"  is Started",true);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
	//	ITestListener.super.onFinish(context);
		Reporter.log("<test> "+context.getName()+"  Finished",true);
	}

}
