package myinfo

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI




public class MyInfoKeywords {

	@Keyword
	def AddAttachment(String file_name) {
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

		String xpath_file = '//a[contains(text(),"' + file_name + '")]'

		int count_file_before_upload = 0

		if(WebUI.verifyElementVisible(findTestObject('MyInfo/table_Attachments'), FailureHandling.OPTIONAL) == true) {
			WebElement table = WebUI.findWebElement(findTestObject('MyInfo/table_Attachments'), 5)
			List<WebElement> rows_file_before_upload = table.findElements(By.xpath(xpath_file))
			count_file_before_upload = rows_file_before_upload.size()
		}

		WebUI.uploadFile(findTestObject('MyInfo/input_SelectFile'), RunConfiguration.getProjectDir() + '\\UploadFiles\\' + file_name)

		WebUI.click(findTestObject('MyInfo/button_Upload'))

		WebUI.verifyElementNotVisible(findTestObject('MyInfo/section_AddAttachment'))

		//		WebUI.verifyTextPresent('Successfully Saved', false)

		WebUI.verifyElementVisible(findTestObject('MyInfo/button_AddAttachment'))

		WebUI.verifyElementAttributeValue(findTestObject('MyInfo/button_AddAttachment'), 'value', 'Add', 2)

		WebUI.verifyElementVisible(findTestObject('MyInfo/button_Delete'))

		WebUI.verifyElementAttributeValue(findTestObject('MyInfo/button_Delete'), 'value', 'Delete', 2)

		WebUI.verifyElementVisible(findTestObject('MyInfo/table_Attachments'))

		WebElement table = WebUI.findWebElement(findTestObject('MyInfo/table_Attachments'), 10)

		List<WebElement> rows_file_after_upload = table.findElements(By.xpath(xpath_file))

		int count_file_after_upload = rows_file_after_upload.size()

		if(count_file_after_upload == (count_file_before_upload + 1)) {
			KeywordUtil.markPassed('Uploaded file successfully!')
		}
		else {
			KeywordUtil.markFailed('Uploaded file unsuccessfully!')
		}

		WebUI.verifyTextPresent(file_name, false)

		return count_file_after_upload
	}
}
