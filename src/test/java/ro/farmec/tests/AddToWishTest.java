package ro.farmec.tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
//import ro.farmec.pages.AddToCartPage;
import ro.farmec.pages.AddToWishPage;

import static ro.farmec.pages.SeeProductPage.SEE_URL;


public class AddToWishTest extends BaseTest {

    @Test
    public void checkProduct(){


        driver.get(SEE_URL);
        AddToWishPage addWish = new AddToWishPage(driver);



        addWish.wishProduct();

        waitFor(5000);

        addWish.heartButton();
        Assert.assertTrue(addWish.checkAlert());


    }
}
