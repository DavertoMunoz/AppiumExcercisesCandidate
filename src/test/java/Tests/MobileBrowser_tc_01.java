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
 Abrir la página de Encora y entrar a la sección "Our Work", verificar la pagina.
OPEN BROWSER AND NAVIGATE, CHROMEDRIVER VERSION FOR CHROME 74
 ***/

public class MobileBrowser_tc_01 extends Base {


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
        // Click on "Contact Us" page
        driver.findElementByCssSelector("ul.nav-list>li:nth-child(7)").click();
        // Click on "Let's talk" button
        driver.findElementByCssSelector(".button-white");
        driver.findElementByName("firstname").sendKeys("John");
        driver.findElementByName("lastname").sendKeys("Glanton");
        driver.findElementByName("email").sendKeys("david.munoz@yopmail.com");
        driver.findElementByName("country_selector").click();
        WebElement country = driver.findElement(By.xpath("//option[.='Mexico']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", country);
        driver.findElementByXPath("//option[.='Mexico']").click();
        // driver.navigate().back();
        driver.findElementByName("message").sendKeys("This is an awesome company!");
        driver.hideKeyboard();
        driver.close();

        //driver.findElementByXPath("//option[.='Bermuda']").click();






//
//        // Get the text of the header locator
//        String ourWorkHeader = driver.findElementByCssSelector(".hero-headline").getText();
//        // Asserts the correct page with the header title
//        Assert.assertEquals(ourWorkHeader, "Our Work");

    }
}