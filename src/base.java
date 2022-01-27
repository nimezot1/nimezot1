import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {

	public static AndroidDriver<AndroidElement> capabilities(String device) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver;

		DesiredCapabilities cap = new DesiredCapabilities();

		File appDir = new File("src");

		File app = new File(appDir, "ApiDemos-debug.apk");

		//QUAL DISPOSITIVO DEVE RODAR?? emulator or real??
		if (device.equals("emulator")) {
			cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
			cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		} else if (device.equals("real")) {
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
			cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");

		}

		// No uiautomator1 é para android anterior do 5
		// No uiautomator2 é para android posterior do 5

		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

		return driver;
	}

}
