package StepDefinitions;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.When;

import java.net.URL;
import java.util.concurrent.TimeUnit;
public class stepd {

	@When("^I launch calculator app$")
    public void i_launch_calculator_app() throws Throwable {
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Google Nexus 4");
        cap.setCapability("udid", "192.168.226.101:5555");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "4.4.4");
        cap.setCapability("automationName", "UiAutomator1");
        cap.setCapability("appPackage", "com.android.calculator2");
        cap.setCapability("appActivity", "com.android.calculator2.Calculator");
        Thread.sleep(5000);
        AppiumDriver wd = new AppiumDriver(url, cap);
        wd.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
        Thread.sleep(5000);
        }
}
