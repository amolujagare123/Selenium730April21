package TestNGDemos.RealDemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SocialSites {
    WebDriver driver;

    @BeforeClass
    public void openBrowser()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

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
