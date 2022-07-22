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

WebUI.setText(findTestObject('Page_OrangeHRM/input__personaltxtEmpFirstName'), '012345678901234567890123456789bamuoikytu')

WebUI.setText(findTestObject('Page_OrangeHRM/input_Middle Name_personaltxtEmpMiddleName'), '012345678901234567890123456789bamuoikytu')

WebUI.setText(findTestObject('Page_OrangeHRM/input__personaltxtEmpLastName'), '012345678901234567890123456789bamuoikytu')

WebUI.setText(findTestObject('Page_OrangeHRM/input_Employee Id_personaltxtEmployeeId'), '012345678901234567890123456789bamuoikytu')

WebUI.setText(findTestObject('Page_OrangeHRM/input_Other Id_personaltxtOtherID'), '012345678901234567890123456789bamuoikytu')

WebUI.setText(findTestObject('Page_OrangeHRM/input_concat(Driver, , s License Number)_personaltxtLicenNo'), '012345678901234567890123456789bamuoikytu')

WebUI.click(findTestObject('Page_OrangeHRM/input__btnSave'))

a = WebUI.getAttribute(findTestObject('Page_OrangeHRM/input__personaltxtEmpFirstName'), 'value')

WebUI.verifyMatch(a, '012345678901234567890123456789', false)

b = WebUI.getAttribute(findTestObject('Page_OrangeHRM/input_Middle Name_personaltxtEmpMiddleName'), 'value')

WebUI.verifyMatch(b, '012345678901234567890123456789', false)

c = WebUI.getAttribute(findTestObject('Page_OrangeHRM/input__personaltxtEmpLastName'), 'value')

WebUI.verifyMatch(c, '012345678901234567890123456789', false)

d = WebUI.getAttribute(findTestObject('Page_OrangeHRM/input_Employee Id_personaltxtEmployeeId'), 'value')

WebUI.verifyMatch(d, '0123456789', false)

e = WebUI.getAttribute(findTestObject('Page_OrangeHRM/input_Other Id_personaltxtOtherID'), 'value')

WebUI.verifyMatch(e, '012345678901234567890123456789', false)

f = WebUI.getAttribute(findTestObject('Page_OrangeHRM/input_concat(Driver, , s License Number)_personaltxtLicenNo'), 'value')

WebUI.verifyMatch(f, '012345678901234567890123456789', false)

