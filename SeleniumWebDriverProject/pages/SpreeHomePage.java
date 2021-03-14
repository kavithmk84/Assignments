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

import java.util.List;

public class SpreeHomePage extends Driver {
    @FindBy(id="keywords")
    private WebElement searchTextBox;
    @FindBy(css="input[class='btn btn-success']")
    private WebElement searchButton;
    @FindBy(id="products")
    private WebElement eleProducts;
    @FindBy(xpath="//a[@href='/t/bags']")
    private WebElement selectBags;
    @FindBy(xpath="//input[@id='Price_Range_$15.00_-_$18.00']")
    private WebElement selectPriceRange15_18;
    @FindBy(css="#products")
    private WebElement searchPanelProducts;

    public SpreeHomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @Test
    public void searchRuby() {
        wait.until(ExpectedConditions.elementToBeClickable(By.id("keywords")));
        searchTextBox.clear();
        searchTextBox.sendKeys("Ruby");
        searchButton.click();
        List<WebElement> lst = eleProducts.findElements(By.xpath("//div[contains(@id,'product_')]"));
        for(int i = 0; i < lst.size(); i++) {
            System.out.println("Ruby Value:"+lst.get(i).getText().contains("Ruby"));
            Assert.assertTrue(lst.get(i).getText().contains("Ruby"));
        }
    }

    @Test
    public void searchApache() {
        wait.until(ExpectedConditions.elementToBeClickable(By.id("keywords")));
        searchTextBox.clear();
        searchTextBox.sendKeys("Apache");
        searchButton.click();
        List<WebElement> lst = eleProducts.findElements(By.xpath("//div[contains(@id,'product_')]"));
        for (int i = 0; i < lst.size(); i++) {
            System.out.println("Apache Value:"+lst.get(i).getText().contains("Apache"));
            Assert.assertTrue(lst.get(i).getText().contains("Apache"));
        }
    }

    @Test
    public void FilterByPriceOnBags() throws InterruptedException {
        selectBags.click();
        selectPriceRange15_18.click();
        searchButton.click();
        List<WebElement> lst = searchPanelProducts.findElements(By.cssSelector("span[class = 'price selling lead']"));
        int min = 15, max = 20;
        double trimmedPrice;
        for(int i = 0; i < lst.size(); i++) {
            System.out.println(lst.get(i).getText().replace('$',' '));
            trimmedPrice = Double.parseDouble(lst.get(i).getText().replace('$',' '));
            System.out.println("Price:"+trimmedPrice);
            Assert.assertTrue(trimmedPrice >= 15 && trimmedPrice <= 18);
        }
    }

}
