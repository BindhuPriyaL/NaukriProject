package com.selenium.naukri.NaukriResumeUpdate;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


import globalBox.*;
import webelementsBox.*;



public class LoginPage extends TestBase {
	ExcelUtils xls = new ExcelUtils(constants.EXCEL_PATH);

	@BeforeSuite
	public void setup() {
		new Connector();

	}

	@Test
	public void naukriLogin() {

		TextBoxUtils.type(xls.getCellData("Login Page", "EmailID", 2), LoginPageElem.emailID);
		TextBoxUtils.type(xls.getCellData("Login Page", "Password", 2), LoginPageElem.password);
		driver.findElement(By.xpath(LoginPageElem.password)).sendKeys(Keys.ENTER);
	}

	@Test(dependsOnMethods={"naukriLogin"})
	public void deleteUploadResume() throws InterruptedException {
		ClickUtils.clickWebElementByXpath(LoginPageElem.attchdResume);
		ClickUtils.clickWebElementByXpath(LoginPageElem.deletelink);
		ClickUtils.clickWebElementByXpath(LoginPageElem.confirmDeletebtn);
		ClickUtils.clickWebElementByXpath(LoginPageElem.attchdResume);
		ClickUtils.clickWebElementByXpath(LoginPageElem.uploadNewResume);
		ClickUtils.clickWebElementByXpath(LoginPageElem.chooseFilebtn);
		//Thread.sleep(1000);
		RobotUtils.copyPasteUsingRobot(xls.getCellData("Login Page", "ResumePath", 2));
		//Thread.sleep(5000);
		Assert.assertTrue(GetAttribute.objAttribute(LoginPageElem.uploadSuccessMsg, "innerHTML").equalsIgnoreCase("File uploaded successfully."), "Message is not matching");
		ClickUtils.clickWebElementByXpath(LoginPageElem.saveBtn);
		ClickUtils.clickWebElementByXpath(LoginPageElem.attchdResume);
		System.out.println("Resume was last updated on -> "+GetAttribute.objAttribute(LoginPageElem.lastUpdatedDate, "innerHTML"));
	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}
