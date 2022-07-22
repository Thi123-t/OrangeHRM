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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.openBrowser('')

WebUI.navigateToUrl('https://tmasolutions-osondemand.orangehrm.com/symfony/web/index.php/auth/login')

WebUI.click(findTestObject('Page_OrangeHRM/a_Forgot your password'))

ld = WebUI.getUrl()

WebUI.verifyMatch(ld, 'https://tmasolutions-osondemand.orangehrm.com/symfony/web/index.php/auth/requestPasswordResetCode', 
    false)

// youtube
WebUI.click(findTestObject('Page_OrangeHRM/img_yt'))

WebUI.switchToWindowIndex(1)

yt = WebUI.getUrl()

WebUI.verifyMatch(yt, 'https://www.youtube.com/c/OrangeHRMInc', false)

WebUI.switchToWindowTitle('OrangeHRM')

// tw
WebUI.click(findTestObject('Page_OrangeHRM/img_tw'))

WebUI.switchToWindowIndex(2)

tw = WebUI.getUrl()

WebUI.verifyMatch(tw, 'https://twitter.com/orangehrm', false)

WebUI.switchToWindowTitle('OrangeHRM')

WebUI.click(findTestObject('Page_OrangeHRM/img_fb'))

WebUI.switchToWindowIndex(3)

fb = WebUI.getUrl()

WebUI.verifyMatch(fb, 'https://www.facebook.com/OrangeHRM', false)

WebUI.switchToWindowTitle('OrangeHRM')

// lin
WebUI.click(findTestObject('Page_OrangeHRM/img_in'))

WebUI.switchToWindowIndex(4)

lin = WebUI.getUrl()

WebUI.verifyMatch(lin, 'http://www.linkedin.com/groups?home=&gid=891077', false)

WebUI.switchToWindowTitle('OrangeHRM')

// link
WebUI.click(findTestObject('Page_OrangeHRM/a_OrangeHRM, Inc'))

WebUI.switchToWindowIndex(5)

orH = WebUI.getUrl()

WebUI.verifyMatch(orH, 'https://www.orangehrm.com/', false)

WebUI.closeBrowser()

