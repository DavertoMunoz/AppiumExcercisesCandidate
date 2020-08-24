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


public class Ecommerce_tc_04 extends Base {
    @Test
    public void assertItemsInCart() throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Name field
        driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("David Muñoz");
        // click on country list to show
        driver.findElementById("com.androidsample.generalstore:id/spinnerCountry").click();
        // Scrolls the list of countries and selects the value of 'text' in this case Argentina
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"Argentina\"));").click();
        // click on let's shop button
        driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();

        // Driver waits until the specified locator appears on the screen
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.androidsample.generalstore:id/productName")));

        // Gets the text of the item 01 - Check Text Matches to change the element
        String item01 = driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(" + "new UiSelector().textMatches(\"Jordan 6 Rings\"))").getText();
        // Scroll the app until reach the item01 name
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(" + "new UiSelector().textMatches(\"Jordan 6 Rings\"))");
        // Clicks "Add to Cart" locator
        driver.findElementByXPath("//android.widget.TextView[@text='ADD TO CART']").click();

        // Gets the text of the item 02 - Check Text Matches to change the element
        String item02 = driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(" + "new UiSelector().textMatches(\"Jordan Lift Off\"))").getText();
        // Scroll the app until reach the item02 name
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(" + "new UiSelector().textMatches(\"Jordan Lift Off\"))");
        // Clicks "Add to Cart" locator of the item02
        driver.findElementByXPath("//android.widget.TextView[@text='ADD TO CART']").click();
        // Click on the cart icon to reach the final page (Checkout)
        driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();

        // Assert items in checkout page
        Assert.assertEquals(item01, "Jordan 6 Rings");
        Assert.assertEquals(item02, "Jordan Lift Off");
        System.out.println("The following items were added to the cart: " + item01 + " and " + item02 + ",that's two pairs of Jordan's!");
    }
}







