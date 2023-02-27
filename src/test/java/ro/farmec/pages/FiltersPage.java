package ro.farmec.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FiltersPage extends BasePage {


    public final static String FILTERS_URL= BASE_URL + "search/acid%20hialuronic";


    public FiltersPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"root\"]/main/section/div/div[2]/div[1]/div/div[1]/article[1]/div/div/a[5]/div/label")
    private WebElement filtru1;

    public void checkFilter1() {
       filtru1.click();
    }







}


