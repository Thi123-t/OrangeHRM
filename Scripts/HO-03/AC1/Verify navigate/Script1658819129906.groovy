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

WebUI.click(findTestObject('Upload/Page_OrangeHRM/img_empPic'))

avt = WebUI.getUrl()

WebUI.verifyMatch(avt, 'https://tmasolutions-osondemand.orangehrm.com/symfony/web/index.php/pim/viewPhotograph/empNumber/5', 
    false)

WebUI.verifyElementText(findTestObject('Upload/Page_OrangeHRM/h1_Username'), 'Thi Thi Cao')

WebUI.verifyElementPresent(findTestObject('Upload/Page_OrangeHRM/img_empPic'), 0)

WebUI.verifyElementText(findTestObject('Upload/Page_OrangeHRM/h1_Photograph'), 'Photograph')

WebUI.verifyElementText(findTestObject('Upload/Page_OrangeHRM/label_Select a Photograph'), 'Select a Photograph')

WebUI.verifyElementPresent(findTestObject('Upload/Page_OrangeHRM/input_photofile'), 0)

WebUI.verifyElementText(findTestObject('Upload/Page_OrangeHRM/label_Accepts'), 'Accepts jpg, .png, .gif up to 1MB. Recommended dimensions: 200px X 200px')

WebUI.verifyElementPresent(findTestObject('Photograph/btn_Upload'), 0)

