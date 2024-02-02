package page;

import static appiumCore.DriverFactory.getDriver;

import appiumCore.BasePage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class BrowseBy extends BasePage{
	
	public void selecionarFiltro(String genero) {
		getDriver().findElement(MobileBy.xpath("//*[@content-desc=\""+genero+"\"]")).click();
	}
	
	public void pesquisarTipo (String genero){
		
		MobileElement tipo = (MobileElement) getDriver().findElementByAndroidUIAutomator("new UiScrollable("
				+ "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().text(\"" + genero + "\"));");
		tipo.click();
		
			
		}
	
	public void clicarVoltar() {
		pausar();
		MobileElement btnVoltar = getDriver().findElement(MobileBy.xpath("//*[@content-desc=\"Navigate up\"]"));
		btnVoltar.isDisplayed();
		TouchAction action = new TouchAction(getDriver());
		 action.tap(btnVoltar).perform();

	}

		

}
