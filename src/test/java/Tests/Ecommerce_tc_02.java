package Tests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

/***
 RETRIEVE FIVE LOCATORS AND PRINT THEM IN THE CONSOLE
 ***/


public class Ecommerce_tc_02 extends Base {

    @Test
    public void RetrieveAndAssertFourLocators() throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Gets Header Text 'General Store'
        // Gets the male radio button selector
        // Get text of let's shop button
        // Store button variable
        // Print the locators with a message through console ("This locators are placed on...")

    }
}
