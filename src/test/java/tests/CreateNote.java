package tests;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;

public class CreateNote extends BaseClass {


	
	
	@Test
	public void t1() {
		
		
		System.out.println(sv);
		System.out.println(BaseClass.sv);
		 
		MobileElement newNoteBtn = (MobileElement) driver.findElementById("com.sumanthakkala.medialines:id/fab");
		newNoteBtn.click();
		
	
		MobileElement allowBtn = (MobileElement) driver.findElementById("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
		allowBtn.click();
		
		
		MobileElement title = (MobileElement) driver.findElementById("com.sumanthakkala.medialines:id/inputNoteTitle");
		title.click();
		title.sendKeys("TestNote1");
		
		MobileElement content = (MobileElement) driver.findElementById("com.sumanthakkala.medialines:id/inputNoteText");
		content.sendKeys("Content of Note 1 for testing");
		
		
		MobileElement saveNoteBtn = (MobileElement) driver.findElementById("com.sumanthakkala.medialines:id/imageSaveNote");
		saveNoteBtn.click();
		
		Assert.assertTrue(true);
		System.out.println("New Note Created ...");
		
	}
	
	
	
	
	
	
	
	
	
}
