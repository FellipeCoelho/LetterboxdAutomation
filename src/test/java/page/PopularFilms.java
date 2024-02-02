package page;

import static appiumCore.DriverFactory.getDriver;

import java.util.Random;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class PopularFilms {

	public void escolherAleatorioPopular() {
		Random r = new Random();
		int random = r.nextInt(20)+1;
		//pelo amor de deus tentar mudar o xpath
		MobileElement banners  = getDriver().findElement(MobileBy.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/"
				+ "androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/"
				+ "android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/"
				+ "android.view.ViewGroup/android.view.ViewGroup/android.widget.GridView/"
				+ "android.view.ViewGroup["+random+"]/android.widget.RelativeLayout/"
				+ "android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView"));

		banners.click();
	}
		
	
	public void clicarVoltar() throws InterruptedException {
		MobileElement btnVoltar = getDriver().findElement(MobileBy.xpath("//*[@content-desc=\"Navigate up\"]"));
		btnVoltar.wait();
		TouchAction action = new TouchAction(getDriver());
		 action.tap(btnVoltar).perform();

	}
	
	
}
