import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

// FAILED
//WebUI.openBrowser('https://opensource-demo.orangehrmlive.com/')
WebUI.openBrowser(GlobalVariable.URL)
WebUI.maximizeWindow()
'Login with ESS user account'
//CustomKeywords.'common.CommonKeywords.Login'(username, password)

CustomKeywords.'common.CommonKeywords.Login'(GlobalVariable.USERNAME_ESS, GlobalVariable.PASSWORD_ESS)
WebUI.click(findTestObject('Dashboard/link_MyInfo'))

WebUI.click(findTestObject('MyInfo/button_AddAttachment'))

WebUI.verifyElementVisible(findTestObject('MyInfo/section_AddAttachment'))

WebUI.verifyElementVisible(findTestObject('MyInfo/heading_AddAttachment'))

WebUI.verifyElementText(findTestObject('MyInfo/heading_AddAttachment'), 'Add Attachment')

WebUI.verifyElementVisible(findTestObject('MyInfo/label_SeclectFile'))

WebUI.verifyElementText(findTestObject('MyInfo/label_SeclectFile'), 'Select File')

WebUI.verifyElementVisible(findTestObject('MyInfo/input_SelectFile'))

WebUI.verifyElementVisible(findTestObject('MyInfo/label_MaxFileSize'))

WebUI.verifyElementVisible(findTestObject('MyInfo/label_Comment'))

WebUI.verifyElementText(findTestObject('MyInfo/label_Comment'), 'Comment')

WebUI.verifyElementVisible(findTestObject('MyInfo/textarea_Comment'))

WebUI.verifyElementVisible(findTestObject('MyInfo/label_RequiredNote_Attachment'))

WebUI.verifyElementText(findTestObject('MyInfo/label_RequiredNote_Attachment'), '* Required field')

WebUI.verifyElementVisible(findTestObject('MyInfo/button_Upload'))

WebUI.verifyElementAttributeValue(findTestObject('MyInfo/button_Upload'), 'value', 'Upload', 2)

WebUI.verifyElementVisible(findTestObject('MyInfo/button_Cancel'))

WebUI.verifyElementAttributeValue(findTestObject('MyInfo/button_Cancel'), 'value', 'Cancel', 2)

WebUI.verifyElementClickable(findTestObject('MyInfo/input_SelectFile'))

WebUI.verifyElementClickable(findTestObject('MyInfo/textarea_Comment'))

String file_name = 'Test1.52MB.png'

WebUI.uploadFile(findTestObject('MyInfo/input_SelectFile'), RunConfiguration.getProjectDir() + '\\UploadFiles\\' + file_name)

WebUI.click(findTestObject('MyInfo/button_Upload'))

WebUI.verifyTextPresent('File size is exceeded', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()