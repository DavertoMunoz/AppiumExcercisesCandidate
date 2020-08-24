package Tests;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

/***
OPEN BROWSER AND NAVIGATE, CHROMEDRIVER VERSION FOR CHROME 74
 ***/

public class Ecommerce_tc_05 extends Base {

//    @FindBy(how = How.LINK_TEXT, using = "Our Work")
//    private MobileElement ourWorkLink;

    @Test
    public void openBrowserAndVerifyOurWorkPage() throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Opens device browser and page specified
        driver.get("https://www.encora.com/");
        // Accept the terms and conditions, or cookies, whatever.
        driver.findElementById("hs-eu-confirmation-button").click();
        // Opens Menu burger icon
        driver.findElementByXPath("//a[.='Menu']").click();
        // Clicks "Our Work" link text
        driver.findElementByCssSelector("ul.nav-list>li:nth-child(3)").click(); // Click Our work link text
        // Get the text of the header locator
        String ourWorkHeader = driver.findElementByCssSelector(".hero-headline").getText();
        // Asserts the correct page with the header title
        Assert.assertEquals(ourWorkHeader, "Our Work");

    }
}