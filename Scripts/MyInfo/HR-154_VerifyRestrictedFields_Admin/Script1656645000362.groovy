import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

// PASSED
//WebUI.openBrowser('https://opensource-demo.orangehrmlive.com/')
WebUI.openBrowser(GlobalVariable.URL)
WebUI.maximizeWindow()
'Login with Admin account'
//CustomKeywords.'common.CommonKeywords.Login'(username, password)

CustomKeywords.'common.CommonKeywords.Login'(GlobalVariable.USERNAME_ADM, GlobalVariable.PASSWORD_ADM)
WebUI.click(findTestObject('DashboardAdmin/link_PIM'))

WebUI.click(findTestObject('DashboardAdmin/link_UserID'))

WebUI.click(findTestObject('MyInfo/button_Edit'))

WebUI.verifyElementAttributeValue(findTestObject('MyInfo/button_Edit'), 'value', 'Save', 2)

WebUI.verifyElementClickable(findTestObject('MyInfo/input_FirstName'))

WebUI.verifyElementClickable(findTestObject('MyInfo/input_MiddleName'))

WebUI.verifyElementClickable(findTestObject('MyInfo/input_LastName'))

WebUI.verifyElementClickable(findTestObject('MyInfo/input_LicenseExpiryDate'))

WebUI.verifyElementClickable(findTestObject('MyInfo/radio_MaleGender'))

WebUI.verifyElementClickable(findTestObject('MyInfo/radio_FemaleGender'))

WebUI.verifyElementClickable(findTestObject('MyInfo/dropdown_MaritalStatus'))

WebUI.verifyElementClickable(findTestObject('MyInfo/dropdown_Nationality'))

//WebUI.verifyElementClickable(findTestObject('MyInfo/input_NickName'))
//
//WebUI.verifyElementClickable(findTestObject('MyInfo/input_MilitaryService'))
//
//WebUI.verifyElementClickable(findTestObject('MyInfo/checkbox_Smoker'))

WebUI.verifyElementClickable(findTestObject('MyInfo/input_EmployeeId'))

WebUI.verifyElementClickable(findTestObject('MyInfo/input_DriverLicenseNumber'))

//WebUI.verifyElementClickable(findTestObject('MyInfo/input_SSNNumber'))
//
//WebUI.verifyElementClickable(findTestObject('MyInfo/input_SINNumber'))

WebUI.verifyElementClickable(findTestObject('MyInfo/input_DateOfBirth'))

WebUI.verifyElementClickable(findTestObject('MyInfo/input_OtherId'))

WebUI.setText(findTestObject('MyInfo/input_EmployeeId'), '2789')

WebUI.verifyElementAttributeValue(findTestObject('MyInfo/input_EmployeeId'), 'value', '2789', 2)

WebUI.setText(findTestObject('MyInfo/input_OtherId'), '0001')

WebUI.verifyElementAttributeValue(findTestObject('MyInfo/input_OtherId'), 'value', '0001', 2)

//WebUI.setText(findTestObject('MyInfo/input_SSNNumber'), '123456789')
//
//WebUI.verifyElementAttributeValue(findTestObject('MyInfo/input_SSNNumber'), 'value', '123456789', 2)
//
//WebUI.setText(findTestObject('MyInfo/input_SINNumber'), '123456789')
//
//WebUI.verifyElementAttributeValue(findTestObject('MyInfo/input_SINNumber'), 'value', '123456789', 2)

WebUI.setText(findTestObject('MyInfo/input_DriverLicenseNumber'), '013579')

WebUI.verifyElementAttributeValue(findTestObject('MyInfo/input_DriverLicenseNumber'), 'value', '013579', 2)

WebUI.click(findTestObject('MyInfo/image_CalendarBirthday'))

WebUI.verifyElementVisible(findTestObject('MyInfo/calendar_Datepicker'))

CustomKeywords.'common.CommonKeywords.selectDatepicker'(15, 11, 2004)

WebUI.verifyElementAttributeValue(findTestObject('MyInfo/input_DateOfBirth'), 'value', '2004-11-15', 2)

WebUI.click(findTestObject('MyInfo/button_Edit'))

//WebUI.verifyElementAttributeValue(findTestObject('MyInfo/button_Edit'), 'value', 'Processing', 2)
//WebUI.verifyTextPresent('Successfully Saved', false)

WebUI.verifyElementNotClickable(findTestObject('MyInfo/input_FirstName'))

WebUI.verifyElementNotClickable(findTestObject('MyInfo/input_MiddleName'))

WebUI.verifyElementNotClickable(findTestObject('MyInfo/input_LastName'))

WebUI.verifyElementNotClickable(findTestObject('MyInfo/input_LicenseExpiryDate'))

WebUI.verifyElementNotClickable(findTestObject('MyInfo/radio_MaleGender'))

WebUI.verifyElementNotClickable(findTestObject('MyInfo/radio_FemaleGender'))

WebUI.verifyElementNotClickable(findTestObject('MyInfo/dropdown_MaritalStatus'))

WebUI.verifyElementNotClickable(findTestObject('MyInfo/dropdown_Nationality'))

//WebUI.verifyElementNotClickable(findTestObject('MyInfo/input_NickName'))
//
//WebUI.verifyElementNotClickable(findTestObject('MyInfo/input_MilitaryService'))
//
//WebUI.verifyElementNotClickable(findTestObject('MyInfo/checkbox_Smoker'))

WebUI.verifyElementNotClickable(findTestObject('MyInfo/input_EmployeeId'))

WebUI.verifyElementNotClickable(findTestObject('MyInfo/input_DriverLicenseNumber'))

//WebUI.verifyElementNotClickable(findTestObject('MyInfo/input_SSNNumber'))
//
//WebUI.verifyElementNotClickable(findTestObject('MyInfo/input_SINNumber'))

WebUI.verifyElementNotClickable(findTestObject('MyInfo/input_DateOfBirth'))

WebUI.verifyElementNotClickable(findTestObject('MyInfo/input_OtherId'))

WebUI.verifyElementAttributeValue(findTestObject('MyInfo/input_EmployeeId'), 'value', '2789', 2)

WebUI.verifyElementAttributeValue(findTestObject('MyInfo/input_OtherId'), 'value', '0001', 2)

//WebUI.verifyElementAttributeValue(findTestObject('MyInfo/input_SSNNumber'), 'value', '123456789', 2)
//
//WebUI.verifyElementAttributeValue(findTestObject('MyInfo/input_SINNumber'), 'value', '123456789', 2)

WebUI.verifyElementAttributeValue(findTestObject('MyInfo/input_DriverLicenseNumber'), 'value', '013579', 2)

WebUI.verifyElementAttributeValue(findTestObject('MyInfo/input_DateOfBirth'), 'value', '2004-11-15', 2)

WebUI.verifyElementAttributeValue(findTestObject('MyInfo/button_Edit'), 'value', 'Edit', 2)

WebUI.closeBrowser()