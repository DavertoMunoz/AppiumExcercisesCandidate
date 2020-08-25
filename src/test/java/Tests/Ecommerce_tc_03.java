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
 RETRIEVE FIVE LOCATORS AND PRINT THEM IN THE CONSOLE - PASS
 ***/


public class Ecommerce_tc_03 extends Base {

    @Test
    public void RetrieveAndAssertFourLocators() throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Gets Header Text 'General Store'
        String header = driver.findElementById("com.androidsample.generalstore:id/toolbar_title").getText();
        String selectCountryMessage = driver.findElementByXPath("//android.widget.TextView[@text='Select the country where you want to shop']").getText();
        // Gets the male radio button selector
        String maleRadioButton = driver.findElementById("com.androidsample.generalstore:id/radioMale").getText();
        // Get text of let's shop button
        String shopPinkButton = driver.findElementByClassName("android.widget.Button").getText();
        // store button variable
        MobileElement shopButton = driver.findElementByClassName("android.widget.Button");
        boolean isEnabled = shopButton.isEnabled();

        System.out.println(header +  " is the name of the application, " + "the radio button locator for male gender was found, " +
                " the Shop Button is enabled and marked as " + isEnabled + " and " + '"' + selectCountryMessage + '"');
        System.out.println("1. Locator of " + header + " was found");
        System.out.println("2. Locator of " + selectCountryMessage + " was found");
        System.out.println("3. Locator of " + maleRadioButton + " was found");
        System.out.println("4. Locator of " + shopPinkButton +  " button was found");


    }
}
