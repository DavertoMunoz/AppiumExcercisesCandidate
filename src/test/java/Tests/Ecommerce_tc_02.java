package Tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import static Tests.Base.Capabilities;

/***
 VALIDATE ERROR MESSAGE - PASS
 ***/

public class Ecommerce_tc_02 extends Base {

    @Test
    public void validateErrorMessage() throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Bukowksi"); // Name field
//        driver.hideKeyboard(); // Hides the keyboard
        driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click(); // Clicks let's shop button
        String toastMessage = driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name"); // Message error is displayed
        System.out.println(toastMessage);
        Assert.assertEquals("Please enter your name", toastMessage); // Actual validation to verify a test


    }
}
