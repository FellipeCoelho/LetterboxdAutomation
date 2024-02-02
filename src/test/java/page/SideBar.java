package page;

import static appiumCore.DriverFactory.getDriver;

import io.appium.java_client.MobileBy;

public class SideBar {
	
	public void clicarDiario() {
		getDriver().findElement(MobileBy.id("com.letterboxd.letterboxd:id/nav_diary")).click();
	}
	
	public void clicarWatchlist() {
		getDriver().findElement(MobileBy.id("com.letterboxd.letterboxd:id/nav_watchlist")).click();
	}
	
	public void clicarBuscar() {
		getDriver().findElement(MobileBy.id("com.letterboxd.letterboxd:id/nav_search")).click();
	}
		
}
