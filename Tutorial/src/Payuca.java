

	import java.net.MalformedURLException;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;

	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.android.AndroidElement;

	public class Payuca extends base {

		public static void main(String[] args) throws MalformedURLException {
			// TODO Auto-generated method stub
			AndroidDriver<AndroidElement> driver=capabilities();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElementByAndroidUIAutomator("text(\"Register\")").click();
			//driver.findElementByXPath("//android.widget.TextView[@text='\"Register\"']").click();
			driver.findElement(By.xpath("//*[@text='Register']")).click();
	}

}
