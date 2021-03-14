package pages;

import base.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends Driver {
    @FindBy(id = "link-to-login")
    WebElement eleLinkToLoginButton;
    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void navigateToLoginPage() {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("link-to-login"))));
        eleLinkToLoginButton.click();
    }
}
