package ro.farmec.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SearchProductPage extends BasePage {
        public final static String SEARCH_URL = BASE_URL+"my-account/dashboard";

        @FindBy (id="search-field") private WebElement nameInput;
        @FindBy (css = "#root > div.HeaderSticky > div > header > nav > div.SearchField > div > button.SearchField-Button > svg") private WebElement search;

        public SearchProductPage (WebDriver driver) {super(driver);}
        public void enterProduct(String name) { nameInput.sendKeys(name);}
        public void clickSearch(){ search.click();}

        public void searchForProduct(String name){
            enterProduct(name);
            clickSearch();
        }








    }


