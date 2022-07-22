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

WebUI.clearText(findTestObject('Login/input_Username'))

WebUI.setText(findTestObject('Login/input_Username'), username)

WebUI.verifyElementAttributeValue(findTestObject('Login/input_Username'), 'value', username, 2)

WebUI.clearText(findTestObject('Login/input_Password'))

WebUI.setText(findTestObject('Login/input_Password'), password)

WebUI.verifyElementAttributeValue(findTestObject('Login/input_Password'), 'value', password, 2)

WebUI.click(findTestObject('Login/button_Login'))

url = WebUI.getUrl()

WebUI.verifyMatch(url, 'https://opensource-demo.orangehrmlive.com/index.php/dashboard', false)

WebUI.verifyTextPresent('Welcome', true)

//WebUI.closeBrowser()

