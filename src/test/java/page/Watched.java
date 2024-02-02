package page;

import static appiumCore.DriverFactory.getDriver;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class Watched {
	
	
	public void dar5estrelas() {
		getDriver().findElement(MobileBy.id("com.letterboxd.letterboxd:id/rateStar10")).click();
	}
	
	public void darLike() {
		getDriver().findElement(MobileBy.id("com.letterboxd.letterboxd:id/likeButton")).click();
	}
	
	public void clicarReview() {
		getDriver().findElement(MobileBy.id("com.letterboxd.letterboxd:id/reviewButton")).click();
	}
	
	public void salvar() {
		getDriver().findElement(MobileBy.id("com.letterboxd.letterboxd:id/action_save")).click();
	}

	public void alterarData(String data) {
		MobileElement dataBotao = getDriver().findElement(MobileBy.id("com.letterboxd.letterboxd:id/dateValueLabelLong"));
		dataBotao.click();
		
		String txt = "February";
		MobileElement element = (MobileElement) getDriver().findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true))" +
						".scrollIntoView(new UiSelector().descriptionContains(\"" + txt + "\"))"));
		
		element.isDisplayed();
	
		getDriver().findElement(MobileBy.id("//android.view.View[[@content-desc='"+data+"']")).click(); 
		
		getDriver().findElement(MobileBy.id("com.letterboxd.letterboxd:id/mdtp_ok")).click();
		 
		//if (dataCalendar.isDisplayed() == true) {
		//	if (dataCalendar.isSelected() == true) {
		//		btnOK.click();
		//	}
		//		else {
		//			dataCalendar.click();
		//			btnOK.click();
		//}
		
	}
	
}
