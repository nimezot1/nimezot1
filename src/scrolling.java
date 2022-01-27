import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class scrolling extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities("real");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TouchAction t = new TouchAction(driver);
		
		WebElement tap_views = driver.findElementByXPath("//*[@text='Views']");
		t.tap(tapOptions().withElement(element(tap_views))).perform();
		// utilizar scroll até achar o elemnto mencionado (elemento tipo texto)
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Switches\"));");
		System.out.println(driver.findElementByXPath("//*[@text='Switches']").isDisplayed());
		
		//Teste com tap no scroll (aqui ele só vai dar o tap no botao)
		WebElement tap_scroll = driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Switches\"));");
		t.tap(tapOptions().withElement(element(tap_scroll))).perform();
	}

}
