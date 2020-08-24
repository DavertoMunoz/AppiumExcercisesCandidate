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
            driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("David Muñoz"); // Name field
            driver.hideKeyboard(); // Need to hide the keyboard and hides the keyboard
            driver.findElementByXPath("//android.widget.RadioButton[@text='Female']").click(); // click on radio button selecting FEMALE
            driver.findElementById("com.androidsample.generalstore:id/spinnerCountry").click(); // click on country list to show
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+ "new UiSelector().text(\"Bahamas\"));").click(); // SCROLL Y SELECCIONA EL ELEMENTO BY NAME, BEAUTIFUL!!!!
            driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click(); // click en botón final

            WebDriverWait wait = new WebDriverWait (driver, 5); // THE FUCKING WAIT HELPED!!!!!!
            wait.until (ExpectedConditions.visibilityOfElementLocated(By.id ("com.androidsample.generalstore:id/productName")));

            String productsHeader = driver.findElement(By.id("toolbar_title")).getText();
            Assert.assertEquals("Products", productsHeader);
//            String toastMessage = driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
//            System.out.println(toastMessage);
            //name attribute for toast message will have content

        }

    }

