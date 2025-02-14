
package SmitchCare;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.TouchAction;
import PackageCapability.SmitchCareCapability;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
public class SmitchCareHybridApp extends SmitchCareCapability{

	AndroidDriver<AndroidElement> driver;
	
	@BeforeTest
	public void test1() throws MalformedURLException {
		
		//service = startServer();
		
		driver = smitchCareCaps();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(enabled = true, priority = 1)
	public void basicPermision() throws InterruptedException {
		
		//get notified checkbox
		driver.findElement(MobileBy.id("com.mysmitch.care:id/imgNotification")).click();
		//allow
		driver.findElement(MobileBy.id("com.android.permissioncontroller:id/permission_allow_button")).click();
		//location checkbox
		driver.findElement(MobileBy.id("com.mysmitch.care:id/ivLocationCheck")).click();

		//allow location button
		driver.findElement(MobileBy.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();

		//nearBy share checkbox
		driver.findElement(MobileBy.id("com.mysmitch.care:id/ivNearyByCheck")).click();

		// allow nearby device button
		driver.findElement(MobileBy.id("com.android.permissioncontroller:id/permission_allow_button")).click();

		//bluetooth checkbox
		driver.findElement(MobileBy.id("com.mysmitch.care:id/ivBluetoothCheck")).click();

		//allow bluetooth button
		//driver.findElement(MobileBy.id("android:id/button1")).click();
		Thread.sleep(3000);

		//click next
		driver.findElement(MobileBy.id("com.mysmitch.care:id/btnNext")).click();

		  
		
	}
	
	@Test(enabled = true, priority = 2)
	public void login() {
		
		// click on login
		driver.findElement(MobileBy.id("com.mysmitch.care:id/txtLogin")).click();
		
		// click on already have account
		driver.findElement(MobileBy.id("com.mysmitch.care:id/btn_already_have_account")).click();
		
         // click on none of Above
		driver.findElement(MobileBy.id("com.google.android.gms:id/cancel")).click();
		
		//click on 'login with other method'
		driver.findElement(MobileBy.id("com.mysmitch.care:id/or_login_with_other_methods")).click();
		
		//click on 'Continue with Email'
		driver.findElement(MobileBy.xpath("//*[@text='Continue with Email']")).click();
		
		//sendkeys email  com.mysmitch.care:id/email
		driver.findElement(MobileBy.id("com.mysmitch.care:id/email")).sendKeys("manishacollection12@gmail.com");
		
		//sendkeys password
		driver.findElement(MobileBy.id("com.mysmitch.care:id/password")).sendKeys("Pass//00");
		
		//click on continue 
		driver.findElement(MobileBy.id("com.mysmitch.care:id/button_sign_in")).click();

		
	}
	       
	       
	@Test(enabled = false, priority = 3)
	public void moodFunctionality() throws InterruptedException {
		Thread.sleep(9000);
		// using coordinator for scrolling till mood (cause UiSelector is not working)
		int startX = 458;
		int startY = 985;
		int endX = 500;
		int endY = 500;

		new TouchAction<>(driver)
		.press(PointOption.point(startX, startY))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
		.moveTo(PointOption.point(endX, endY))
		.release()
		.perform();
		//driver.findElement(MobileBy.id("com.mysmitch.care:id/tvActivityLabel")).click();
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"MOOD\"));").click();


		driver.findElement(MobileBy.id("com.mysmitch.care:id/mood_title")).click(); 

		Thread.sleep(7000);

		//clicking on good mood emoji
		driver.findElement(MobileBy.id("com.mysmitch.care:id/good_image")).click();

		//clicking on next button
		driver.findElement(MobileBy.id("com.mysmitch.care:id/next")).click();

		//clicking on emojis using text
		driver.findElement(MobileBy.xpath("//*[@text='Calm']")).click();
		
//		driver.findElement(MobileBy.xpath("//*[@text='Relaxed']")).click();
//		
//		driver.findElement(MobileBy.xpath("//*[@text='Confident']")).click();
//		
//		driver.findElement(MobileBy.xpath("//*[@text='Focused']")).click();
//		
//		driver.findElement(MobileBy.xpath("//*[@text='Energetic']")).click();

		Thread.sleep(5000);


		// Using coordinator for performing swapping till strong
		int startX1 =131 ; //91
		int startY1 = 1407; 
		int endX1 = 911; //571
		int endY1 = 1407; //916

		TouchAction touchAction = new TouchAction(driver);
		touchAction.press(PointOption.point(startX1, startY1))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
		.moveTo(PointOption.point(endX1, endY1))
		.release()
		.perform();
		
		
		Thread.sleep(2000);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Working\"));").click();



		// scroll down till end in the current page
		int startX5 = 611;
		int startY5 = 2187;
		int endX5 = 500;
		int endY5 = 500;

		new TouchAction<>(driver)
		.press(PointOption.point(startX5, startY5))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
		.moveTo(PointOption.point(endX5, endY5))
		.release()
		.perform();

		//clicking on 'Place of study' emoji
		driver.findElement(MobileBy.xpath("//*[@text='Place of study']")).click();

		// adding some note in add note feild
		driver.findElement(MobileBy.id("com.mysmitch.care:id/add_notes")).click();
		Thread.sleep(4000);

		//adding note using sendKeys()
		driver.findElement(MobileBy.id("com.mysmitch.care:id/description")).sendKeys("Hi I Manisha. I am feeling good today");
		Thread.sleep(2000);

		//save the note
		driver.findElement(MobileBy.id("com.mysmitch.care:id/save_notes")).click();
		Thread.sleep(4000);

		//log the mood
		driver.findElement(MobileBy.id("com.mysmitch.care:id/log_mood")).click();

		//go two step back
		driver.pressKey(new KeyEvent(AndroidKey.BACK));


		//click on food
		driver.findElement(MobileBy.id("com.mysmitch.care:id/nutrition_title")).click();

		//click on lunch menu
		driver.findElement(MobileBy.id("com.mysmitch.care:id/tvLunch")).click();

		// will scroll down and click on nuts and seeds
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Nuts & Seeds\"));").click();

		driver.findElement(MobileBy.id("com.mysmitch.care:id/btnFinish")).click();

		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));

		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"HYDRATION\"));").click();
		//HYDRATION
		int startX3 = 87;
		int startY3= 1251;
		int endX3 = 102;
		int endY3 = 1081;

		new TouchAction<>(driver)
		.press(PointOption.point(startX3, startY3))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(8)))
		.moveTo(PointOption.point(endX3, endY3))
		.release()
		.perform();	     
		//sleep
		int startX4 = 225;
	        int startY4= 385;
	        int endX4 = 225;
	        int endY4 = 905;
	        new TouchAction<>(driver)
            .press(PointOption.point(startX4, startY4))
            .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(8)))
            .moveTo(PointOption.point(endX4, endY4))
            .release()
            .perform();
	        
//	        int startX2 = 91;
//	        int startY2 = 1047;
//	        int endX2 = 571;
//	        int endY2 = 916;
//	        
//	        	        touchAction.press(PointOption.point(startX2, startY2))
//	                   .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
//	                   .moveTo(PointOption.point(endX2, endY2))
//	                   .release()
//	                   .perform();
	        
	        
	}
	
	
}
