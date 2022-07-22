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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://tmasolutions-osondemand.orangehrm.com/symfony/web/index.php/auth/login')

WebUI.setText(findTestObject('Page_OrangeHRM/Username'), 'Admin')

WebUI.setText(findTestObject('Page_OrangeHRM/input_Password'), '4w@hOc@K@1AH')

WebUI.click(findTestObject('Page_OrangeHRM/Login'))

WebUI.click(findTestObject('Page_OrangeHRM/link_My Info'))

WebUI.click(findTestObject('Page_OrangeHRM/input__btnEdit'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_License Expiry Date_personaltxtLicExpDate'), '01-01-2022')

WebUI.verifyTextPresent('Should be a valid date in yyyy-mm-dd format', false)

WebUI.setText(findTestObject('Page_OrangeHRM/input_Date of Birth_personalDOB'), '15-06-1999')

WebUI.verifyTextPresent('Should be a valid date in yyyy-mm-dd format', false)

WebUI.closeBrowser()

