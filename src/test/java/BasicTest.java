import com.sun.activation.registries.MailcapParseException;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.junit.Test;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.session.W3CPlatformNameNormaliser;

import java.io.File;
import java.net.MalformedURLException;
import org.openqa.selenium.*;
import java.net.URL;


public class BasicTest {

    public static void main (String[] args) throws  MalformedURLException {
// apium code

        WebDriver driver;

        System.setProperty("webdriver.http.factory", "apache");

        File f = new File("src");
        File fs = new File(f,"MAH-app-ProductionFlavor-debug-2-7-49.apk");

        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "091609f08fb51d05");

        cap.setCapability(MobilePlatform.ANDROID,"Android");
        cap.setCapability(MobileCapabilityType.VERSION, "6.0.1");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "hu.vodafone.apps.myvodafone");

       cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "");

        cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
        //AndroidDriver driver =new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);

        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);

        //driver.quit();
    }
}
