package Tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Base {

    public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {

        File apiDemo = new File("src"); // To bring the app in the src folder
        File sunSigns = new File("src");
        File app1 = new File(apiDemo, "APIDemos.apk"); // Appium API demo
        File app2 = new File(sunSigns, "General-Store.apk"); // Horoscope build

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554"); // Open Emulator or real device emulator-5554 // moto device"=: ZY22438ZDV
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2"); //
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 14);
        // capabilities.setCapability(MobileCapabilityType.APP,app2.getAbsolutePath()); // SELECT, GET AND INSTALL .APK
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities); // Args, connection to server link and cap.abilities

        return driver;


    }
}

