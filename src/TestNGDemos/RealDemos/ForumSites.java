package TestNGDemos.RealDemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ForumSites {
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

    @Test
    public void quora()
    {
        driver.get("http://quora.com");
    }

    @Test
    public void stackoverflow()
    {
        driver.get("http://stackoverflow.com/");
    }

    @Test
    public void sqaforums()
    {
        driver.get("http://www.sqaforums.com/");
    }


}
