package tests;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;

public class UpdateNote extends BaseClass{

	
	@Test
	public void editNote() throws InterruptedException {
		
		
		
		
		System.out.println("t2 started...");
		
		Thread.sleep(3000);
		
		MobileElement el11 = (MobileElement) driver.findElementById("com.sumanthakkala.medialines:id/noteLayout");
		el11.click();
		MobileElement el12 = (MobileElement) driver.findElementById("com.sumanthakkala.medialines:id/inputNoteTitle");
		el12.sendKeys("updated title");
		MobileElement el13 = (MobileElement) driver.findElementById("com.sumanthakkala.medialines:id/inputNoteText");
		el13.sendKeys("updated content");
		
		
		Thread.sleep(3000);
		
		MobileElement el4 = (MobileElement) driver.findElementById("com.sumanthakkala.medialines:id/textMoreOptions");
		el4.click();
		MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.TextView");
		el5.click();
		MobileElement el6 = (MobileElement) driver.findElementById("com.sumanthakkala.medialines:id/inputURL");
		el6.sendKeys("https://www.facebook.com");
		
		Thread.sleep(3000);
		
		MobileElement el7 = (MobileElement) driver.findElementById("com.sumanthakkala.medialines:id/addURLTV");
		el7.click();
		MobileElement el8 = (MobileElement) driver.findElementById("com.sumanthakkala.medialines:id/imageSaveNote");
		el8.click();
		MobileElement el9 = (MobileElement) driver.findElementById("com.sumanthakkala.medialines:id/noteLayout");
		el9.click();
		MobileElement el10 = (MobileElement) driver.findElementById("com.sumanthakkala.medialines:id/imageBack");
		el10.click();

		
		
		
		
		
		Assert.assertTrue(true);
		System.out.println("note updated ...");
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
