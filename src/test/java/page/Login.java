package page;

import static appiumCore.DriverFactory.getDriver;
import appiumCore.BasePage;
import io.appium.java_client.MobileBy;

public class Login extends BasePage {
	
	
	public void fazerLogin(String username, String password) {
		getDriver().findElement(MobileBy.id("com.letterboxd.letterboxd:id/username")).sendKeys(username);
		getDriver().findElement(MobileBy.id("com.letterboxd.letterboxd:id/password")).sendKeys(password);
		getDriver().findElement(MobileBy.id("com.letterboxd.letterboxd:id/go_button")).click();

	}
	

}
