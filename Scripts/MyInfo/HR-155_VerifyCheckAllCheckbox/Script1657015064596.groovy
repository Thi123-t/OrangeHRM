import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

// PASSED
//WebUI.openBrowser('https://opensource-demo.orangehrmlive.com/')
WebUI.openBrowser(GlobalVariable.URL)

WebUI.maximizeWindow()
'Login with ESS user account'
//CustomKeywords.'common.CommonKeywords.Login'(username, password)

CustomKeywords.'common.CommonKeywords.Login'(GlobalVariable.USERNAME_ESS, GlobalVariable.PASSWORD_ESS)

WebUI.click(findTestObject('Dashboard/link_MyInfo'))

CustomKeywords.'myinfo.MyInfoKeywords.AddAttachment'('Test596KB.png')

CustomKeywords.'myinfo.MyInfoKeywords.AddAttachment'('Test901KB.docx')

// Click CheckAll checkbox
WebUI.check(findTestObject('MyInfo/checkbox_CheckAllAttachment'))

xpath_checkboxes = "//table[@id='tblAttachments']//tr//td//input"

TestObject object_checkboxes = CustomKeywords.'common.CommonKeywords.createObject'(xpath_checkboxes)

List<WebElement> checkboxes = WebUI.findWebElements(object_checkboxes, 10)

// Check all checkboxes of records in the table should be checked
for (WebElement checkbox:checkboxes) {
	object_checkbox = WebUI.convertWebElementToTestObject(checkbox, FailureHandling.STOP_ON_FAILURE)
	WebUI.verifyElementChecked(object_checkbox, 2)
}

// Uncheck any record in the table
TestObject object_first_checkbox = CustomKeywords.'common.CommonKeywords.createObject'("(${xpath_checkboxes})[1]")

WebUI.uncheck(object_first_checkbox)

// Check CheckAll checkbox should be unchecked
WebUI.verifyElementNotChecked(findTestObject('MyInfo/checkbox_CheckAllAttachment'), 2)

// Click the checkbox of the record that is unchecked
WebUI.check(object_first_checkbox)

// Check CheckAll checkbox should be checked
WebUI.verifyElementChecked(findTestObject('MyInfo/checkbox_CheckAllAttachment'), 2)

WebUI.closeBrowser()