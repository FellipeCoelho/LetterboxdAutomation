package page;

import static appiumCore.DriverFactory.getDriver;

import io.appium.java_client.MobileBy;

public class AddFilm {

	public void imputFilme(String filme) {
		getDriver().findElement(MobileBy.id("android:id/search_src_text")).sendKeys(filme);
		getDriver().findElements(MobileBy.className("android.widget.TextView")).get(1).click();
	}
	
		
}
