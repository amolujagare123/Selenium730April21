package DataProviderDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static DataProviderDemo.Util.MyDataProvider.getTheData;

public class AddCustomer2 {
    WebDriver driver;
    @BeforeClass
    public void doLogin()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtpassword = driver.findElement(By.id("login-password"));
        txtpassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        // Thread.sleep(4000);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


    }


    @Test (dataProvider = "getData")
    public void addCustomerTest(String customerName,String custAdd,
                                String con1,String con2) throws InterruptedException {

        WebElement lnkAddCustomer = driver.findElement(By.linkText("Add Customer"));
        lnkAddCustomer.click();


        WebElement txtName = driver.findElement(By.id("name"));
        txtName.sendKeys(customerName);

        WebElement txtAddress = driver.findElement(By.name("address"));
        txtAddress.sendKeys(custAdd);

        WebElement txtContact1 = driver.findElement(By.name("contact1"));
        txtContact1.sendKeys(con1);


        WebElement txtContact2 = driver.findElement(By.name("contact2"));
        txtContact2.sendKeys(con2);

        WebElement btnSave = driver.findElement(By.name("Submit"));
        btnSave.click();
    }

    @DataProvider
    public Object[][] getData() throws IOException {

       return getTheData("MyData/myData1.xlsx","Sheet5");
    }
}
