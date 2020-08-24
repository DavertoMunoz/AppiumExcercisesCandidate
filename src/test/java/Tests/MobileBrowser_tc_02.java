package Tests;


import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

/***
 OPEN BROWSER AND NAVIGATE, CHROMEDRIVER VERSION FOR CHROME 74
 ***/

public class MobileBrowser_tc_02 extends Base {

//    @FindBy(how = How.LINK_TEXT, using = "Our Work")
//    private MobileElement ourWorkLink;

    @Test
    public void opensMercadoLibreAndSearch() throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Opens device browser and page specified
        driver.get("http://mercadolibre.com/");
        // Accept the terms and conditions, or cookies, whatever.
        driver.findElementById("MX").click();
        // Opens Menu burger icon
        driver.findElementByCssSelector(".nav-header-cp-anchor").click();
        // Clicks "Our Work" link text
        driver.findElementByName("zipcode").sendKeys("83200"); // Click Our work link text
        // Get the text of the header locator
        driver.findElementByXPath("//span[contains(text(),'Usar')]").click();
        // Scroll to element "Mi cuenta"
        WebElement element = driver.findElement(By.xpath("//a[.='Mi cuenta']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);


//
//        new TouchAction(driver).press(PointOption.point(787, 0)).waitAction().moveTo(PointOption.point(2237, 0)).release().perform();


//        String ourWorkHeader = driver.findElementByCssSelector(".hero-headline").getText();
//        // Asserts the correct page with the header title
//        Assert.assertEquals(ourWorkHeader, "Our Work");

    }
}