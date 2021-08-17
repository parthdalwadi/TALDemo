package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class ArchiveNote extends BaseClass {

	
	
	@Test
	public void ArchiveNote() throws InterruptedException {
		
		System.out.println("t3 started");
		//create new note
		MobileElement newNoteBtn = (MobileElement) driver.findElementById("com.sumanthakkala.medialines:id/fab");
		newNoteBtn.click();
		System.out.println("1");
	
		
		
		
		MobileElement title = (MobileElement) driver.findElementById("com.sumanthakkala.medialines:id/inputNoteTitle");
		
		title.sendKeys("To be Deleted");
		System.out.println("2");
		MobileElement content = (MobileElement) driver.findElementById("com.sumanthakkala.medialines:id/inputNoteText");
		content.sendKeys("Content of Note 2 for deleting");
		
		System.out.println("3");
		MobileElement saveNoteBtn = (MobileElement) driver.findElementById("com.sumanthakkala.medialines:id/imageSaveNote");
		saveNoteBtn.click();
		
		Thread.sleep(3000);
		System.out.println("4");
		Assert.assertTrue(true);
		System.out.println("New Note Created ...");
		
		//deleting note
		System.out.println("5");
		
		
		MobileElement el1 = (MobileElement) (driver.findElementsById("com.sumanthakkala.medialines:id/noteLayout")).get(0);
		el1.click();
		System.out.println("6");
		MobileElement el2 = (MobileElement) driver.findElementById("com.sumanthakkala.medialines:id/imageArchiveNote");
		el2.click();
		System.out.println("7");
		MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Open navigation drawer");
		el3.click();
		System.out.println("8");
		MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[2]");
		el4.click();
		System.out.println("9");
		
		Thread.sleep(3000);
		
		
		// going to deleted notes section
		MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("Open navigation drawer");
		el5.click();
		System.out.println("10");
		Thread.sleep(3000);
		Assert.assertTrue(true);
		
		
		MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[1]");
		el6.click();
		Thread.sleep(3000);
		
		System.out.println("t3 finished ...");
	}
	
	
	
	
	
	
	
	
	
	
}
