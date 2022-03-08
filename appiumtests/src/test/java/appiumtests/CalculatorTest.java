package appiumtests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class CalculatorTest {

	static AppiumDriver<MobileElement> driver;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		try {
			openCalculator();
		}catch(Exception exp) {
			System.out.println("Inside Try...");
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
	
	}
	
	public static void openCalculator() throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		
		
		System.out.println("Inside opencalc..."); 
		cap.setCapability("deviceName", "Google Nexus 4");
		cap.setCapability("udid", "192.168.32.101:5555");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "4.4.4");
		cap.setCapability("automationName", "UiAutomator1");
				
		cap.setCapability("appPackage", "com.android.calculator2");
		cap.setCapability("appActivity", "com.android.calculator2.Calculator");
		Thread.sleep(5000);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		Thread.sleep(5000);
		//Object driver = new AppiumDriver(url, cap);
		//AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url, cap);
		
		driver = new AppiumDriver<MobileElement>(url, cap);
		Thread.sleep(5000);
		
		
		System.out.println("Application Started...");
		
		MobileElement four = driver.findElement(By.id("com.android.calculator2:id/digit4"));
		MobileElement multiply = driver.findElement(By.id("com.android.calculator2:id/mul"));
		MobileElement five = driver.findElement(By.id("com.android.calculator2:id/digit5"));
		MobileElement equals = driver.findElement(By.id("com.android.calculator2:id/equal"));
		MobileElement result = driver.findElement(By.className("android.widget.EditText"));
		
		four.click();
		multiply.click();
		five.click();
		equals.click();
		
		String res = result.getText();
		System.out.println("\n Result is : "+res);
		
		System.out.println("Completed....");
		
		
	
	}
}
