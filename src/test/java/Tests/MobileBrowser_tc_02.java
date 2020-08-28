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
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertTrue;

/***
 Abrir Browser, ir a mercado Libre, realizar una búsqueda y verificar el resultado
 OPEN BROWSER AND NAVIGATE, CHROMEDRIVER VERSION FOR CHROME 74
 ***/

public class MobileBrowser_tc_02 extends Base {


    @Test
    public void openMercadoLibreAndSearch() throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Opens device browser and specified page
        // Select Mexico as the country of preference
        // Click on Zip code to add the ours
        // Send  xip code to locator input field
        // Confirm the zip code typed
        // Make a search
        // Hit enter after sending keys
        // Retrieve text from the locator
        // Assert our search with the result


    }
}