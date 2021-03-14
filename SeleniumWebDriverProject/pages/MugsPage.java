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
   /* @FindBy(xpath = "//a[text()='Rails']")
    private WebElement railsButton;
    @FindBy(xpath= "//h4[text()=' Price Range ']/following-sibling::ul/li[2]")
    private WebElement priceRange10_15;
    @FindBy(xpath="//*[text()='Ruby on Rails Mug']")
    private WebElement rubyOnRailsMugItem;
    @FindBy(id="add-to-cart-button")
    private WebElement addToCartButton;*/
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
