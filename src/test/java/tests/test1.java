package tests;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;

public class test1 {

/*
	@Test
	public void method1() {
		// TODO Auto-generated method stub
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("implicit wait done");
		//driver.get("https://google.com");
		//driver.findElement(By.name("q")).sendKeys("Automation" + Keys.ENTER);
		MobileElement nextBtn =  driver.findElementById("com.sumanthakkala.medialines:id/onboardingActionButton");
	 	
	 	
		
	 	
	 	//com.sumanthakkala.medialines:id/onboardingSkipActionButton
	 	
	 	
		while(nextBtn.getText().equals("NEXT"))
		{
			Assert.assertEquals(nextBtn.getText(), "NEXT");
			
			
			System.out.println("next btn clicked..."+ nextBtn.getText());
			nextBtn.click();
			
			
			
		}
		

		
	}
	
	
	@Test
	public void method2() {
		// TODO Auto-generated method stub
		
		//driver.get("https://google.com");
		//driver.findElement(By.name("q")).sendKeys("Automation" + Keys.ENTER);
		MobileElement nextBtn =  driver.findElementById("com.sumanthakkala.medialines:id/onboardingActionButton");
	 	
MobileElement skipBtn =  driver.findElementById("com.sumanthakkala.medialines:id/onboardingSkipActionButton");
		
		Assert.assertEquals(nextBtn.getText(), "RESTORE");
		
		System.out.println("scenario 1 test completed..." +nextBtn.getText() );
		skipBtn.click();
		
		System.out.println("scenario 2 test completed");

		
	}
	*/
	
	
	
	
	@Test
	public void t1() {
		
		Assert.assertTrue(true);
		System.out.println("t1 called ...");
		
	}
	
	
	
	
	
	
	
	
	
}
