package Guru99loginpage;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class Login_Validation {
    public WebDriver driver;


    @Test(dataProvider = "fetchExcelData")

    public void searchText(String username, String password) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver", "C:/Users/thiru/IdeaProjects/Guru99Banking/src/main/resources/chromedriver.exe");
        //System.setProperty("Webdriver.gecko.driver","C:/Users/thiru/IdeaProjects/Guru99Banking/src/main/resources/geckodriver.exe");
        //WebDriver driver;
        // driver = new FirefoxDriver();
        driver = new ChromeDriver();
        driver.get("http://www.demo.guru99.com/V4/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement UserN= driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
        UserN.sendKeys(username);
        Thread.sleep(3000);
        WebElement Passw = driver.findElement((By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")));
        Passw.sendKeys(password);
        Thread.sleep(3000);
        WebElement submit = driver.findElement(By.name("btnLogin"));

        Thread.sleep(5000);
        submit.click();


    }

    @DataProvider(name = "fetchExcelData")
    public Object[][] testDataFromExcel() throws IOException, InvalidFormatException {
        return FetchData_Excel.readFile("Sheet1");

    }


    }


