import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

// PASSED
//WebUI.openBrowser('https://opensource-demo.orangehrmlive.com/')

WebUI.openBrowser(GlobalVariable.URL)
WebUI.maximizeWindow()

'Login with ESS user account'
//CustomKeywords.'common.CommonKeywords.Login'(username, password)

CustomKeywords.'common.CommonKeywords.Login'(GlobalVariable.USERNAME_ESS, GlobalVariable.PASSWORD_ESS)
WebUI.click(findTestObject('Dashboard/link_MyInfo'))

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

WebUI.setText(findTestObject('MyInfo/input_FirstName'), 'Nam')

WebUI.verifyElementAttributeValue(findTestObject('MyInfo/input_FirstName'), 'value', 'Nam', 2)

WebUI.setText(findTestObject('MyInfo/input_MiddleName'), 'Hoang')

WebUI.verifyElementAttributeValue(findTestObject('MyInfo/input_MiddleName'), 'value', 'Hoang', 2)

WebUI.setText(findTestObject('MyInfo/input_LastName'), 'Phan')

WebUI.verifyElementAttributeValue(findTestObject('MyInfo/input_LastName'), 'value', 'Phan', 2)

WebUI.click(findTestObject('MyInfo/image_CalendarLicense'))

WebUI.verifyElementVisible(findTestObject('MyInfo/calendar_Datepicker'))

CustomKeywords.'common.CommonKeywords.selectDatepicker'(7, 11, 2038)

WebUI.verifyElementAttributeValue(findTestObject('MyInfo/input_LicenseExpiryDate'), 'value', '2038-11-07', 2)

WebUI.check(findTestObject('MyInfo/radio_MaleGender'))

WebUI.verifyElementChecked(findTestObject('MyInfo/radio_MaleGender'), 2)

WebUI.selectOptionByValue(findTestObject('MyInfo/dropdown_MaritalStatus'), 'Single', false)

WebUI.verifyOptionSelectedByValue(findTestObject('MyInfo/dropdown_MaritalStatus'), 'Single', false, 2)

WebUI.selectOptionByLabel(findTestObject('MyInfo/dropdown_Nationality'), 'Vietnamese', false)

WebUI.verifyOptionSelectedByLabel(findTestObject('MyInfo/dropdown_Nationality'), 'Vietnamese', false, 2)

//WebUI.setText(findTestObject('MyInfo/input_NickName'), 'Nam Phan')
//
//WebUI.verifyElementAttributeValue(findTestObject('MyInfo/input_NickName'), 'value', 'Nam Phan', 2)
//
//WebUI.setText(findTestObject('MyInfo/input_MilitaryService'), 'No')
//
//WebUI.verifyElementAttributeValue(findTestObject('MyInfo/input_MilitaryService'), 'value', 'No', 2)
//
//WebUI.check(findTestObject('MyInfo/checkbox_Smoker'))
//
//WebUI.verifyElementChecked(findTestObject('MyInfo/checkbox_Smoker'), 2)

WebUI.click(findTestObject('MyInfo/button_Edit'))

//WebUI.verifyElementAttributeValue(findTestObject('MyInfo/button_Edit'), 'value', 'Processing', 2)

WebUI.waitForPageLoad(10)

WebDriver driver = DriverFactory.getWebDriver()
page = driver.findElement(By.tagName('body'))
String body = page.getText()
println("page body: ${body}")
'Get source code of current page'
//String source = driver.getPageSource()
//println("source: ${source}")
WebUI.verifyMatch(body, '.*class="message success fadable".*', true)

WebUI.verifyElementVisible(findTestObject('MyInfo/text_Message'))
WebUI.verifyTextPresent('Successfully Saved', false)
message = WebUI.getText(findTestObject('MyInfo/text_Message'))
println("message: ${message}")



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

WebUI.verifyElementAttributeValue(findTestObject('MyInfo/input_FirstName'), 'value', 'Nam', 2)

WebUI.verifyElementAttributeValue(findTestObject('MyInfo/input_MiddleName'), 'value', 'Hoang', 2)

WebUI.verifyElementAttributeValue(findTestObject('MyInfo/input_LastName'), 'value', 'Phan', 2)

WebUI.verifyElementAttributeValue(findTestObject('MyInfo/input_LicenseExpiryDate'), 'value', '2038-11-07', 2)

WebUI.verifyElementChecked(findTestObject('MyInfo/radio_MaleGender'), 2)

WebUI.verifyOptionSelectedByValue(findTestObject('MyInfo/dropdown_MaritalStatus'), 'Single', false, 2)

WebUI.verifyOptionSelectedByLabel(findTestObject('MyInfo/dropdown_Nationality'), 'Vietnamese', false, 2)

//WebUI.verifyElementAttributeValue(findTestObject('MyInfo/input_NickName'), 'value', 'Nam Phan', 2)
//
//WebUI.verifyElementAttributeValue(findTestObject('MyInfo/input_MilitaryService'), 'value', 'No', 2)
//
//WebUI.verifyElementChecked(findTestObject('MyInfo/checkbox_Smoker'), 2)

WebUI.verifyElementAttributeValue(findTestObject('MyInfo/button_Edit'), 'value', 'Edit', 2)

WebUI.closeBrowser()

