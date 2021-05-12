package TestNGDemos.RealDemos;

import TestNGDemos.RealDemos.init.InitTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ForumSites extends InitTests  {

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
