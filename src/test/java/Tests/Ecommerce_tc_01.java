package Tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

 /***
  FILL THE FORM AND GO TO ITEM SCREEN TO SHOP
  ***/


    public class Ecommerce_tc_01 extends Base {

        @Test
        public void goToProductsPage() throws MalformedURLException {

            AndroidDriver<AndroidElement> driver = Capabilities();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            // Name field locator
            // Hides the keyboard
            // click on radio button selecting FEMALE
            // click on country list locator to show
            // Scrolls the list of countries and selects the value of 'text'
            // Click the "Let's shop" button
            // Retrieves the text of the toolbar_title
            // Assert above locator text


        }

    }

