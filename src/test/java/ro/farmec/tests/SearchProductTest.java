package ro.farmec.tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//import ro.farmec.pages.SearchBar;
import ro.farmec.pages.SearchProductPage;

public class SearchProductTest extends BaseTest {



    @Parameters({"search"})

    @Test
    public void searchProduct(String productName ){

        driver.get(SearchProductPage.SEARCH_URL);
        SearchProductPage searchPage = new SearchProductPage(driver);
        searchPage.enterProduct(productName);
        searchPage.clickSearch();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.farmec.ro/search/acid%20hialuronic");

    }

}
