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

'Verify Forgot Passwork Link'
WebUI.click(findTestObject('Login/link_ForgotPassword'))

url = WebUI.getUrl()

WebUI.verifyMatch(url, 'https://opensource-demo.orangehrmlive.com/index.php/auth/requestPasswordResetCode', false)

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')

'Verify Link Footer'
WebUI.click(findTestObject('Login/link_Footer'))

WebUI.switchToWindowIndex(1)

url = WebUI.getUrl()

WebUI.verifyMatch(url, 'https://www.orangehrm.com/', false)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')

'Verify LinkedIn Icon'
WebUI.click(findTestObject('Login/icon_LinkedIn'))

WebUI.switchToWindowIndex(1)

url = WebUI.getUrl()

WebUI.verifyMatch(url, 'http://www.linkedin.com/groups?home=&gid=891077', false)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')

'Verify Facebook Icon'
WebUI.click(findTestObject('Login/icon_Facebook'))

WebUI.switchToWindowIndex(1)

url = WebUI.getUrl()

WebUI.verifyMatch(url, 'https://www.facebook.com/OrangeHRM', false)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')

'Verify Twitter Icon'
WebUI.click(findTestObject('Login/icon_Twitter'))

WebUI.switchToWindowIndex(1)

url = WebUI.getUrl()

WebUI.verifyMatch(url, 'https://twitter.com/orangehrm', false)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')

'Verify Youtube Icon'
WebUI.click(findTestObject('Login/icon_Youtube'))

WebUI.switchToWindowIndex(1)

url = WebUI.getUrl()

WebUI.verifyMatch(url, 'https://www.youtube.com/orangehrm', false)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

//WebUI.closeBrowser()

