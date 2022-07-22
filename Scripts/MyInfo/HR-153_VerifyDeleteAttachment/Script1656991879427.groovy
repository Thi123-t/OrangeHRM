import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

// PASSED
//WebUI.openBrowser('https://opensource-demo.orangehrmlive.com/')
WebUI.openBrowser(GlobalVariable.URL)

WebUI.maximizeWindow()
'Login with ESS user account'
//CustomKeywords.'common.CommonKeywords.Login'(username, password)

CustomKeywords.'common.CommonKeywords.Login'(GlobalVariable.USERNAME_ESS, GlobalVariable.PASSWORD_ESS)

WebUI.click(findTestObject('Dashboard/link_MyInfo'))

String file_name = 'Automation Assignment.pdf'

String xpath_file = ('//a[contains(text(),"' + file_name) + '")]'

number_of_files_before_delete = CustomKeywords.'myinfo.MyInfoKeywords.AddAttachment'(file_name)

WebUI.verifyElementNotClickable(findTestObject('MyInfo/button_Delete'))

xpath_checkbox = "(//a[contains(text(), '${file_name}')]/parent::td//preceding-sibling::td//input)[${number_of_files_before_delete}]"

TestObject object_checkbox = CustomKeywords.'common.CommonKeywords.createObject'(xpath_checkbox)

WebUI.check(object_checkbox)

WebUI.click(findTestObject('MyInfo/button_Delete'))

//WebUI.verifyTextPresent('Successfully Deleted', false)

int count_file_after_delete = 0

TestObject object_file = CustomKeywords.'common.CommonKeywords.createObject'(xpath_file)

if (WebUI.verifyElementVisible(object_file, FailureHandling.OPTIONAL) == true) {
    rows_file = WebUI.findWebElements(object_file, 5)

    count_file_after_delete = rows_file.size()
}

if (count_file_after_delete == (number_of_files_before_delete - 1)) {
    KeywordUtil.markPassed('Deleted file successfully!')
} else {
    KeywordUtil.markFailed('Deleted file unsuccessfully!')
}

WebUI.closeBrowser()