package testCases;

import base.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.LogoutPage;

import java.io.IOException;


public class LoginAndLogOutTest extends Driver {
    @Test
    public void validLoginAndLogout() throws IOException {
        HomePage homePage = new HomePage(driver);
        homePage.navigateToLoginPage();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("kavithmk84@gmail.com","ragsai99");
        String loginMessage = loginPage.getLoginSuccessMessage();
        Assert.assertEquals(loginMessage,"Logged in successfully");
        LogoutPage logoutPage = new LogoutPage(driver);
        logoutPage.logout();
        String logoutMessage = logoutPage.getLogoutSuccessMessage();
        Assert.assertEquals(logoutMessage,"Signed out successfully.");
    }

    @Test
    public void invalidLogin() throws IOException {
        HomePage homePage = new HomePage(driver);
        homePage.navigateToLoginPage();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("kavithmk84@gmail.com","testtest");
        String loginMessage2 = loginPage.getInValidLoginMessage();
        Assert.assertEquals(loginMessage2,"Invalid email or password.");
    }

}
