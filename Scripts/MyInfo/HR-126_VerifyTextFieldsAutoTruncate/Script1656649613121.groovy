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

WebUI.setText(findTestObject('MyInfo/input_FirstName'), 'this string has 29 characters')

WebUI.verifyElementAttributeValue(findTestObject('MyInfo/input_FirstName'), 'value', 'this string has 29 characters', 2)

WebUI.setText(findTestObject('MyInfo/input_FirstName'), 'this string has 30 characters!')

WebUI.verifyElementAttributeValue(findTestObject('MyInfo/input_FirstName'), 'value', 'this string has 30 characters!', 2)

WebUI.setText(findTestObject('MyInfo/input_FirstName'), 'this string has 31 characters!@')

WebUI.verifyElementAttributeValue(findTestObject('MyInfo/input_FirstName'), 'value', 'this string has 31 characters!', 2)

WebUI.setText(findTestObject('MyInfo/input_FirstName'), 'this string has 33 characters!@#')

WebUI.verifyElementAttributeValue(findTestObject('MyInfo/input_FirstName'), 'value', 'this string has 33 characters!', 2)

WebUI.setText(findTestObject('MyInfo/input_MiddleName'), 'this string has 29 characters')

WebUI.verifyElementAttributeValue(findTestObject('MyInfo/input_MiddleName'), 'value', 'this string has 29 characters', 2)

WebUI.setText(findTestObject('MyInfo/input_MiddleName'), 'this string has 30 characters!')

WebUI.verifyElementAttributeValue(findTestObject('MyInfo/input_MiddleName'), 'value', 'this string has 30 characters!', 
    2)

WebUI.setText(findTestObject('MyInfo/input_MiddleName'), 'this string has 31 characters!@')

WebUI.verifyElementAttributeValue(findTestObject('MyInfo/input_MiddleName'), 'value', 'this string has 31 characters!', 
    2)

WebUI.setText(findTestObject('MyInfo/input_MiddleName'), 'this string has 33 characters!@#')

WebUI.verifyElementAttributeValue(findTestObject('MyInfo/input_MiddleName'), 'value', 'this string has 33 characters!', 
    2)

WebUI.setText(findTestObject('MyInfo/input_LastName'), 'this string has 29 characters')

WebUI.verifyElementAttributeValue(findTestObject('MyInfo/input_LastName'), 'value', 'this string has 29 characters', 2)

WebUI.setText(findTestObject('MyInfo/input_LastName'), 'this string has 30 characters!')

WebUI.verifyElementAttributeValue(findTestObject('MyInfo/input_LastName'), 'value', 'this string has 30 characters!', 2)

WebUI.setText(findTestObject('MyInfo/input_LastName'), 'this string has 31 characters!@')

WebUI.verifyElementAttributeValue(findTestObject('MyInfo/input_LastName'), 'value', 'this string has 31 characters!', 2)

WebUI.setText(findTestObject('MyInfo/input_LastName'), 'this string has 33 characters!@#')

WebUI.verifyElementAttributeValue(findTestObject('MyInfo/input_LastName'), 'value', 'this string has 33 characters!', 2)

//WebUI.setText(findTestObject('MyInfo/input_NickName'), 'this string has 29 characters')
//
//WebUI.verifyElementAttributeValue(findTestObject('MyInfo/input_NickName'), 'value', 'this string has 29 characters', 2)
//
//WebUI.setText(findTestObject('MyInfo/input_NickName'), 'this string has 30 characters!')
//
//WebUI.verifyElementAttributeValue(findTestObject('MyInfo/input_NickName'), 'value', 'this string has 30 characters!', 2)
//
//WebUI.setText(findTestObject('MyInfo/input_NickName'), 'this string has 31 characters!@')
//
//WebUI.verifyElementAttributeValue(findTestObject('MyInfo/input_NickName'), 'value', 'this string has 31 characters!', 2)
//
//WebUI.setText(findTestObject('MyInfo/input_NickName'), 'this string has 33 characters!@#')
//
//WebUI.verifyElementAttributeValue(findTestObject('MyInfo/input_NickName'), 'value', 'this string has 33 characters!', 2)
//
//WebUI.setText(findTestObject('MyInfo/input_MilitaryService'), 'this string has 29 characters')
//
//WebUI.verifyElementAttributeValue(findTestObject('MyInfo/input_MilitaryService'), 'value', 'this string has 29 characters', 
//    2)
//
//WebUI.setText(findTestObject('MyInfo/input_MilitaryService'), 'this string has 30 characters!')
//
//WebUI.verifyElementAttributeValue(findTestObject('MyInfo/input_MilitaryService'), 'value', 'this string has 30 characters!', 
//    2)
//
//WebUI.setText(findTestObject('MyInfo/input_MilitaryService'), 'this string has 31 characters!@')
//
//WebUI.verifyElementAttributeValue(findTestObject('MyInfo/input_MilitaryService'), 'value', 'this string has 31 characters!', 
//    2)
//
//WebUI.setText(findTestObject('MyInfo/input_MilitaryService'), 'this string has 33 characters!@#')
//
//WebUI.verifyElementAttributeValue(findTestObject('MyInfo/input_MilitaryService'), 'value', 'this string has 33 characters!', 
//    2)

WebUI.closeBrowser()