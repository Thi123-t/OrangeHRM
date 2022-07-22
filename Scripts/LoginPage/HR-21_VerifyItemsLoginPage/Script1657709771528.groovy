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

//WebUI.openBrowser('https://opensource-demo.orangehrmlive.com/')
//
//WebUI.maximizeWindow()

'Verify All Items Should Be Visible'
WebUI.verifyElementVisible(findTestObject('Login/image_OrangeHRM'))

WebUI.verifyElementVisible(findTestObject('Login/text_ExampleAccount'))

WebUI.verifyElementText(findTestObject('Login/text_ExampleAccount'), '( Username : Admin | Password : admin123 )')

WebUI.verifyElementVisible(findTestObject('Login/logo_HRForAll1'))

WebUI.verifyElementVisible(findTestObject('Login/logo_HRForAll2'))

WebUI.verifyElementVisible(findTestObject('Login/logo_HRForAll3'))

WebUI.verifyElementVisible(findTestObject('Login/text_LoginPanel'))

WebUI.verifyElementVisible(findTestObject('Login/image_LoginPanelBackground'))

WebUI.verifyElementVisible(findTestObject('Login/input_Username'))

WebUI.verifyElementText(findTestObject('Login/text_UsernameHint'), 'Username')

WebUI.verifyElementVisible(findTestObject('Login/icon_Person'))

WebUI.verifyElementVisible(findTestObject('Login/input_Password'))

WebUI.verifyElementText(findTestObject('Login/text_PasswordHint'), 'Password')

WebUI.verifyElementVisible(findTestObject('Login/icon_Password'))

WebUI.verifyElementVisible(findTestObject('Login/button_Login'))

WebUI.verifyElementAttributeValue(findTestObject('Login/button_Login'), 'value', 'LOGIN', 2)

WebUI.verifyElementVisible(findTestObject('Login/image_LoginButtonBackground'))

WebUI.verifyElementVisible(findTestObject('Login/link_ForgotPassword'))

WebUI.verifyElementText(findTestObject('Login/link_ForgotPassword'), 'Forgot your password?')

WebUI.verifyElementVisible(findTestObject('Login/text_Footer'))

WebUI.verifyElementText(findTestObject('Login/text_Footer'), 'OrangeHRM 4.10.1\n© 2005 - 2022 OrangeHRM, Inc. All rights reserved.')

WebUI.verifyElementVisible(findTestObject('Login/icon_LinkedIn'))

WebUI.verifyElementVisible(findTestObject('Login/icon_Facebook'))

WebUI.verifyElementVisible(findTestObject('Login/icon_Twitter'))

WebUI.verifyElementVisible(findTestObject('Login/icon_Youtube'))

'Click On Username Box'
WebUI.click(findTestObject('Login/input_Username'))

WebUI.verifyElementNotVisible(findTestObject('Login/text_UsernameHint'))

WebUI.verifyElementVisible(findTestObject('Login/text_PasswordHint'), FailureHandling.CONTINUE_ON_FAILURE)
'Input Value Into The Username Box'
WebUI.setText(findTestObject('Login/input_Username'), 'Admin')

WebUI.verifyElementAttributeValue(findTestObject('Login/input_Username'), 'value', 'Admin', 2)

WebUI.verifyElementAttributeValue(findTestObject('Login/input_Password'), 'value', '', 2)

'Delete Input Value And Click Outside The Username Box'
WebUI.clearText(findTestObject('Login/input_Username'))

WebUI.verifyElementAttributeValue(findTestObject('Login/input_Username'), 'value', '', 2)

WebUI.click(findTestObject('Login/text_ExampleAccount'))

WebUI.verifyElementVisible(findTestObject('Login/text_UsernameHint'), FailureHandling.CONTINUE_ON_FAILURE)
'Click On Password Box'
WebUI.click(findTestObject('Login/input_Password'))

WebUI.verifyElementNotVisible(findTestObject('Login/text_PasswordHint'))

WebUI.verifyElementVisible(findTestObject('Login/text_UsernameHint'), FailureHandling.CONTINUE_ON_FAILURE)

'Input Value Into The Password Box'
WebUI.setText(findTestObject('Login/input_Password'), 'Admin')

WebUI.verifyElementAttributeValue(findTestObject('Login/input_Password'), 'type', 'password', 2)

WebUI.verifyElementAttributeValue(findTestObject('Login/input_Password'), 'value', 'Admin', 2)

WebUI.verifyElementAttributeValue(findTestObject('Login/input_Username'), 'value', '', 2)

'Delete Input Value And Click Outside The Password Box'
WebUI.clearText(findTestObject('Login/input_Password'))

WebUI.verifyElementAttributeValue(findTestObject('Login/input_Password'), 'value', '', 2)

WebUI.click(findTestObject('Login/text_ExampleAccount'))

WebUI.verifyElementVisible(findTestObject('Login/text_PasswordHint'), FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.closeBrowser()

