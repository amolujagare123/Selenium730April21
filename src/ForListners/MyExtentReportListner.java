package ForListners;

import TestNGDemos.RealDemos.init.InitTests;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

import static ForListners.util.ForReport.initExtent;
import static ForListners.util.ForReport.screenshot;

public class MyExtentReportListner extends InitTests implements ITestListener {


    ExtentReports extent;
    ExtentTest test;

    public void onStart(ITestContext context) {

        if(extent==null)
          extent = initExtent();
    }



    public void onTestStart(ITestResult result) {
        //System.out.println("onTestStart");

        test = extent.createTest(result.getMethod().getMethodName());
    }

    public void onTestSuccess(ITestResult result) {
       // System.out.println("onTestSuccess");


        test.pass(result.getMethod().getMethodName()+"+this test is passed");
    }

    public void onTestFailure(ITestResult result) {
      //  System.out.println("onTestFailure");
        test.info(result.getThrowable());
        test.fail(result.getMethod().getMethodName()+"+this test is faled");

        try {
            test.addScreenCaptureFromPath("./screenshots/"+screenshot(driver));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onTestSkipped(ITestResult result) {
       // System.out.println("onTestSkipped");

        test.skip(result.getMethod().getMethodName()+"+this test is skipped");
    }


    public void onFinish(ITestContext context) {
      //  System.out.println("onFinish");

        extent.flush();
    }

}
