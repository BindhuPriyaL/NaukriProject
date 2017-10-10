package com.selenium.naukri.NaukriResumeUpdate;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import globalBox.Connector;
import globalBox.ExcelUtils;
import globalBox.SubmitUtils;
import globalBox.TestBase;
import globalBox.TextBoxUtils;
import globalBox.WaitMethods;
import globalBox.constants;
import webelementsBox.LoginPageElem;

public class LoginPage extends TestBase{
	ExcelUtils xls=new ExcelUtils(constants.EXCEL_PATH);
	@BeforeSuite
	public void setup(){
		new Connector();
		
		
	}
	
	@Test
	public void naukriLogin() {
		
		TextBoxUtils.type(xls.getCellData("Login Page", "EmailID", 2), LoginPageElem.emailID);
		TextBoxUtils.type(xls.getCellData("Login Page", "Password", 2), LoginPageElem.password);
		driver.findElement(By.xpath(LoginPageElem.password)).sendKeys(Keys.ENTER);
		/*WaitMethods.Wait(50);
		SubmitUtils.submit(LoginPageElem.loginBtn);
		WaitMethods.Wait(50);*/
	}
	
	@AfterSuite 
	public void tearDown(){
		
	}
}
