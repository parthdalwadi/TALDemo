package tests;

import java.util.HashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class saveNoteAsPDF extends BaseClass {

	
	
	@Test
	public void exportPdf() throws InterruptedException {
		
	//click on more
		(driver.findElementById("com.sumanthakkala.medialines:id/textMoreOptions")).click();
		
		Thread.sleep(3000);
		
		//swipe left
		MobileElement pagerMore = (MobileElement)driver.findElementById("com.sumanthakkala.medialines:id/moreOptionsPager");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "left");
		scrollObject.put("elementId", ((RemoteWebElement) pagerMore).getId());
		scrollObject.put("percent", "0.9");
		
		js.executeScript("mobile: swipeGesture", scrollObject);
		
		//click on add sketch button
		
		(driver.findElementById("com.sumanthakkala.medialines:id/exportPdfLayout")).click();
		
		
		
		
		//allow permission
		try {
			//	
			MobileElement allow = (MobileElement) driver.findElementById("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
			
			allow.click();
			
			
		} catch (Exception e) {
			System.out.println("element not found exception occurs...1");
			
		}
		Thread.sleep(3000);
		
		MobileElement pdf = null;;
		
		try {
			
			pdf = (MobileElement)driver.findElementById("com.google.android.apps.docs:id/pdf_view");
			
			
		} catch (Exception e) {
			System.out.println("pdf element not found");
		}
		
		
		
		HashMap<String, String> scrollObject2 = new HashMap<String, String>();
		//scrolling up
		scrollObject2.put("direction", "down");
		scrollObject2.put("elementId", ((RemoteWebElement) pdf).getId());
		scrollObject2.put("percent", "0.9");
		
		boolean canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", scrollObject2);
		
		
		  
		  
	}


}


	
	
	
	

