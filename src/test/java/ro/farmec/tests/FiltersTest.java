package ro.farmec.tests;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import ro.farmec.pages.FiltersPage;

import static ro.farmec.pages.FiltersPage.FILTERS_URL;

public class FiltersTest extends BaseTest {

    @Test
    public void checkFilters(){
        //driver=new ChromeDriver();
       // driver.manage().window().maximize();
        driver.get(FILTERS_URL);
        FiltersPage filtersPage = new FiltersPage(driver);
        waitFor(3000);
        filtersPage.checkFilter1();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.farmec.ro/search/acid%20hialuronic?customFilters=tip_produs:5703");

    }

}
