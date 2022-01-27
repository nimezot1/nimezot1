import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class webMotors extends baseWeb {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TouchAction t = new TouchAction(driver);
		
		//WebElement tap_views = driver.findElementByXPath("//*[@text='Views']");
		//t.tap(tapOptions().withElement(element(tap_views))).perform();
//		/*	
//- Listagem de veículos
//	Validar imagem do veículo
//		Dado que eu esteja no APP WebMotors
//		Quando estou na tela inicial
//		Entao vejo a imagem do veículo
		
//	Validar valor do veículo
//		Dado que eu esteja no APP WebMotors
//		Quando estou na tela inicial
//		Entao vejo o valor do veiculo
//	Validar marca do veículo
//		Dado que eu esteja no APP WebMotors
//		Quando estou na tela inicial
//		Entao vejo o marca do veiculo
//	Validar Ano/KM do veículo
//		Dado que eu esteja no APP WebMotors
//		Quando estou na tela inicial
//		Entao vejo o Ano e KM do veiculo
//		 */
	}

}
