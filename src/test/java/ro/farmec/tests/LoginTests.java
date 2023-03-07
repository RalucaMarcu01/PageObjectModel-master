package ro.farmec.tests;

import ro.farmec.pages.LoginPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest{
    @Parameters({"user","pass"})
    @Test
    public void positiveLogin(String username, String password){

        driver.get(LoginPage.LOGIN_URL);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.farmec.ro/account/login");



    }




}
