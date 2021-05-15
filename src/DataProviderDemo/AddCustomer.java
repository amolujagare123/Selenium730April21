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

public class AddCustomer {
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

        FileInputStream fis = new FileInputStream("MyData/myData1.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("Sheet5");

        int rowCount = sheet.getPhysicalNumberOfRows();
        int colCount = sheet.getRow(0).getLastCellNum();

        // row x col --> row-> record , col -> number of input
        Object[][] data = new Object[rowCount - 1][colCount]; // 6 with header
        //  valid will be 5 for array

        for (int i = 0; i < rowCount - 1; i++) {

            XSSFRow row = sheet.getRow(i+1);

            for(int j=0;j<colCount;j++)
                data[i][j] =   row.getCell(j).toString().trim();

            /*data[i][0] =   row.getCell(0).toString().trim(); // name
            data[i][1] =   row.getCell(1).toString().trim(); // address
            data[i][2] =   row.getCell(2).toString().trim(); // contact1
            data[i][3] =   row.getCell(3).toString().trim(); // contact2*/

        }

        return data;
    }
}
