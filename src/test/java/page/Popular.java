package page;

import static appiumCore.DriverFactory.getDriver;

import appiumCore.BasePage;
import io.appium.java_client.MobileBy;


public class Popular extends BasePage{
		
	public void clicarEmAdicionar() {
		getDriver().findElement(MobileBy.id("com.letterboxd.letterboxd:id/addLogEntry_fab")).click();
			
	}
	
	public void abrirMenu() {
		getDriver().findElement(MobileBy.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")).click();
		
	}
	
	public void clicarEmPopular() {
		getDriver().findElement(MobileBy.id("com.letterboxd.letterboxd:id/popular_this_week_title")).click();
		
	}
	

}
