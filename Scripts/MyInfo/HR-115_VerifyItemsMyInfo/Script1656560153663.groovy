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

// PASSED
//WebUI.openBrowser('https://opensource-demo.orangehrmlive.com/')
WebUI.openBrowser(GlobalVariable.URL)

WebUI.maximizeWindow()

//CustomKeywords.'common.CommonKeywords.Login'(username, password)
'Login with ESS user account'
CustomKeywords.'common.CommonKeywords.Login'(GlobalVariable.USERNAME_ESS, GlobalVariable.PASSWORD_ESS)

WebUI.click(findTestObject('Dashboard/link_MyInfo'))

WebUI.verifyElementVisible(findTestObject('MyInfo/text_FullName'))

WebUI.verifyElementText(findTestObject('MyInfo/text_FullName'), 'Nam Phan')

WebUI.verifyElementVisible(findTestObject('MyInfo/image_Picture'))

WebUI.verifyElementVisible(findTestObject('MyInfo/link_PersonalDetails'))

WebUI.verifyElementText(findTestObject('MyInfo/link_PersonalDetails'), 'Personal Details')

WebUI.verifyElementVisible(findTestObject('MyInfo/link_ContactDetails'))

WebUI.verifyElementText(findTestObject('MyInfo/link_ContactDetails'), 'Contact Details')

WebUI.verifyElementVisible(findTestObject('MyInfo/link_EmergencyContacts'))

WebUI.verifyElementText(findTestObject('MyInfo/link_EmergencyContacts'), 'Emergency Contacts')

WebUI.verifyElementVisible(findTestObject('MyInfo/link_Dependents'))

WebUI.verifyElementText(findTestObject('MyInfo/link_Dependents'), 'Dependents')

WebUI.verifyElementVisible(findTestObject('MyInfo/link_Immigration'))

WebUI.verifyElementText(findTestObject('MyInfo/link_Immigration'), 'Immigration')

WebUI.verifyElementVisible(findTestObject('MyInfo/link_Job'))

WebUI.verifyElementText(findTestObject('MyInfo/link_Job'), 'Job')

WebUI.verifyElementVisible(findTestObject('MyInfo/link_Salary'))

WebUI.verifyElementText(findTestObject('MyInfo/link_Salary'), 'Salary')

//WebUI.verifyElementVisible(findTestObject('MyInfo/link_TaxExemptions'))
//
//WebUI.verifyElementText(findTestObject('MyInfo/link_TaxExemptions'), 'Tax Exemptions')

WebUI.verifyElementVisible(findTestObject('MyInfo/link_ReportTo'))

WebUI.verifyElementText(findTestObject('MyInfo/link_ReportTo'), 'Report-to')

WebUI.verifyElementVisible(findTestObject('MyInfo/link_Qualifications'))

WebUI.verifyElementText(findTestObject('MyInfo/link_Qualifications'), 'Qualifications')

WebUI.verifyElementVisible(findTestObject('MyInfo/link_Memberships'))

WebUI.verifyElementText(findTestObject('MyInfo/link_Memberships'), 'Memberships')

WebUI.verifyElementVisible(findTestObject('MyInfo/heading_PersonalDetails'))

WebUI.verifyElementText(findTestObject('MyInfo/heading_PersonalDetails'), 'Personal Details')

WebUI.verifyElementVisible(findTestObject('MyInfo/label_FullName'))

WebUI.verifyElementText(findTestObject('MyInfo/label_FullName'), 'Full Name')

WebUI.verifyElementVisible(findTestObject('MyInfo/label_FirstName'))

WebUI.verifyElementText(findTestObject('MyInfo/label_FirstName'), '* First Name')

WebUI.verifyElementVisible(findTestObject('MyInfo/label_MiddleName'))

WebUI.verifyElementText(findTestObject('MyInfo/label_MiddleName'), 'Middle Name')

WebUI.verifyElementVisible(findTestObject('MyInfo/label_LastName'))

WebUI.verifyElementText(findTestObject('MyInfo/label_LastName'), '* Last Name')

WebUI.verifyElementVisible(findTestObject('MyInfo/input_FirstName'))

WebUI.verifyElementVisible(findTestObject('MyInfo/input_MiddleName'))

WebUI.verifyElementVisible(findTestObject('MyInfo/input_LastName'))

WebUI.verifyElementVisible(findTestObject('MyInfo/label_EmployeeId'))

WebUI.verifyElementText(findTestObject('MyInfo/label_EmployeeId'), 'Employee Id')

WebUI.verifyElementVisible(findTestObject('MyInfo/input_EmployeeId'))

WebUI.verifyElementVisible(findTestObject('MyInfo/label_DriverLicenseNumber'))

WebUI.verifyElementText(findTestObject('MyInfo/label_DriverLicenseNumber'), 'Driver\'s License Number')

WebUI.verifyElementVisible(findTestObject('MyInfo/input_DriverLicenseNumber'))

//WebUI.verifyElementVisible(findTestObject('MyInfo/label_SSNNumber'))
//
//WebUI.verifyElementText(findTestObject('MyInfo/label_SSNNumber'), 'SSN Number')
//
//WebUI.verifyElementVisible(findTestObject('MyInfo/input_SSNNumber'))

WebUI.verifyElementVisible(findTestObject('MyInfo/label_OtherId'))

WebUI.verifyElementText(findTestObject('MyInfo/label_OtherId'), 'Other Id')

WebUI.verifyElementVisible(findTestObject('MyInfo/input_OtherId'))

WebUI.verifyElementVisible(findTestObject('MyInfo/label_LicenseExpiryDate'))

WebUI.verifyElementText(findTestObject('MyInfo/label_LicenseExpiryDate'), 'License Expiry Date')

WebUI.verifyElementVisible(findTestObject('MyInfo/input_LicenseExpiryDate'))

WebUI.verifyElementVisible(findTestObject('MyInfo/image_CalendarLicense'))

//WebUI.verifyElementVisible(findTestObject('MyInfo/label_SINNumber'))
//
//WebUI.verifyElementText(findTestObject('MyInfo/label_SINNumber'), 'SIN Number')
//
//WebUI.verifyElementVisible(findTestObject('MyInfo/input_SINNumber'))

WebUI.verifyElementVisible(findTestObject('MyInfo/label_Gender'))

WebUI.verifyElementText(findTestObject('MyInfo/label_Gender'), 'Gender')

WebUI.verifyElementVisible(findTestObject('MyInfo/radio_MaleGender'))

WebUI.verifyElementVisible(findTestObject('MyInfo/radio_FemaleGender'))

WebUI.verifyElementVisible(findTestObject('MyInfo/label_Nationality'))

WebUI.verifyElementText(findTestObject('MyInfo/label_Nationality'), 'Nationality')

WebUI.verifyElementVisible(findTestObject('MyInfo/dropdown_Nationality'))

WebUI.verifyElementVisible(findTestObject('MyInfo/label_MaritalStatus'))

WebUI.verifyElementText(findTestObject('MyInfo/label_MaritalStatus'), 'Marital Status')

WebUI.verifyElementVisible(findTestObject('MyInfo/dropdown_MaritalStatus'))

WebUI.verifyElementVisible(findTestObject('MyInfo/label_DateOfBirth'))

WebUI.verifyElementText(findTestObject('MyInfo/label_DateOfBirth'), 'Date of Birth')

WebUI.verifyElementVisible(findTestObject('MyInfo/input_DateOfBirth'))

WebUI.verifyElementVisible(findTestObject('MyInfo/image_CalendarBirthday'))

//WebUI.verifyElementVisible(findTestObject('MyInfo/label_NickName'))
//
//WebUI.verifyElementText(findTestObject('MyInfo/label_NickName'), 'Nick Name')
//
//WebUI.verifyElementVisible(findTestObject('MyInfo/input_NickName'))
//
//WebUI.verifyElementVisible(findTestObject('MyInfo/label_MilitaryService'))
//
//WebUI.verifyElementText(findTestObject('MyInfo/label_MilitaryService'), 'Military Service')
//
//WebUI.verifyElementVisible(findTestObject('MyInfo/input_MilitaryService'))
//
//WebUI.verifyElementVisible(findTestObject('MyInfo/label_Smoker'))
//
//WebUI.verifyElementText(findTestObject('MyInfo/label_Smoker'), 'Smoker')
//
//WebUI.verifyElementVisible(findTestObject('MyInfo/checkbox_Smoker'))

WebUI.verifyElementVisible(findTestObject('MyInfo/label_RequiredNote'))

WebUI.verifyElementText(findTestObject('MyInfo/label_RequiredNote'), '* Required field')

WebUI.verifyElementNotClickable(findTestObject('MyInfo/input_FirstName'))

WebUI.verifyElementNotClickable(findTestObject('MyInfo/input_MiddleName'))

WebUI.verifyElementNotClickable(findTestObject('MyInfo/input_LastName'))

WebUI.verifyElementNotClickable(findTestObject('MyInfo/input_LicenseExpiryDate'))

WebUI.verifyElementNotClickable(findTestObject('MyInfo/radio_MaleGender'))

WebUI.verifyElementNotClickable(findTestObject('MyInfo/radio_FemaleGender'))

WebUI.verifyElementNotClickable(findTestObject('MyInfo/dropdown_MaritalStatus'))

WebUI.verifyElementNotClickable(findTestObject('MyInfo/dropdown_Nationality'))

//WebUI.verifyElementNotClickable(findTestObject('MyInfo/input_NickName'))
//
//WebUI.verifyElementNotClickable(findTestObject('MyInfo/input_MilitaryService'))
//
//WebUI.verifyElementNotClickable(findTestObject('MyInfo/checkbox_Smoker'))

WebUI.verifyElementNotClickable(findTestObject('MyInfo/input_EmployeeId'))

WebUI.verifyElementNotClickable(findTestObject('MyInfo/input_DriverLicenseNumber'))

//WebUI.verifyElementNotClickable(findTestObject('MyInfo/input_SSNNumber'))
//
//WebUI.verifyElementNotClickable(findTestObject('MyInfo/input_SINNumber'))

WebUI.verifyElementNotClickable(findTestObject('MyInfo/input_DateOfBirth'))

WebUI.verifyElementNotClickable(findTestObject('MyInfo/input_OtherId'))

WebUI.verifyElementVisible(findTestObject('MyInfo/button_Edit'))

WebUI.verifyElementAttributeValue(findTestObject('MyInfo/button_Edit'), 'value', 'Edit', 2)

//WebUI.verifyElementVisible(findTestObject('MyInfo/heading_CustomFields'))
//
//WebUI.verifyElementText(findTestObject('MyInfo/heading_CustomFields'), 'Custom Fields')
//
//WebUI.verifyElementVisible(findTestObject('MyInfo/label_BloodType'))
//
//WebUI.verifyElementText(findTestObject('MyInfo/label_BloodType'), 'Blood Type')
//
//WebUI.verifyElementVisible(findTestObject('MyInfo/dropdown_BloodType'))
//
//WebUI.verifyElementNotClickable(findTestObject('MyInfo/dropdown_BloodType'))
//
//WebUI.verifyElementVisible(findTestObject('MyInfo/button_EditCustom'))
//
//WebUI.verifyElementAttributeValue(findTestObject('MyInfo/button_EditCustom'), 'value', 'Edit', 2)

WebUI.verifyElementVisible(findTestObject('MyInfo/heading_Attachments'))

WebUI.verifyElementText(findTestObject('MyInfo/heading_Attachments'), 'Attachments')

WebUI.verifyElementVisible(findTestObject('MyInfo/button_AddAttachment'))

WebUI.verifyElementAttributeValue(findTestObject('MyInfo/button_AddAttachment'), 'value', 'Add', 2)

WebUI.closeBrowser()

