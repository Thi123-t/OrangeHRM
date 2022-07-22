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

// FAILED
//WebUI.openBrowser('https://opensource-demo.orangehrmlive.com/')
WebUI.openBrowser(GlobalVariable.URL)
WebUI.maximizeWindow()
'Login with ESS user account'
//CustomKeywords.'common.CommonKeywords.Login'(username, password)

CustomKeywords.'common.CommonKeywords.Login'(GlobalVariable.USERNAME_ESS, GlobalVariable.PASSWORD_ESS)
WebUI.click(findTestObject('Dashboard/link_MyInfo'))

WebUI.click(findTestObject('MyInfo/button_AddAttachment'))

WebUI.verifyElementVisible(findTestObject('MyInfo/section_AddAttachment'))

WebUI.verifyElementVisible(findTestObject('MyInfo/heading_AddAttachment'))

WebUI.verifyElementText(findTestObject('MyInfo/heading_AddAttachment'), 'Add Attachment')

WebUI.verifyElementVisible(findTestObject('MyInfo/label_SeclectFile'))

WebUI.verifyElementText(findTestObject('MyInfo/label_SeclectFile'), 'Select File')

WebUI.verifyElementVisible(findTestObject('MyInfo/input_SelectFile'))

WebUI.verifyElementVisible(findTestObject('MyInfo/label_Comment'))

WebUI.verifyElementText(findTestObject('MyInfo/label_Comment'), 'Comment')

WebUI.verifyElementVisible(findTestObject('MyInfo/textarea_Comment'))

WebUI.verifyElementVisible(findTestObject('MyInfo/label_RequiredNote_Attachment'))

WebUI.verifyElementText(findTestObject('MyInfo/label_RequiredNote_Attachment'), '* Required field')

WebUI.verifyElementVisible(findTestObject('MyInfo/button_Upload'))

WebUI.verifyElementAttributeValue(findTestObject('MyInfo/button_Upload'), 'value', 'Upload', 2)

WebUI.verifyElementVisible(findTestObject('MyInfo/button_Cancel'))

WebUI.verifyElementAttributeValue(findTestObject('MyInfo/button_Cancel'), 'value', 'Cancel', 2)

WebUI.verifyElementClickable(findTestObject('MyInfo/input_SelectFile'))

WebUI.verifyElementClickable(findTestObject('MyInfo/textarea_Comment'))

WebUI.click(findTestObject('MyInfo/button_Upload'))

WebUI.verifyElementVisible(findTestObject('MyInfo/label_ErrorMessageSelectFile'))

WebUI.verifyElementText(findTestObject('MyInfo/label_ErrorMessageSelectFile'), 'This field is required', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MyInfo/button_Cancel'))

WebUI.verifyElementNotVisible(findTestObject('MyInfo/section_AddAttachment'), FailureHandling.OPTIONAL)

WebUI.closeBrowser()