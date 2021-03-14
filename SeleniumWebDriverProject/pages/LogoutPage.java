package pages;

import base.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LogoutPage extends Driver {
    @FindBy(xpath ="//a[text()='Logout']")
    WebElement elelogOutButton;
    @FindBy(xpath = "//*[text()='Signed out successfully.']")
    WebElement logoutSuccessMessage;
    public LogoutPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void logout()  {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[text()='Logout']"))));
        elelogOutButton.click();
    }
    public String getLogoutSuccessMessage(){
        String successMessage = logoutSuccessMessage.getText();
        return successMessage;
    }
}
