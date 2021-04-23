import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class SeleniumDemoWebDriverManager {

    public static void main(String[] args) {


       /* WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
*/

        /*WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();*/

        WebDriverManager.operadriver().setup();
        WebDriver driver = new OperaDriver();


    }

}
