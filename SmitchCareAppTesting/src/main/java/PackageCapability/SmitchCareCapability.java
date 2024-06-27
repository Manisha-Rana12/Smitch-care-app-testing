package PackageCapability;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class SmitchCareCapability {

	
	public AndroidDriver<AndroidElement> smitchCareCaps() throws MalformedURLException {
		
		DesiredCapabilities dec = new DesiredCapabilities();
		
		dec.setCapability(MobileCapabilityType.DEVICE_NAME, "V2033");
		dec.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dec.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.mysmitch.care");
		dec.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.mysmitch.care.ui.main.home.modules.explore.invite.InvitationActivity");
		dec.setCapability(MobileCapabilityType.NO_RESET, true);
		dec.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		
		AndroidDriver<AndroidElement>driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dec);
		
		return driver;
	}
}
