import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class deipedemo extends base {
	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = capabilities("real");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TouchAction t = new TouchAction(driver);
		
		
		WebElement tap_views = driver.findElementByXPath("//*[@text='Views']");
		t.tap(tapOptions().withElement(element(tap_views))).perform();
		
		WebElement tap_date_widgest = driver.findElementByXPath("//*[@text='Date Widgets']");
		t.tap(tapOptions().withElement(element(tap_date_widgest))).perform();
		
		WebElement tap_inline = driver.findElementByXPath("//*[@text='2. Inline']");
		t.tap(tapOptions().withElement(element(tap_inline))).perform();
		
		
		driver.findElementByXPath("//*[@content-desc='9']").click();
		//nessas 4 linhas abaixo eu encontro os elementos, entao do primeiro elemento eu arrasto o dedo para o segundo
		//OBS: o ultimo elemento foi teste meu
		WebElement first_number = driver.findElementByXPath("//*[@content-desc='15']");
		WebElement second_number = driver.findElementByXPath("//*[@content-desc='30']");
		WebElement third_number = driver.findElementByXPath("//*[@content-desc='45']");
		t.longPress(longPressOptions().withElement(element(first_number)).withDuration(ofSeconds(5))).moveTo(element(second_number)).moveTo(element(third_number)).release().perform();
		
	}

}
