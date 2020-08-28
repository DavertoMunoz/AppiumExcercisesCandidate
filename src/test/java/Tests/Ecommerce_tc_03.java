package Tests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

/***
 COMPARE AND ASSERT ITEMS IN SHOPPING CART
 ***/


public class Ecommerce_tc_03 extends Base {
    @Test
    public void assertItemsInCart() throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Name field
        // click on country list to show
        // Scrolls the list of countries and selects the value of 'text' in this case Argentina
        // click on let's shop button


        // Gets the text of the item 01 - Check Text Matches to change the element
        // Scroll the app until reach the item01 name
        // Clicks "Add to Cart" locator

        // Gets the text of the item 02 - Check Text Matches to change the element
        // Scroll the app until reach the item02 name
        // Clicks "Add to Cart" locator of the item02
        // Click on the cart icon to reach the final page (Checkout)

        // Assert items in checkout page

    }
}







