package appiumCore;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DriverFactory {
	
	private static AndroidDriver<MobileElement> driver;
	
	public static AndroidDriver<MobileElement>getDriver(){
		if(driver == null) {
			createDriver();
		}
		return driver;
		
	}

	private static void createDriver() {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "emulator-5554");
		cap.setCapability("automationName", "uiautomator2");
		cap.setCapability("appPackage","com.letterboxd.letterboxd");
		cap.setCapability("appActivity","com.letterboxd.letterboxd.ui.activities.LaunchActivity");
		
		
		try {
			driver =new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}	
		
	
	public static void killDriver() {
		if(driver!= null) {
			driver.quit();
			driver = null;
		}
	}
	
	
}
