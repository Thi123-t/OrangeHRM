import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebElement

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
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

String file_name = 'Test596KB.png'

String file_name_edit = 'Test901KB.docx'

number_of_files = CustomKeywords.'myinfo.MyInfoKeywords.AddAttachment'('Test596KB.png')

xpath_link_edit = "(//a[contains(text(), '${file_name}')]//parent::td//following-sibling::td[6]//a)[${number_of_files}]"

TestObject object_link_edit = CustomKeywords.'common.CommonKeywords.createObject'(xpath_link_edit)

WebUI.click(object_link_edit)

WebUI.verifyElementVisible(findTestObject('MyInfo/section_AddAttachment'))

WebUI.verifyElementVisible(findTestObject('MyInfo/heading_EditAttachment'))

WebUI.verifyElementText(findTestObject('MyInfo/heading_EditAttachment'), 'Edit Attachment')

WebUI.verifyElementVisible(findTestObject('MyInfo/label_CurrentFile'))

WebUI.verifyElementText(findTestObject('MyInfo/label_CurrentFile'), 'Current File')

WebUI.verifyElementVisible(findTestObject('MyInfo/text_FileName'))

WebUI.verifyElementText(findTestObject('MyInfo/text_FileName'), file_name)

WebUI.verifyElementVisible(findTestObject('MyInfo/label_ReplaceWith'))

WebUI.verifyElementText(findTestObject('MyInfo/label_ReplaceWith'), 'Replace With')

WebUI.verifyElementVisible(findTestObject('MyInfo/input_SelectFile'))

WebUI.verifyElementVisible(findTestObject('MyInfo/label_MaxFileSize'))

WebUI.verifyElementVisible(findTestObject('MyInfo/label_Comment'))

WebUI.verifyElementText(findTestObject('MyInfo/label_Comment'), 'Comment')

WebUI.verifyElementVisible(findTestObject('MyInfo/textarea_Comment'))

WebUI.verifyElementVisible(findTestObject('MyInfo/label_RequiredNote_Attachment'))

WebUI.verifyElementText(findTestObject('MyInfo/label_RequiredNote_Attachment'), '* Required field')

WebUI.verifyElementVisible(findTestObject('MyInfo/button_Upload'))

WebUI.verifyElementAttributeValue(findTestObject('MyInfo/button_Upload'), 'value', 'Upload', 2)

WebUI.verifyElementVisible(findTestObject('MyInfo/button_SaveCommentOnly'))

WebUI.verifyElementAttributeValue(findTestObject('MyInfo/button_SaveCommentOnly'), 'value', 'Save Comment Only', 2)

WebUI.verifyElementVisible(findTestObject('MyInfo/button_Cancel'))

WebUI.verifyElementAttributeValue(findTestObject('MyInfo/button_Cancel'), 'value', 'Cancel', 2)

WebUI.verifyElementClickable(findTestObject('MyInfo/input_SelectFile'))

WebUI.verifyElementClickable(findTestObject('MyInfo/textarea_Comment'))

WebUI.click(findTestObject('MyInfo/button_Upload'))

WebUI.verifyElementVisible(findTestObject('MyInfo/label_ErrorMessageSelectFile'))

WebUI.verifyElementText(findTestObject('MyInfo/label_ErrorMessageSelectFile'), 'This field is required', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.uploadFile(findTestObject('MyInfo/input_SelectFile'), RunConfiguration.getProjectDir() + '\\UploadFiles\\' + file_name_edit)

String comment = 'This is the first comment'

WebUI.setText(findTestObject('MyInfo/textarea_Comment'), comment)

WebUI.verifyElementAttributeValue(findTestObject('MyInfo/textarea_Comment'), 'value', comment, 2)

WebUI.click(findTestObject('MyInfo/button_SaveCommentOnly'))

WebUI.verifyElementNotVisible(findTestObject('MyInfo/section_AddAttachment'))

//WebUI.verifyTextPresent('Successfully Saved', false)

xpath_text_description = "(//a[contains(text(), '${file_name}')]//parent::td//following-sibling::td[1])[${number_of_files}]"

TestObject object_text_description = CustomKeywords.'common.CommonKeywords.createObject'(xpath_text_description)

WebUI.verifyElementText(object_text_description, comment)

WebUI.click(object_link_edit)

WebUI.verifyElementText(findTestObject('MyInfo/text_FileName'), file_name)

WebUI.verifyElementAttributeValue(findTestObject('MyInfo/textarea_Comment'), 'value', comment, 2)

WebUI.uploadFile(findTestObject('MyInfo/input_SelectFile'), RunConfiguration.getProjectDir() + '\\UploadFiles\\' + file_name_edit)

get_file_name = WebUI.getAttribute(findTestObject('MyInfo/input_SelectFile'), 'value')

WebUI.verifyMatch(get_file_name, '.*' + file_name_edit, true, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MyInfo/button_Upload'))

WebUI.verifyElementNotVisible(findTestObject('MyInfo/section_AddAttachment'))

//WebUI.verifyTextPresent('Successfully Saved', false)

xpath_file = '//a[contains(text(),"' + file_name_edit + '")]'

TestObject object = CustomKeywords.'common.CommonKeywords.createObject'(xpath_file)

List<WebElement> edit_files = WebUI.findWebElements(object, 10)

xpath_text_description = "(//a[contains(text(), '${file_name_edit}')]/parent::td//following-sibling::td[1])[${edit_files.size()}]"

object_text_description = CustomKeywords.'common.CommonKeywords.createObject'(xpath_text_description)

WebUI.verifyElementText(object_text_description, comment)

WebUI.closeBrowser()