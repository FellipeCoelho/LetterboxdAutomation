package appiumCore;

import static appiumCore.DriverFactory.getDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;


public class BasePage {
	
	public void clicarPorTexto(String texto) {
		getDriver().findElement(MobileBy.xpath("//*[@text='"+texto+"']")).click();
	}
	
	public boolean apareceNaTela(String texto){
		return getDriver().findElement(MobileBy.xpath("//*[@text='"+texto+"']")).isDisplayed();
	}
	
	public void clicarPeloContentDesc(String texto) {
		getDriver().findElement(MobileBy.xpath("//*[@content-desc='"+texto+"']")).click();
	}
	
/*  public static boolean esperarElemento(MobileElement element) throws IOException {
    	boolean isElementPresent = true;
    		try {
    				WebDriverWait wait = new WebDriverWait(getDriver(), 10);
    				wait.until(ExpectedConditions.visibilityOf(element));
    				return isElementPresent;
    			}	catch (Exception e) {
    				return !isElementPresent;
    			}
    } */
	
	public void pausar() {
		try {
			Thread. sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	 public void clicarPelaCoordenada (int x, int y) {
		 TouchAction action = new TouchAction(getDriver());
		 action.tap(x, y).perform();
	    }
//	 
//	 public void clicarPelaClasse () {
//		 getDriver().findElement(MobileBy.className("android.view.View")).click();
//	 }
//	public void escrever(By by, String texto) {
//		getDriver().findElement(by).sendKeys(texto);				
//	}
//		
//	public void clicarPorIndex(String valor) {
//		getDriver().findElement(MobileBy.xpath("//*[@index='"+valor+"']")).click();
//	}
//	
//	public void clicarNoCombo(String texto, String nome) {
//		getDriver().findElement(MobileBy.xpath("//*[@text='"+texto+"']")).click();
//		getDriver().findElement(MobileBy.xpath("//*[@text='"+nome+"']")).click();
//	}
//	
//	public void clicarPorID(String id) {
//		getDriver().findElement(MobileBy.xpath("//*[@resource-id='"+id+"']")).click();
//	}


}
