import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
public class basisc extends base{

	/**
	 * @param args
	 * @throws MalformedURLException
	 */
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//XPath id className , androidUiautomator
		// Only ByXPath calls need // inside of the brackets
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		driver.findElementById("android:id/checkbox").click();
		//finding the element by "class", just add list number of the element.
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();		
		driver.findElementByClassName("android.widget.EditText").sendKeys("hello");
		// "get" commend uses programming counting way for numbers
		driver.findElementsByClassName("android.widget.Button").get(1).click();
		
		

		
		
	}

}
