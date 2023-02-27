package ro.farmec.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;
    public final static String BASE_URL = "https://www.farmec.ro/";


    public BasePage(WebDriver driver) {PageFactory.initElements(driver,this);}

}
