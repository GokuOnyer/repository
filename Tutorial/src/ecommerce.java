import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.springframework.util.Assert;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
//import junit.framework.Assert;


public class ecommerce extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("testME");
		
		driver.hideKeyboard();
		
		driver.findElement(By.xpath("//*[@text='Female']")).click();
		driver.findElement(By.xpath("//*[@text='Male']")).click();

		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Austria\"))");
		driver.findElement(By.xpath("//*[@text='Austria']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		String toasterMessage = driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
		System.out.println(toasterMessage);
		//Assert.assertEquals("Please enter your name", toasterMessage); // validation method
	}

}
