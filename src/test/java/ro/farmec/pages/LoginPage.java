package ro.farmec.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public final static String LOGIN_URL = BASE_URL+"account/login";
    @FindBy (id="email") private WebElement usernameInput;
    @FindBy (id="password") private WebElement passwordInput;
    @FindBy (css="#root > main > div > div.LoginPage-Form > form > div.LoginPage-Submit > button") private WebElement loginButton;


    public LoginPage(WebDriver driver) {super(driver);}

    public void enterUsername(String username){usernameInput.sendKeys(username);}

    public void enterPassword(String password){passwordInput.sendKeys(password);}

    public void clickLogin(){loginButton.click();}

    public void loginWithUsernameAndPassword(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }






}
