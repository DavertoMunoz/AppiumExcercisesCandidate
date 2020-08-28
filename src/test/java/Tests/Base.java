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

        File  generalStore= new File("src"); // To bring the app in the src folder
        File app1 = new File(generalStore, "General-Store.apk"); // Appium API demo build

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, ); // Open Emulator or real device emulator-5554 // Use adb devices on terminal to check connected devices
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,); // For Android
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 14);
        //capabilities.setCapability(MobileCapabilityType.APP,app2.getAbsolutePath()); // UNCOMMENT THIS FOR NATIVE APP TEST CASES
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome"); // UNCOMMENT THIS FOR BROWSER NAVIGATION - Ecommerce_tc_05
        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities); // Args, connection to server link and cap.abilities

        return driver;


    }
}

