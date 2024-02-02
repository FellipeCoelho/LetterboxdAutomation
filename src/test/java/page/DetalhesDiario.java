package page;

import static appiumCore.DriverFactory.getDriver;
import static org.junit.Assert.assertEquals;

import appiumCore.BasePage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class DetalhesDiario extends BasePage{
	

	public void conferirTitulo(String filme) {
		pausar();
		MobileElement titulo = getDriver().findElement(MobileBy.id("com.letterboxd.letterboxd:id/titleView"));
		String txtTitulo = titulo.getText();
		System.out.println(txtTitulo);
		
		assertEquals(txtTitulo, filme); 

	}	
	
	public void conferirReview(String comentario) {
		MobileElement review = getDriver().findElement(MobileBy.id("com.letterboxd.letterboxd:id/reviewTextView"));
		String txtReview = review.getText();
		System.out.println(txtReview);
		
		assertEquals(txtReview, comentario); 

	}
	
	public void conferirData(String data) {
		String[] date = data.split(" ");
		String dateDia = date[0];
		String dateMes = date[1];
		String dateAno = date[2];
		
		String inputData = "Watched "+dateMes+" "+dateDia+", "+dateAno+"";
		
		String infoData = getDriver().findElement(MobileBy.id("com.letterboxd.letterboxd:id/metadataView")).getText();
		
		assertEquals(infoData,inputData);

	}
	
	
}
