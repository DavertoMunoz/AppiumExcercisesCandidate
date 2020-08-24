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

        driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("David Muñoz"); // Name field
        driver.findElementById("com.androidsample.generalstore:id/spinnerCountry").click(); // click on country list to show
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"Argentina\"));").click();
        driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click(); // click en botón final

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.androidsample.generalstore:id/productName")));

        // Gets the text of the item 01
        String item01 = driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(" + "new UiSelector().textMatches(\"Jordan 6 Rings\"))").getText();
        // Scroll the app until reach the item name
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(" + "new UiSelector().textMatches(\"Jordan 6 Rings\"))");
        // Click on the first element of the page, even repeated.
        driver.findElementByXPath("//android.widget.TextView[@text='ADD TO CART']").click();

        // Gets the text of the item 02
        String item02 = driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(" + "new UiSelector().textMatches(\"Jordan Lift Off\"))").getText();
        // Scroll the app until reach the item name
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(" + "new UiSelector().textMatches(\"Jordan Lift Off\"))");
        // Click on the first element of the page, even repeated
        driver.findElementByXPath("//android.widget.TextView[@text='ADD TO CART']").click();
        // Click on the cart icon to reach the final page
        driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();

        Assert.assertEquals(item01, "Jordan 6 Rings");
        Assert.assertEquals(item02, "Jordan Lift Off");
        System.out.println("The following items were added to the cart: " + item01 + " and " + item02 + ",that's two pairs of Jordan's!");
    }
}







