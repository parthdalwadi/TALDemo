package tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	
	
	public AppiumDriver<MobileElement> driver;
	
	@BeforeTest
	public void setup() throws MalformedURLException {
		
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		//dc.setCapability(MobileCapabilityType.UDID, "4aa1050c");
		
		//dc.setCapability(MobileCapabilityType.APP, "/Users/parthdalwadi/eclipse-workspace1/Appium_Mobile_Test/APKFile/scene.apk");
		
		dc.setCapability("appPackage", "com.sumanthakkala.medialines");
		dc.setCapability("appActivity", "com.sumanthakkala.medialines.activities.SplashActivity");
//		
		//dc.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
//		
		
		//working fine - tried and tested 
		//dc.setCapability("appPackage", "com.google.android.apps.messaging");
		//dc.setCapability("appActivity", "com.google.android.apps.messaging.ui.ConversationListActivity");
		
		
		
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		
		
		driver = new AppiumDriver<MobileElement>(url, dc); 
		 
		System.out.println("New test started");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
		
		// Going to the Main Activity
		MobileElement nextBtn =  driver.findElementById("com.sumanthakkala.medialines:id/onboardingActionButton");
		while(nextBtn.getText().equals("NEXT"))
		{
			System.out.println("next btn clicked..."+ nextBtn.getText());
			nextBtn.click();
			
		}
		
		MobileElement skipBtn =  driver.findElementById("com.sumanthakkala.medialines:id/onboardingSkipActionButton");
		skipBtn.click();
		
		
	}
	
	
	
	 
	@AfterTest
	public void teardown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
		 System.out.println("Test finished");
	}
	


}
