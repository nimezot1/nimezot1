import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Uiautomatortest extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities("real");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// driver.findElementByAndroidUIAutomator("attribute("value")")
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		// driver.findElementByAndroidUIAutomator("text(\"Animation\")").click();

		// validate clickable teature for all option
		// driver.findElementsByAndroidUIAutomator("new UiSelector().property(true)");
		System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
	}

}
