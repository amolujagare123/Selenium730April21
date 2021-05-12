package TestNGDemos.RealDemos;

import TestNGDemos.RealDemos.init.InitTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SocialSites extends InitTests {


    @AfterClass
    public void closeBrowser()
    {
        driver.close();
    }

    @Test (priority = 1)
    public void twitter()
    {
        driver.get("http://twitter.com");
    }

    @Test (priority = 3)
    public void facebook()
    {
        driver.get("http://facebook.com");
    }

    @Test (priority = 2)
    public void instagram()
    {
        driver.get("http://instagram.com");
    }


}
