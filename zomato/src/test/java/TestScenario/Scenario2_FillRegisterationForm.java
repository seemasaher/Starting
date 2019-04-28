package TestScenario;

import initialisers.Constants;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pageobject.Registerpage;
import utility.GetBrowserInstance;
import utility.Keywords;
import utility.ScreenShotCapture;

public class Scenario2_FillRegisterationForm extends GetBrowserInstance
{
	//Initialize Objects
			WebDriver driver;
			Keywords act = new Keywords();
			
			//Initialize Variables
			String testStep;
			String testCase_Name = "Scenario2_FillRegisterationForm";
			
			//Initialize Driver
			@BeforeClass
			public void getBrowser(){
				this.driver = getDriver();
			}
			
			/*@Scenario: Fill and submit Registration
			 * submit registeration form
			 * */
			
			@Test(priority = 1)
			public void Scenario1() 
			{
				System.out.println(testCase_Name);
				System.out.println("//-----Scenario Starts --- //");
				try 
				{
					testStep = "User Navigates to Home page";
					act.gotToUrl(driver, Constants.url);				
					System.out.println(testStep + " - Passed");
					
					testStep = "User Clicks Register button to open register form";
					Registerpage clkregster = new Registerpage();				
					clkregster.clickregister(driver);
					System.out.println(testStep + " - Passed");
					
					testStep = "User enter username";
					Registerpage entrusrnm= new Registerpage();
					entrusrnm.clickUsername(driver);
					System.out.println(testStep + " - Passed");
					
					
					testStep = "User enter  email";
					Registerpage entreml= new Registerpage();
					entreml.clickemail(driver);
					System.out.println(testStep + " - Passed");
					
					testStep = "Click submit";
					Registerpage clcksbmt= new Registerpage();
					clcksbmt.clicksubmit(driver);
					System.out.println(testStep + " - Passed");
					
					
					
				} catch (Exception e) {
					ScreenShotCapture.captureScreen(driver, testCase_Name);
					System.out.println("//-----Scenario Ends --- //");
					Assert.fail("Test Scenario failed at Step --> " + testStep + "Error is: " + e);
				}

				System.out.println("//-----Scenario Ends --- //");
			}


}
