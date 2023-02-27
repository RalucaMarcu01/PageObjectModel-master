package ro.farmec.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SeeProductPage extends BasePage{

    public final static String SEE_URL= BASE_URL + "search/acid%20hialuronic?customFilters=tip_produs:5703";

    public SeeProductPage(WebDriver driver){
        super(driver);
    }

    @FindBy (xpath = "//*[@id=\"root\"]/main/section/div/div[2]/div[2]/div/ul/li[1]/div/a") private WebElement seeProduct;


    @FindBy( xpath = "//*[@id=\"root\"]/main/section/div/article/section[2]/div[2]") private WebElement code;


    public void openProduct(){
        seeProduct.click();
    }

    public String getCode(){
        return code.getText();
    }

}
