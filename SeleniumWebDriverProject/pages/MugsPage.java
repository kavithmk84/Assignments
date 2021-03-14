package pages;

import base.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class MugsPage extends Driver {
    @FindBy(id="keywords")
    private WebElement searchTextBox;
 
    @FindBy(css="input[class='btn btn-success']")
    private WebElement searchButton;

    public MugsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @Test
    public void searchRubyOnRailsMug(){
        searchTextBox.clear();
        searchTextBox.sendKeys("Ruby on Rails Mug");
        searchButton.click();
    }
}
