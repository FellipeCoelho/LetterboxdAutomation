package page;

import static appiumCore.DriverFactory.getDriver;

import appiumCore.BasePage;
import io.appium.java_client.MobileBy;


public class Splash extends BasePage {
	
	public void navegarParaLogin() {
		getDriver().findElements(MobileBy.className("android.widget.LinearLayout")).get(5).click();
		
	}
	
	public void EscolherOpcaoLogin() {
		getDriver().findElement(MobileBy.id("com.letterboxd.letterboxd:id/tour_button_sign_in")).click();
			
	}
	
	
}
