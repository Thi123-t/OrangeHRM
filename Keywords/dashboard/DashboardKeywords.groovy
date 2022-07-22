package dashboard

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class DashboardKeywords {

	@Keyword
	def VerifyElementsInDashboard() {
		WebUI.verifyElementVisible(findTestObject('Dashboard/image_Logo'))

		WebUI.verifyElementVisible(findTestObject('Dashboard/button_Marketplace'))

		WebUI.verifyElementAttributeValue(findTestObject('Dashboard/button_Marketplace'), 'value', 'Marketplace', 2)

		WebUI.verifyElementVisible(findTestObject('Dashboard/button_Subscribe'))

		WebUI.verifyElementAttributeValue(findTestObject('Dashboard/button_Subscribe'), 'value', 'Subscribe', 2)

		WebUI.verifyElementVisible(findTestObject('Dashboard/icon_Help'))

		WebUI.verifyElementVisible(findTestObject('Dashboard/icon_Notification'))

		WebUI.verifyElementVisible(findTestObject('Dashboard/text_Welcome'))

		WebUI.verifyElementText(findTestObject('Dashboard/text_Welcome'), 'Welcome Nam')

		WebUI.verifyElementVisible(findTestObject('Dashboard/link_Leave'))

		WebUI.verifyElementText(findTestObject('Dashboard/link_Leave'), 'Leave')

		WebUI.verifyElementVisible(findTestObject('Dashboard/link_Time'))

		WebUI.verifyElementText(findTestObject('Dashboard/link_Time'), 'Time')

		WebUI.verifyElementVisible(findTestObject('Dashboard/link_MyInfo'))

		WebUI.verifyElementText(findTestObject('Dashboard/link_MyInfo'), 'My Info')

		WebUI.verifyElementVisible(findTestObject('Dashboard/link_Performance'))

		WebUI.verifyElementText(findTestObject('Dashboard/link_Performance'), 'Performance')

		WebUI.verifyElementVisible(findTestObject('Dashboard/link_Dashboard'))

		WebUI.verifyElementText(findTestObject('Dashboard/link_Dashboard'), 'Dashboard')

		WebUI.verifyElementVisible(findTestObject('Dashboard/link_Directory'))

		WebUI.verifyElementText(findTestObject('Dashboard/link_Directory'), 'Directory')

		WebUI.verifyElementVisible(findTestObject('Dashboard/link_Buzz'))

		WebUI.verifyElementText(findTestObject('Dashboard/link_Buzz'), 'Buzz')

		WebUI.verifyElementVisible(findTestObject('Dashboard/heading_Dashboard'))

		WebUI.verifyElementText(findTestObject('Dashboard/heading_Dashboard'), 'Dashboard')

		WebUI.verifyElementVisible(findTestObject('Dashboard/text_QuickLaunch'))

		WebUI.verifyElementText(findTestObject('Dashboard/text_QuickLaunch'), 'Quick Launch')

		WebUI.verifyElementVisible(findTestObject('Dashboard/image_ApplyLeave'))

		WebUI.verifyElementVisible(findTestObject('Dashboard/text_ApplyLeave'))

		WebUI.verifyElementText(findTestObject('Dashboard/text_ApplyLeave'), 'Apply Leave')

		WebUI.verifyElementVisible(findTestObject('Dashboard/image_MyLeave'))

		WebUI.verifyElementVisible(findTestObject('Dashboard/text_MyLeave'))

		WebUI.verifyElementText(findTestObject('Dashboard/text_MyLeave'), 'My Leave')

		WebUI.verifyElementVisible(findTestObject('Dashboard/image_MyTimesheet'))

		WebUI.verifyElementVisible(findTestObject('Dashboard/text_MyTimesheet'))

		WebUI.verifyElementText(findTestObject('Dashboard/text_MyTimesheet'), 'My Timesheet')

		WebUI.verifyElementVisible(findTestObject('Dashboard/text_Footer'))

		WebUI.verifyElementText(findTestObject('Dashboard/text_Footer'), 'OrangeHRM 4.10.1\n© 2005 - 2022 OrangeHRM, Inc. All rights reserved.')
	}
}
