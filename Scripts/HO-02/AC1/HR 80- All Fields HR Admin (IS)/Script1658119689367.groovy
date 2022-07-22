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

WebUI.setText(findTestObject('Page_OrangeHRM/input__personaltxtEmpFirstName'), 'Thi')

WebUI.setText(findTestObject('Page_OrangeHRM/input_Middle Name_personaltxtEmpMiddleName'), 'Thi')

WebUI.setText(findTestObject('Page_OrangeHRM/input__personaltxtEmpLastName'), 'Cao')

WebUI.setText(findTestObject('Page_OrangeHRM/input_Employee Id_personaltxtEmployeeId'), '123456789')

WebUI.setText(findTestObject('Page_OrangeHRM/input_Other Id_personaltxtOtherID'), '12345678A')

WebUI.setText(findTestObject('Page_OrangeHRM/input_concat(Driver, , s License Number)_personaltxtLicenNo'), '123456789')

WebUI.setText(findTestObject('Page_OrangeHRM/input_License Expiry Date_personaltxtLicExpDate'), '2030-01-01')

WebUI.click(findTestObject('Page_OrangeHRM/radio_GenderF'))

WebUI.selectOptionByLabel(findTestObject('Page_OrangeHRM/select_SingleMarriedOther'), 'Single', false)

WebUI.selectOptionByLabel(findTestObject('Page_OrangeHRM/select_Nationality'), 'Indian', false)

WebUI.click(findTestObject('Date Picker/img_datepicker'))

WebUI.selectOptionByLabel(findTestObject('Date Picker/select_Month'), 'Jun', false)

WebUI.selectOptionByLabel(findTestObject('Date Picker/select_Year'), '1999', false)

WebUI.click(findTestObject('Date Picker/select_Day'))

WebUI.click(findTestObject('Page_OrangeHRM/input__btnSave'))

WebUI.verifyTextPresent('Successfully Saved', false)

WebUI.refresh()

a = WebUI.getAttribute(findTestObject('Page_OrangeHRM/input__personaltxtEmpFirstName'), 'value')

WebUI.verifyMatch(a, 'Thi', false)

b = WebUI.getAttribute(findTestObject('Page_OrangeHRM/input_Middle Name_personaltxtEmpMiddleName'), 'value')

WebUI.verifyMatch(b, 'Thi', false)

c = WebUI.getAttribute(findTestObject('Page_OrangeHRM/input__personaltxtEmpLastName'), 'value')

WebUI.verifyMatch(c, 'Cao', false)

d = WebUI.getAttribute(findTestObject('Page_OrangeHRM/input_Employee Id_personaltxtEmployeeId'), 'value')

WebUI.verifyEqual(d, 123456789)

e = WebUI.getAttribute(findTestObject('Page_OrangeHRM/input_Other Id_personaltxtOtherID'), 'value')

WebUI.verifyMatch(e, '12345678A', false)

f = WebUI.getAttribute(findTestObject('Page_OrangeHRM/input_concat(Driver, , s License Number)_personaltxtLicenNo'), 'value')

WebUI.verifyMatch(f, '123456789', false)

g = WebUI.getAttribute(findTestObject('Page_OrangeHRM/input_License Expiry Date_personaltxtLicExpDate'), 'value')

WebUI.verifyMatch(g, '2030-01-01', false)

WebUI.verifyElementChecked(findTestObject('Page_OrangeHRM/radio_GenderF'), 0)

WebUI.verifyOptionPresentByLabel(findTestObject('Page_OrangeHRM/select_SingleMarriedOther'), 'Single', false, 0)

WebUI.verifyOptionPresentByLabel(findTestObject('Page_OrangeHRM/select_Nationality'), 'Indian', false, 0)

k = WebUI.getAttribute(findTestObject('Page_OrangeHRM/input_Date of Birth_personalDOB'), 'value')

WebUI.verifyMatch(k, '1999-06-01', false)

WebUI.closeBrowser()

