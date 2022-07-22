import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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
import internal.GlobalVariable as GlobalVariable

// PASSED
WebUI.openBrowser('https://opensource-demo.orangehrmlive.com/')
//WebUI.openBrowser(GlobalVariable.URL)
WebUI.maximizeWindow()
'Login with ESS user account'
CustomKeywords.'common.CommonKeywords.Login'(username, password)

//CustomKeywords.'common.CommonKeywords.Login'(GlobalVariable.USERNAME_ESS, GlobalVariable.PASSWORD_ESS)
WebUI.click(findTestObject('Dashboard/link_MyInfo'))

WebUI.click(findTestObject('MyInfo/button_EditCustom'))

WebUI.verifyElementAttributeValue(findTestObject('MyInfo/button_EditCustom'), 'value', 'Save', 2)

WebUI.verifyOptionSelectedByLabel(findTestObject('MyInfo/dropdown_BloodType'), '-- Select --', false, 2)

WebUI.verifyElementClickable(findTestObject('MyInfo/dropdown_BloodType'))

WebUI.selectOptionByValue(findTestObject('MyInfo/dropdown_BloodType'), 'O+', false)

WebUI.verifyOptionSelectedByValue(findTestObject('MyInfo/dropdown_BloodType'), 'O+', false, 2)

WebUI.click(findTestObject('MyInfo/button_EditCustom'))

WebUI.verifyTextPresent('Successfully Updated', false)

WebUI.verifyElementNotClickable(findTestObject('MyInfo/dropdown_BloodType'))

WebUI.verifyOptionSelectedByValue(findTestObject('MyInfo/dropdown_BloodType'), 'O+', false, 2)

WebUI.verifyElementAttributeValue(findTestObject('MyInfo/button_EditCustom'), 'value', 'Edit', 2)

WebUI.closeBrowser()