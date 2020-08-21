package Tests;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

/***
OPEN BROWSER AND NAVIGATE, CHROMEDRIVER VERSION FOR CHROME 74
 ***/

public class Ecommerce_tc_05 extends Base {

    @Test
    public void openBrowser() throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.encora.com/");
        driver.quit();
        driver.close();
    }

}
