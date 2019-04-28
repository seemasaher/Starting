package Pageobject;


import org.openqa.selenium.WebDriver;
import utility.Keywords;

public class Registerpage {
	Keywords act= new Keywords();	

	// ------- Page Objects ------
	String btn_Register = "//a[@id='signup-link']";
	String txtbx_UserName = "sd-fullname";
	String txtbx_EmailID = "sd-email";
	String btn_LogIn = "sd-submit";
	
	
	// ------- Page functions ------
	
	//Click to register button
	public void clickregister(WebDriver driver) {		
		act.click(driver, "xpath", btn_Register);
		
}
	
	//Enter User name 
	   public void clickUsername(WebDriver driver) {
		   act.click(driver, "id", txtbx_UserName);
			act.EnterText(driver, "id", txtbx_UserName, "test_123");
		
		}

	
	//Enter Email id
			public void clickemail(WebDriver driver) {
				act.EnterText(driver, "id", txtbx_EmailID, "zomatotest820@gmail.com");
									
					}
	//Click Submit
			public void clicksubmit(WebDriver driver) {
				act.click(driver, "cssselector", btn_LogIn);
			
						
			}//end of functions
			
			
			
}// end of class