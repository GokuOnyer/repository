import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {

	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub
		//chrome - url
		//App, device , 4723
		//AndroidDriver
		File appDir = new File("src");
		File app = new File(appDir, "General-Store.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		
		//Emulator
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "babafingo");	
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		
		//Real Android Device -Mi10T
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "F9D8ECBD");
		
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
			
		
	}

}