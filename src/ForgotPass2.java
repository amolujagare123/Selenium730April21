import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPass2 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://billing.scriptinglogic.net");

       // WebElement lnkForgot = driver.findElement(By.linkText("Forgot your password?"));
//        WebElement lnkForgot = driver.findElement(By.partialLinkText("Forgot"));

      //  WebElement lnkForgot = driver.findElement(By.xpath("//a[normalize-space()='I forgot my password']"));
        WebElement lnkForgot = driver.findElement(By.xpath("//a[contains(text() , 'forgot')]"));
        lnkForgot.click();


    }


    }
