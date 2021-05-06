package TestNGDemos.RealDemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TutorialsSites {
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
    public void scriptinglogic()
    {
        driver.get("http://scriptinglogic.com");
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
