package TestNGDemos.ExtentReportDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

import static TestNGDemos.ExtentReportDemo.util.ForScreenshot.screenshot;

public class LoginDemoWithExtentReport {

    ExtentReports extent;

    @BeforeClass
    public void initExtent()
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

    }

    @AfterClass
    public void createReport()
    {
        extent.flush();
    }


    
    @Test
    public void loginTest1() throws IOException {

        ExtentTest test = extent.createTest("Valid loginTest001");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        test.info("browser is opened and maximized");

        driver.get("http://billing.scriptinglogic.net/");

        test.info("url is opened");

        WebElement txtUsername  =  driver.findElement(By.xpath("//input[@id='email']"));
        txtUsername.sendKeys("amolujagare@gmail.com");

        test.info("username is entered");

        WebElement txtpassword = driver.findElement(By.xpath("//input[@id='password']"));
        txtpassword.sendKeys("admin123");

        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@name='btn_login']"));
        btnLogin.click();

        test.info("login button is clicked");

        String expected = "http://billing.scriptinglogic.net/index.php/dashboard1";
        String actual = driver.getCurrentUrl();

        try {
            Assert.assertEquals(actual, expected, "this is not a dashboard");
            test.pass("we are on dashboard");
        }
        catch (AssertionError e)
        {
           test.fail(e.getMessage());
           test.addScreenCaptureFromPath("./screenshots/"+screenshot(driver));
        }

    }

    @Test
    public void loginTest2() throws IOException {

        ExtentTest test = extent.createTest("invalid loginTest001");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        test.info("browser is opened and maximized");

        driver.get("http://billing.scriptinglogic.net/");

        test.info("url is opened");

        WebElement txtUsername  =  driver.findElement(By.xpath("//input[@id='email']"));
        txtUsername.sendKeys("amolujagare@gmail.com");

        test.info("username is entered");

        WebElement txtpassword = driver.findElement(By.xpath("//input[@id='password']"));
        txtpassword.sendKeys("");

        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@name='btn_login']"));
        btnLogin.click();

        test.info("login button is clicked");

        String expected = "http://billing.scriptinglogic.net/index.php/sessions/login";
        String actual = driver.getCurrentUrl();

        try {
            Assert.assertEquals(actual, expected, "wrong error message");
            test.pass("we got correct error");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+screenshot(driver));
        }

    }
}
