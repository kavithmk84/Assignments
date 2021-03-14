package testCases;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Listener implements ITestListener {


    // When Test case get Started, this method is called.
    @Override
    public void onTestStart(ITestResult Result)
    {
        System.out.println(Result.getName()+" test case started");
    }
    // When Test case get passed, this method is called.
    @Override
    public void onTestSuccess(ITestResult Result)
    {
        System.out.println("The Method Name of the testcase passed is :"+Result.getName());

    }
    // When Test case get failed, this method is called.
    @Override
    public void onTestFailure(ITestResult result)
    {
        System.out.println("The Method name of the testcase failed is :"+result.getName());
        try {
            takeScreenshot(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void takeScreenshot(ITestResult result) throws IOException {
        WebDriver driver = (WebDriver) result.getTestContext().getAttribute("webdriver");
        Date date = new Date();
        TakesScreenshot ts = (TakesScreenshot) driver;
        File sourceFile = ts.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File("/Users/kavitham/IdeaProjects/SelFrameworkProject/src/screenshots/" + date + "_screenshot.png");
        FileUtils.copyFile(sourceFile, destinationFile);
    }
}
