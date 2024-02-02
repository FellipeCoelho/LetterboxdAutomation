package page;

import static appiumCore.DriverFactory.getDriver;
import static org.junit.Assert.assertEquals;

import java.util.List;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class Watchlist {

	public void confereFime(String filme) {
		MobileElement primeiroBanner = getDriver().findElement(MobileBy.xpath(""
				+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout"
				+ "/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout"
				+ "/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout"
				+ "/android.view.ViewGroup/android.view.ViewGroup/android.widget.GridView/android.view.ViewGroup[1]"
				+ "/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView"));
		String primeiroDaLista = primeiroBanner.getText();
		assertEquals(primeiroDaLista,filme);
		
			}
		
}
