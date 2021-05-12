package TestNGDemos.RealDemos;

import TestNGDemos.RealDemos.init.InitTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TutorialsSites extends InitTests {

    @Test
    public void scriptinglogic()
    {
        driver.get("http://scriptinglogic.com");

        Assert.assertEquals(true,false,"scripting logic site opening failed");

    }

    @Test
    public void javatpoint()
    {
        driver.get("http://javatpoint.com/");
    }

    @Test
    public void tutorialspoint()
    {
        driver.get("https://www.tutorialspoint.com/");
    }


}
