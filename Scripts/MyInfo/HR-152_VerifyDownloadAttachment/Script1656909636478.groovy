import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject
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

String file_name = 'Test596KB.png'

number_of_files = CustomKeywords.'myinfo.MyInfoKeywords.AddAttachment'(file_name)

xpath_link_file = "(//a[contains(text(), '${file_name}')])[${number_of_files}]"

TestObject object_link_file = CustomKeywords.'common.CommonKeywords.createObject'(xpath_link_file)

WebUI.click(object_link_file)

CustomKeywords.'common.CommonKeywords.isFileDownloaded'('C:\\Users\\phoangnam\\Downloads', file_name)

WebUI.closeBrowser()