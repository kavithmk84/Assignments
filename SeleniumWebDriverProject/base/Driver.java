package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.annotations.*;
import testCases.Listener;

import java.util.concurrent.TimeUnit;
@Listeners(Listener.class)
public class Driver {
    public WebDriver driver;
    public static WebDriverWait wait;
    @BeforeMethod
    public void setDriver(ITestContext testContext)  {
        System.setProperty("webdriver.chrome.driver","/Users/kavitham/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);
        driver.get("https://spree-vapasi.herokuapp.com/");
        testContext.setAttribute("webdriver",this.driver);
    }
    @AfterMethod
    public void tearDown()  {
        driver.quit();
    }
}
