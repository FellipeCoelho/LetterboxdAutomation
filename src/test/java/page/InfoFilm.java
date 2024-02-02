package page;

import static appiumCore.DriverFactory.getDriver;

import appiumCore.BasePage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class InfoFilm extends BasePage{

	
	public void clicarEmAdd() {
		getDriver().findElement(MobileBy.id("com.letterboxd.letterboxd:id/fab")).click();
	}
	
	public void clicarBotaoWatchlist() {
		MobileElement clicarWatchlist = getDriver().findElement(MobileBy.id("com.letterboxd.letterboxd:id/button_watchlist"));
		clicarWatchlist.click();

	}
	
	public void clicarVoltar() {
		getDriver().findElement(MobileBy.xpath("//*[@content-desc=\"Navigate up\"]")).click();
	}
	
	public void voltarModal() {
		clicarPelaCoordenada(554, 304); //precisa corrigir
		pausar();
	}
	
	public String retornaFilme() { //pegar o titulo de filme escolhido para conferir na lista
		
		//pausar();
		String titulo = getDriver().findElement(MobileBy.id("com.letterboxd.letterboxd:id/titleViewMain")).getText();
		return titulo;
	} 
	
}
