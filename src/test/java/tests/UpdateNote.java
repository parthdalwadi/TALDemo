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
	public void t2() {
		
		
		
		
		System.out.println("t2 started...");
		
		MobileElement el11 = (MobileElement) driver.findElementById("com.sumanthakkala.medialines:id/noteLayout");
		el11.click();
		MobileElement el12 = (MobileElement) driver.findElementById("com.sumanthakkala.medialines:id/inputNoteTitle");
		el12.sendKeys("updated title");
		MobileElement el13 = (MobileElement) driver.findElementById("com.sumanthakkala.medialines:id/inputNoteText");
		el13.sendKeys("updated content");
		MobileElement el14 = (MobileElement) driver.findElementById("com.sumanthakkala.medialines:id/imageSaveNote");
		el14.click();
		
		
		Assert.assertTrue(true);
		System.out.println("note updated ...");
	}
	
	
	
	
	
	
	
	
	
}
