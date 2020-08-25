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
  FILL THE FORM AND GO TO ITEM SCREEN TO SHOP - PASS
  ***/


    public class Ecommerce_tc_01 extends Base {

        @Test
        public void goToProductsPage() throws MalformedURLException {

            AndroidDriver<AndroidElement> driver = Capabilities();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            // Name field locator
            driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("David Muñoz");
            // Hides the keyboard
            driver.hideKeyboard();
            // click on radio button selecting FEMALE
            driver.findElementByXPath("//android.widget.RadioButton[@text='Female']").click();
            // click on country list locator to show
            driver.findElementById("com.androidsample.generalstore:id/spinnerCountry").click();
            // Scrolls the list of countries and selects the value of 'text'
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+ "new UiSelector().text(\"Bahamas\"));").click();
            // Click the "Let's shop" button
            driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();


            WebDriverWait wait = new WebDriverWait (driver, 5);
            // Driver waits until the specified locator appears on the screen
            wait.until (ExpectedConditions.visibilityOfElementLocated(By.id ("com.androidsample.generalstore:id/productName")));

            // Retrieves the text of the toolbar_title
            String productsHeader = driver.findElement(By.id("toolbar_title")).getText();
            // Assert above locator text
            Assert.assertEquals("Products", productsHeader);

//            String toastMessage = driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
//            System.out.println(toastMessage);
            //name attribute for toast message will have content

        }

    }

