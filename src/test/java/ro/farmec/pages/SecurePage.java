package ro.farmec.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecurePage extends BasePage{

    @FindBy(xpath="//*[@id=\"root\"]/main/section/div/div[1]/article/div/ul/li[8]") WebElement logoutButton;

    public SecurePage(WebDriver driver) {super(driver);}


    public void clickLogoutButton(){
        logoutButton.click();
    }


}
