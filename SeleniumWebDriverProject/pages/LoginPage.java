package pages;


import base.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Driver {

    @FindBy(id="spree_user_email")
    WebElement userEmail;
    @FindBy(id="spree_user_password")
    WebElement userPassword;
    @FindBy(xpath = "//input[@value='Login']")
    WebElement clickLoginButton;
    @FindBy(xpath = "//*[text()='Logged in successfully']")
    WebElement loginSuccessMessage;
    @FindBy(xpath = "//*[text()='Invalid email or password.']")
    WebElement inValidLoginMessage;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void login(String username, String password){
        userEmail.sendKeys(username);
        userPassword.sendKeys(password);
        clickLoginButton.click();
    }
    public String getLoginSuccessMessage(){
        String successMessage = loginSuccessMessage.getText();
        return successMessage;
    }
    public String getInValidLoginMessage(){
        String failureMessage = inValidLoginMessage.getText();
        return failureMessage;
    }
}
