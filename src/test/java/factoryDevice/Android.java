package factoryDevice;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Android implements IDevice{
    @Override
    public AppiumDriver create() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","testerQA");
        capabilities.setCapability("platformVersion","9.0");

        //capabilities.setCapability("appPackage","com.android.calculator2");
        //capabilities.setCapability("appActivity","com.android.calculator2.Calculator");

        //capabilities.setCapability("appPackage","com.google.android.dialer");
        //capabilities.setCapability("appActivity","com.google.android.dialer.extensions.GoogleDialtactsActivity");

        //capabilities.setCapability("appPackage","com.android.contacts");
        //capabilities.setCapability("appActivity","com.android.contacts.activities.PeopleActivity");

        //capabilities.setCapability("appPackage","com.vrproductiveapps.whendo");
        //capabilities.setCapability("appActivity","com.vrproductiveapps.whendo.ui.HomeActivity");

        //Clock:
        //capabilities.setCapability("appPackage","com.google.android.deskclock");
        //capabilities.setCapability("appActivity","com.android.deskclock.DeskClock");

        //Messages:
        //capabilities.setCapability("appPackage","com.google.android.apps.messaging");
        //capabilities.setCapability("appActivity","com.google.android.apps.messaging.ui.ConversationListActivity");

        //Documents:
        capabilities.setCapability("appPackage","com.android.documentsui");
        capabilities.setCapability("appActivity","com.android.documentsui.files.FilesActivity");

        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("automationName","uiautomator2");

        AndroidDriver device = null;
        try {
            device = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        device.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return device;
    }
}
