package TestNGDemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LoginDemoExcel {

    @Test (dataProvider = "getData")
    public void myTest1(String user, String pass) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys(user);

        WebElement txtpassword = driver.findElement(By.id("login-password"));
        txtpassword.sendKeys(pass);

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
    }

    @DataProvider
    public Object[][] getData() throws IOException {

        FileInputStream fis = new FileInputStream("MyData/myData.xls");

        HSSFWorkbook workbook = new HSSFWorkbook(fis);

        HSSFSheet sheet = workbook.getSheet("Sheet1");

        int rowCount = sheet.getPhysicalNumberOfRows();
          // row x col --> row-> record , col -> number of input
        Object[][] data = new Object[rowCount][2];

        for(int i=0;i<rowCount;i++)
        {
            HSSFRow row = sheet.getRow(i);

            data[i][0] =   row.getCell(0).toString().trim();
            data[i][1] =   row.getCell(1).toString().trim();

        }


     /*   data[0][0] = "admin"; // user
        data[0][1] = "admin"; // pass

        data[1][0] = "admin1";
        data[1][1] = "rohan";

        data[2][0] = "komal";
        data[2][1] = "sunny";

        data[3][0] = "amol";
        data[3][1] = "sunny";*/

        return  data;
    }


}
