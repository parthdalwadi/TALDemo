package tests;

import java.util.HashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;


public class AddImages extends BaseClass {

	
	@Test
	public void TestOtherFeatures() throws InterruptedException {
		
		// plus button
		MobileElement el1 = (MobileElement) driver.findElementById("com.sumanthakkala.medialines:id/fab");
		el1.click();
		
		
		try {
			//	
			MobileElement allow = (MobileElement) driver.findElementById("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
			
			allow.click();
			
			
		} catch (Exception e) {
			System.out.println("element not found exception occurs...1");
			
		}
		
		
		System.out.println("going to back screen");
		driver.findElementById("com.sumanthakkala.medialines:id/imageBack").click();
		System.out.println("wait started");
		Thread.sleep(3000);
		
		System.out.println("finding yes button");
		MobileElement yes = (MobileElement) driver.findElementById("com.sumanthakkala.medialines:id/yesGoBackTV");
		
		yes.click();
		System.out.println("yes button clicked");
		
		Thread.sleep(3000);
		el1 = (MobileElement) driver.findElementById("com.sumanthakkala.medialines:id/fab");
		
		el1.click();
		
		try {
			//	
			MobileElement allow2 = (MobileElement) driver.findElementById("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
			
			allow2.click();
			
			
		} catch (Exception e) {
			System.out.println("element not found exception occurs...2");
			
		}
		
		
		//Title
		MobileElement el2 = (MobileElement) driver.findElementById("com.sumanthakkala.medialines:id/inputNoteTitle");
		el2.sendKeys("images");
		
		//more
		MobileElement el3 = (MobileElement) driver.findElementById("com.sumanthakkala.medialines:id/textMoreOptions");
		el3.click();
		Thread.sleep(3000);
		
		//color set
		MobileElement el4 = (MobileElement) driver.findElementById("com.sumanthakkala.medialines:id/imageForColor4");
		el4.click();
		
		//Take Photo by camera
		MobileElement el5 = (MobileElement) driver.findElementById("com.sumanthakkala.medialines:id/takePhotoLayout");
		el5.click();
		
		Thread.sleep(3000);
		// allow file storage
		
		try {
			MobileElement allow_file = (MobileElement) driver.findElementById("com.android.permissioncontroller:id/permission_allow_button");
			allow_file.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("exceltion----allow not visible");
			
		}
		System.out.println("clicking photo now");
		//click photo
		MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("Shutter");
		el6.click();
		System.out.println("shutter clicked");
		MobileElement el7 = (MobileElement) driver.findElementByAccessibilityId("Done");
		el7.click();
		
		System.out.println("done clicked");
		
		Thread.sleep(3000);
		// more options
		MobileElement el8 = (MobileElement) driver.findElementById("com.sumanthakkala.medialines:id/textMoreOptions");
		el8.click();
		
		
		System.out.println("adding image now");
		//add image button
				MobileElement imgBtn = (MobileElement) driver.findElementById("com.sumanthakkala.medialines:id/addImageLayout");
				imgBtn.click();
				
				
				try {
					MobileElement allow_file = (MobileElement) driver.findElementById("com.android.permissioncontroller:id/permission_allow_button");
					allow_file.click();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					
				}
				
		MobileElement el10 = (MobileElement) driver.findElementById("com.google.android.apps.photos:id/image");
		el10.click();
		MobileElement el11 = (MobileElement) driver.findElementByAccessibilityId("Photo taken on Aug 16, 2021 1:49:25 PM");
		el11.click();
		MobileElement el12 = (MobileElement) driver.findElementById("com.google.android.apps.photos:id/recycler_view");
		el12.click();
		MobileElement el13 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.LinearLayoutCompat");
		el13.click();
		
		Thread.sleep(3000);
		
		
		// more options
		MobileElement el8_2 = (MobileElement) driver.findElementById("com.sumanthakkala.medialines:id/textMoreOptions");
		el8_2.click();
		
		
		Thread.sleep(3000);
		MobileElement pagerMore = (MobileElement)driver.findElementById("com.sumanthakkala.medialines:id/moreOptionsPager");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "left");
		scrollObject.put("elementId", ((RemoteWebElement) pagerMore).getId());
		scrollObject.put("percent", "0.9");
		js.executeScript("mobile: swipeGesture", scrollObject);
		

		Thread.sleep(3000);
		
		// add new task
		System.out.println("adding new task");
		System.out.println("1");
		MobileElement newTask = (MobileElement) driver.findElementById("com.sumanthakkala.medialines:id/checkboxesOptionLayout");
		newTask.click();
		System.out.println("2");
		MobileElement el2_2 = (MobileElement) driver.findElementById("com.sumanthakkala.medialines:id/checkboxText_ET");
		el2_2.sendKeys("my first task");
		System.out.println("3");
		
		// more options
				MobileElement el8_3 = (MobileElement) driver.findElementById("com.sumanthakkala.medialines:id/textMoreOptions");
				el8_3.click();
				js.executeScript("mobile: swipeGesture", scrollObject);
				
				System.out.println("4");
		//again new task
		newTask = (MobileElement) driver.findElementById("com.sumanthakkala.medialines:id/checkboxesOptionLayout");
		newTask.click();
		System.out.println("5");
		//second task
		MobileElement el5_2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[2]/android.widget.EditText");
		el5_2.sendKeys("task no 2");
		System.out.println("6");
		
		
		Thread.sleep(3000);
		// checking off first check box
		MobileElement el10_2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[1]/android.widget.CheckBox");
		el10_2.click();
		
		System.out.println("7");

	}

	
	
   

	
	
}
