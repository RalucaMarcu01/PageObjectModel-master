package ro.farmec.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToWishPage extends BasePage {

   public final static String  SEE_URL;

    static {
        SEE_URL = BASE_URL + "search/acid%20hialuronic?customFilters=tip_produs:5703";
    }

    public AddToWishPage(WebDriver driver){
        super(driver);
    }


    @FindBy (xpath = "//*[@id=\"root\"]/main/section/div/div[2]/div[2]/div/ul/li[1]/div/a/figure/div[3]/button") private WebElement wish;

    @FindBy (xpath = "//*[@id=\"root\"]/div[2]/div/header/nav/div[5]") private WebElement heart;

    @FindBy (xpath = "//*[@id=\"root\"]/div[1]/div/button") private WebElement alert;



    public void wishProduct(){
        wish.click();
    }

    public void heartButton(){
        heart.click();
    }

    public boolean checkAlert(){

        return alert.isDisplayed();
    }

}
