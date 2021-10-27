import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.springframework.util.Assert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import junit.framework.Assert;


public class ecommerce2 extends base {

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
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"Jordan 6 Rings\").instance(0))"));

	     
		int count=    driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();

		    for(int i=0;i<count;i++)

		    {

		    String text=driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i-1).getText();

		   

		    if(text.equalsIgnoreCase("Jordan 6 Rings"))

		    {
		    	
		driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i-1).click();

		break;

		    }


		    }

		    //go to cart
		   driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		    
		
		
	}

}
