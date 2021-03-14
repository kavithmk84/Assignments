package testCases;

import base.Driver;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MugsPage;
import pages.ShoppingCartPage;

public class ClearCart extends Driver {
    @Test
    public void clearCart(){
        HomePage homePage = new HomePage(driver);
        homePage.navigateToLoginPage();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("kavithmk84@gmail.com","ragsai99");
        MugsPage mugsPage = new MugsPage(driver);
        mugsPage.searchRubyOnRailsMug();
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        shoppingCartPage.adding3MugItemsAndRemovingFromCart();
    }
}
