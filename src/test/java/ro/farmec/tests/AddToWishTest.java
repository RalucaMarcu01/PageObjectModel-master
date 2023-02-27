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

        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(SEE_URL);
        AddToWishPage addWish = new AddToWishPage(driver);



        addWish.wishProduct();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        addWish.heartButton();
        Assert.assertTrue(addWish.checkAlert());


    }
}
