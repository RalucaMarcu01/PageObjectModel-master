package ro.farmec.tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ro.farmec.pages.LoginPage;
import ro.farmec.pages.SecurePage;

public class LogoutTest extends BaseTest{
    @Parameters({"user","pass"})
    @Test
    public void positiveLogout(String username, String password) {

        driver.get(LoginPage.LOGIN_URL);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginWithUsernameAndPassword(username, password);
        SecurePage securePage = new SecurePage(driver);
        waitFor(3000);
        securePage.clickLogoutButton();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.farmec.ro/");


    }


}
