import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import java.io.File;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basics extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities("real");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Procurar e clicar por um elemento utilizando xpath
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		// Procurar e clicar por um elemento pelo ID
		driver.findElementById("android:id/checkbox").click();
		// Procurar por um elemento que tem a mesma classe. E utilizado a posição dele,
		// no caso a posição 2
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();

		// AULA 17 MOSTRA O QUE FAZER QUANDO TRAVAR O UI AUTOMATOR VIEW

		driver.findElementByClassName("android.widget.EditText").sendKeys("hello");
		driver.findElementsByClassName("android.widget.Button").get(1).click();

	}

}
