

import java.net.MalformedURLException;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AppiumBasics extends AppiumBase {

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver=capabilities();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
			driver.closeApp();	
	}
}
