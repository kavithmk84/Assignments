package pages;

import base.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingCartPage extends Driver {
    @FindBy(id="add-to-cart-button")
    private WebElement addToCartButton;
    @FindBy(css="span[title = 'Ruby on Rails Mug']")
    private WebElement RubyOnRailsMugProduct;
    @FindBy(css="span[class = 'lead price selling']")
    private WebElement RubyOnRailsMugProductPrice;
    @FindBy(xpath="//*[@class='warning cart-total']//following::td[2]")
    private WebElement elecartAmountOfProduct;
    @FindBy(id="quantity")
    private WebElement eleQuantity;

    @FindBy(name="commit")
    private WebElement eleCheckOutButton;

    @FindBy(className="alert-info")
    private WebElement cartEmptyMsg;

    public String price;
    public ShoppingCartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @Test
    public void addMugItemToCart(){
        RubyOnRailsMugProduct.click();
        price = RubyOnRailsMugProductPrice.getText();
        System.out.println("Mug Price is:"+price);
        addToCartButton.click();

    }
    public void validateOrderAmount(){
        String cartAmount = elecartAmountOfProduct.getText();
        System.out.println("total cart amount: " +cartAmount);
        if(price.equals(cartAmount)){
            System.out.println("Price displayed correctly");
        }else
            System.out.println("Price is not displayed correctly");

    }
    public void adding3MugItemsAndRemovingFromCart(){
        RubyOnRailsMugProduct.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("quantity")));
        eleQuantity.sendKeys("3");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-button")));
        addToCartButton.click();
        eleCheckOutButton.click();
        String actualMsg = cartEmptyMsg.getText();
        System.out.println("Message displayed:"+actualMsg);
        Assert.assertEquals(actualMsg,"Your cart is empty");
    }

}
