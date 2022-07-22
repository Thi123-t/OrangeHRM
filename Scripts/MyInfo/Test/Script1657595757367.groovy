import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

WebUI.openBrowser('https://opensource-demo.orangehrmlive.com/')
//WebUI.openBrowser(GlobalVariable.URL)

WebUI.maximizeWindow()

CustomKeywords.'common.CommonKeywords.LoginWithESSUser'('HarryKane', 'harrykane')
//CustomKeywords.'common.CommonKeywords.Login'(username, password)

WebUI.click(findTestObject('Dashboard/link_MyInfo'))

WebUI.click(findTestObject('MyInfo/button_Edit'))
//
//WebUI.waitForElementPresent(findTestObject('MyInfo/image_CalendarLicense'), 3)
//
//WebUI.click(findTestObject('MyInfo/image_CalendarLicense'))
//
//WebUI.verifyElementVisible(findTestObject('MyInfo/calendar_Datepicker'))
//
//String valueCalendar = WebUI.getAttribute(findTestObject('MyInfo/input_LicenseExpiryDate'), 'value')
//
//println("valueCalendar: $valueCalendar")
//
//CustomKeywords.'common.CommonKeywords.selectDate'(2, 9, 2020, valueCalendar)
//
//WebUI.verifyElementAttributeValue(findTestObject('MyInfo/input_LicenseExpiryDate'), 'value', '2020-09-02', 2)

WebUI.click(findTestObject('MyInfo/image_CalendarBirthday'))

WebUI.verifyElementVisible(findTestObject('MyInfo/calendar_Datepicker'))

valueCalendar = WebUI.getAttribute(findTestObject('MyInfo/input_DateOfBirth'), 'value')

println("valueCalendar: $valueCalendar")

CustomKeywords.'common.CommonKeywords.selectDate'(15, 11, 2004, valueCalendar)

CustomKeywords.'common.CommonKeywords.selectDatepicker'(2, 11, 2004)

WebUI.verifyElementAttributeValue(findTestObject('MyInfo/input_DateOfBirth'), 'value', '2004-11-2', 2)

WebUI.delay(5)

WebUI.click(findTestObject('MyInfo/button_Edit'))

WebUI.closeBrowser()

