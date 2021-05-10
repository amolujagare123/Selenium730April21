package TestNGDemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotDemo {


    @Test
    public void quora() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://scriptinglogic.com");

        // 1. create an object reference of TakesScreenshot (say ts) and assign driver to it
        // ---> typecase the driver into TakesScreenshot type
        TakesScreenshot ts = (TakesScreenshot) driver;

        //2. call the method defined inside TakesScreenshot interface using ts (newly created object reference)
        // method is --> getScreenShotAs() --> store it into a file object
        File srcFile  = ts.getScreenshotAs(OutputType.FILE);

        String timeStamp = new SimpleDateFormat("_yyyyMMdd_hhmmss").format(new Date());

        String fileName = "IMG"+timeStamp+".png";

        // 3. copy this file object into a new and real image file
        FileUtils.copyFile(srcFile,new File("D:\\pallavi\\"+fileName));


    }
}
