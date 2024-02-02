package page;

import static appiumCore.DriverFactory.getDriver;

import java.util.List;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class Diario {
	
	
	public void selecionarFilmeNaLista (String filme){
		
		List<MobileElement> filmes  = getDriver().findElements(MobileBy.id("com.letterboxd.letterboxd:id/titleView"));
		int qtFilmes = filmes.size();		
		
			for ( int i = 0; i < qtFilmes; i++) {
			
			String titulo = filmes.get(i).getText();
			
				if (titulo.equals(filme)) {
					filmes.get(i).click();
					break;
				}
			
			}
		
	}
	
	
	

}
