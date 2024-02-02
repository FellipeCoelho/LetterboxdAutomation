package page;

import static appiumCore.DriverFactory.getDriver;

import io.appium.java_client.MobileBy;

public class EditReview {
	
	public void escreverReview(String review) {
		getDriver().findElement(MobileBy.className("android.widget.EditText")).sendKeys(review);
		getDriver().findElements(MobileBy.className("android.widget.ImageButton")).get(0).click();
	}

}
