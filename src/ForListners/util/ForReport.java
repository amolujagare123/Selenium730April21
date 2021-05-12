package ForListners.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ForReport {

    public static ExtentReports extent;

    public static ExtentReports initExtent()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Report\\report.html");
        extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setReportName("Billing Regression report");
        reporter.config().setDocumentTitle("Billing software project");

        extent.setSystemInfo("Developer name","Sonali");
        extent.setSystemInfo("Tester Name","Ritesh");
        extent.setSystemInfo("Projet name","Billing");
        extent.setSystemInfo("Deadline","30 MAY 2021");

        return extent;

    }

    public static String screenshot(WebDriver driver) throws IOException {
        // 1. create an object reference of TakesScreenshot (say ts) and assign driver to it
        // ---> typecase the driver into TakesScreenshot type
        TakesScreenshot ts = (TakesScreenshot) driver;

        //2. call the method defined inside TakesScreenshot interface using ts (newly created object reference)
        // method is --> getScreenShotAs() --> store it into a file object
        File srcFile  = ts.getScreenshotAs(OutputType.FILE);

        String timeStamp = new SimpleDateFormat("_yyyyMMdd_hhmmss").format(new Date());

        String fileName = "IMG"+timeStamp+".png";

        // 3. copy this file object into a new and real image file
        FileUtils.copyFile(srcFile,new File("Report\\screenshots\\"+fileName));

        return fileName;
    }


}
