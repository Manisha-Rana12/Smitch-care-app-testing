package PackageCapability;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class SmitchCareCapability {
//
//	     public AppiumDriverLocalService service;
//	     
//	     //for starting the server
//	     
//		 public AppiumDriverLocalService startServer()
//		 {
//		 boolean flag = checkifserverisRunning(4723);
//		 if(!flag)
//		 {
//		 service = AppiumDriverLocalService.buildDefaultService();
//		 service.start();
//		 }
//		 return service;
//		 }
//		 public static boolean checkifserverisRunning(int port)
//		 {
//		 boolean isServerRunning=false;
//		 ServerSocket serversocket;
//		 try{
//		 serversocket = new ServerSocket(port);
//		 serversocket.close();
//		 }
//		 catch(IOException e)
//		 {
//		 isServerRunning = true;
//		 }
//		 finally {
//		 serversocket=null;
//		 }
//		 return isServerRunning;
//		 }

	
	
	public AndroidDriver<AndroidElement> smitchCareCaps() throws MalformedURLException {
		
		DesiredCapabilities dec = new DesiredCapabilities();
		
		dec.setCapability(MobileCapabilityType.DEVICE_NAME, "2201117SI");
		dec.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dec.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.mysmitch.care");
		dec.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.mysmitch.care.ui.main.home.modules.explore.invite.InvitationActivity");
		//dec.setCapability(MobileCapabilityType.NO_RESET, true);
		dec.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		
		AndroidDriver<AndroidElement>driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dec);
		
		return driver;
	}
}
