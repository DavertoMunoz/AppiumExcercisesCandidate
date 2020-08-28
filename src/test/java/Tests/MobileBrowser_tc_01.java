package Tests;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

/***
 Abrir la página de Encora y entrar a la sección "Contact Us", Llenar la forma menos el email, assert error message
OPEN BROWSER AND NAVIGATE, CHECK CHROMEDRIVER VERSION FOR MOBILE BROWSER
 ***/

public class MobileBrowser_tc_01 extends Base {


    @Test
    public void openPageFillContactForm() throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Opens device browser and page specified
        // Accept the terms and conditions, or cookies, whatever.
        // Opens Menu burger icon
        // Click on "Contact Us" page
        // Click on "Let's talk" button
        // Fill the form as specified



    }
}