package TestNGDemos.ExtentReportDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginDemoWithExtentReport {

    ExtentSparkReporter reporter;
    ExtentReports extent;

    @BeforeClass
    public void initExtent()
    {
        reporter = new ExtentSparkReporter("Report\\report.html");
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
    public void loginTest()
    {

        ExtentTest test = extent.createTest("loginTest001");

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
    }
}
