import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class gestures extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities("real");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();

		// Encontrando o lelemtno e "clicando" na tela
		// tap
		TouchAction t = new TouchAction(driver);
		// aqui ele procura pelo elemento e coloca na variavel
		WebElement expandList = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		// aqui ele clica no elemento
		t.tap(tapOptions().withElement(element(expandList))).perform();

		driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
		WebElement pn = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
		// aqui ele clica no elemento mas nao "solta do dedo" por 2 segundos
		t.longPress(longPressOptions().withElement(element(pn)).withDuration(ofSeconds(2))).release().perform();
		// aqui ele é verificado se o que apareceu está correto
		System.out.println(driver.findElementById("android:id/title").isDisplayed());
		// driver.findElementByXPath("//android.widget.TextView[@text='Sample
		// action']").click();
	}

}
