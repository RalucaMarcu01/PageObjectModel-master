package ro.farmec.tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ro.farmec.pages.SeeProductPage;
import ro.farmec.pages.SeeProductPage;

import static ro.farmec.pages.SeeProductPage.SEE_URL;
import static ro.farmec.pages.SeeProductPage.SEE_URL;

public class SeeProductTest extends BaseTest {

    @Test
    public void checkSee(){
        //
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(SEE_URL);
        SeeProductPage seeProductPage= new SeeProductPage(driver);

        //WebDriverWait wait= new WebDriverWait(driver,10);
        //wait.until(ExpectedConditions.elementToBeClickable(seeProductPage.));

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        seeProductPage.openProduct();





        Assert.assertEquals(driver.getCurrentUrl(),"https://www.farmec.ro/crema-antirid-cu-acid-hialuronic-3-684");
    }
}
