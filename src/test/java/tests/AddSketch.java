package tests;

import java.util.HashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class AddSketch extends BaseClass {

	
	
	@Test
	public void addSketch() throws InterruptedException {
		
	//click on more
		(driver.findElementById("com.sumanthakkala.medialines:id/textMoreOptions")).click();
		
		Thread.sleep(3000);
		//swipe left
		MobileElement pagerMore = (MobileElement)driver.findElementById("com.sumanthakkala.medialines:id/moreOptionsPager");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "left");
		scrollObject.put("elementId", ((RemoteWebElement) pagerMore).getId());
		scrollObject.put("percent", "0.75");
		
		js.executeScript("mobile: swipeGesture", scrollObject);
		
		Thread.sleep(3000);
		//click on add sketch button
		
		(driver.findElementById("com.sumanthakkala.medialines:id/sketchOptionLayout")).click();
		
		
		
		
		(new TouchAction(driver)).press(PointOption.point(939, 382))
		  .moveTo(PointOption.point(268,1079))
		  .release()
		  .perform();
		  
		  
		  
		  (new TouchAction(driver)).press(PointOption.point(0, 0))
			 
		  .moveTo(PointOption.point(268,1079))
		  .release()
		  .perform();
		  
		  
		  Thread.sleep(3000);
		  //saving image
		  MobileElement el2 = (MobileElement) driver.findElementById("com.sumanthakkala.medialines:id/fab_send_drawing");
		  el2.click();
		
	
		  
		  
	}


}


	
	
	
	

