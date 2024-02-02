package page;

import static appiumCore.DriverFactory.getDriver;

import java.util.List;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class Search {
	
	public void clicarPorCategoria(String categoria) {
			
		MobileElement tipo = (MobileElement) getDriver().findElementByAndroidUIAutomator("new UiScrollable("
				+ "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().text(\"" + categoria + "\"));");
		tipo.click();
		
	}
	
	public void clicarVoltar() {
		MobileElement btnVoltar = getDriver().findElement(MobileBy.xpath("//*[@content-desc=\"Navigate up\"]"));
		btnVoltar.isDisplayed();
		TouchAction action = new TouchAction(getDriver());
		 action.tap(btnVoltar).perform();

	}

}
