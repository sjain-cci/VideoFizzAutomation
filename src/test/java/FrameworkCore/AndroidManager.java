package test.java.FrameworkCore;

import cucumber.api.java.Before;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class AndroidManager  {
    public static AndroidDriver driver = null ;

    @Before
    public void Setup() throws MalformedURLException, InterruptedException {

        DesiredCapabilities capabilities = DesiredCapabilities.android();
        File appDir = new File("C:\\myAppiumProject\\apps\\videofizz");
        File app = new File(appDir, "app-debug.apk");
        capabilities.setCapability(MobileCapabilityType.PLATFORM, Platform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "ZY2239HR8Q");
        capabilities.setCapability(MobileCapabilityType.VERSION, "7.0");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("autoGrantPermissions","true");
        capabilities.setCapability("appPackage", "com.videofizz.fizz");
        capabilities.setCapability("appActivity", "com.videofizz.fizz.ui.activity.MainActivity");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

}
