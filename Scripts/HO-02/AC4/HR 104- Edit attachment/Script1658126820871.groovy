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

CustomKeywords.'common.CommonKeyword.Login'('Thicao', '@Thicao123')

WebUI.click(findTestObject('Page_OrangeHRM/link_My Info'))

WebUI.uploadFile(findTestObject('Page_OrangeHRM/input_Select File_ufile'), file)

WebUI.click(findTestObject('Page_OrangeHRM/input_Attachments_btnAddAttachment'))

WebUI.click(findTestObject('Page_OrangeHRM/input__btnSaveAttachment'))

WebUI.click(findTestObject('Page_OrangeHRM/a_Edit'))

WebUI.uploadFile(findTestObject('Page_OrangeHRM/input_Replace With_ufile'), file2)

WebUI.click(findTestObject('Page_OrangeHRM/input__btnUploadAttachment'))

WebUI.verifyTextPresent('Successfully Saved', false)

WebUI.closeBrowser()

