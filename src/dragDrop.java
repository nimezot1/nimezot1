import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class dragDrop extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities("real");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TouchAction t = new TouchAction(driver);
		
		WebElement tap_views = driver.findElementByXPath("//*[@text='Views']");
		t.tap(tapOptions().withElement(element(tap_views))).perform();
		
		WebElement tap_drag = driver.findElementByXPath("//*[@text='Drag and Drop']");
		t.tap(tapOptions().withElement(element(tap_drag))).perform();
		
		WebElement source = driver.findElementsByClassName("android.view.View").get(0);
		WebElement destination = driver.findElementsByClassName("android.view.View").get(2);
		
		//ESTA AÇÃO IRÁ ARRASTAR O ELEMNTO
		// as duas linhas sao iguais, mas a segunda é mais curta
		//t.longPress(longPressOptions().withElement(element(source))).moveTo(element(destination)).release().perform();
		t.longPress(element(source)).moveTo(element(destination)).release().perform();
		
	}

}
