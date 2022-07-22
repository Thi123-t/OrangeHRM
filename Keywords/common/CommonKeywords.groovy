package common

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.awt.Robot
import java.awt.Toolkit
import java.awt.datatransfer.StringSelection
import java.awt.event.KeyEvent

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI





public class CommonKeywords {

	@Keyword
	def Login(String username, String password) {
		WebUI.setText(findTestObject('Login/input_Username'), username)

		WebUI.verifyElementAttributeValue(findTestObject('Login/input_Username'), 'value', username, 2)

		WebUI.setText(findTestObject('Login/input_Password'), password)

		WebUI.verifyElementAttributeValue(findTestObject('Login/input_Password'), 'value', password, 2)

		WebUI.click(findTestObject('Login/button_Login'))

		String url = WebUI.getUrl()

		WebUI.verifyEqual(url, 'https://tmasolutions-osondemand.orangehrm.com/symfony/web/index.php/dashboard')
		//		WebUI.verifyEqual(url, 'https://opensource-demo.orangehrmlive.com/index.php/dashboard')
	}

	//	@Keyword
	//	def LoginWithAdmin() {
	//		WebUI.setText(findTestObject('Login/input_Username'), 'Admin')
	//
	//		WebUI.verifyElementAttributeValue(findTestObject('Login/input_Username'), 'value', 'Admin', 2)
	//
	//		WebUI.setText(findTestObject('Login/input_Password'), 'admin123')
	//
	//		WebUI.verifyElementAttributeValue(findTestObject('Login/input_Password'), 'value', 'admin123', 2)
	//
	//		WebUI.click(findTestObject('Login/button_Login'))
	//
	//		String url = WebUI.getUrl()
	//
	//		WebUI.verifyEqual(url, 'https://opensource-demo.orangehrmlive.com/index.php/dashboard')
	//	}

	@Keyword
	def Logout() {
		WebUI.click(findTestObject('Dashboard/text_Welcome'))
		WebUI.verifyElementVisible(findTestObject('Dashboard/menu_WelcomeMenu'))
		WebUI.click(findTestObject('Dashboard/link_Logout'))
		String url = WebUI.getUrl()
		WebUI.verifyEqual(url, 'https://opensource-demo.orangehrmlive.com/index.php/auth/login')
	}

	@Keyword
	def isFileDownloaded(String downloadPath, String fileName) {
		long timeout = 3 * 60 * 1000
		long start = new Date().getTime()
		boolean downloaded = false
		File file = new File(downloadPath, fileName)
		while (!downloaded) {
			KeywordUtil.logInfo("Checking file exists ${file.absolutePath}")
			downloaded = file.exists()
			if (downloaded) {
				file.delete() // remove this line if you want to keep the file
				KeywordUtil.markPassed(fileName + ' exist in ' + downloadPath + ' and was deleted')
			} else {
				long now = new Date().getTime()
				if (now - start > timeout) {
					break
				}
				Thread.sleep(3000)
			}
		}
		if(!downloaded) {
			KeywordUtil.markFailed(fileName + ' does not exist in ' + downloadPath)
		}

		return downloaded
	}

	@Keyword
	def selectDate(int expectedDay, int expectedMonth, int expectedYear, String valueOfCalendar) {
		int currentDay, currentMonth, currentYear

		if(valueOfCalendar.equals('yyyy-mm-dd')) {
			Calendar c = Calendar.getInstance()

			currentDay = c.get(Calendar.DATE)
			currentMonth = c.get(Calendar.MONTH) + 1
			currentYear = c.get(Calendar.YEAR)
		}
		else {
			String[] date = valueOfCalendar.split('-')

			currentDay = date[2].toInteger()
			currentMonth = date[1].toInteger()
			currentYear = date[0].toInteger()
		}

		int monthDiff = expectedMonth - currentMonth
		int yearDiff = expectedYear - currentYear

		int diff = yearDiff * 12 + monthDiff
		int move = Math.abs(diff)

		if(diff > 0) {
			for(int i = 0; i < move; i++) {
				WebUI.click(findTestObject('MyInfo/button_NextMonth'))
			}
		}
		else if (diff < 0){
			for(int i = 0; i < move; i++) {
				WebUI.click(findTestObject('MyInfo/button_PreviousMonth'))
			}
		}

		String xpath = "//a[contains(text(),'${expectedDay}')]"
		TestObject object = new TestObject("button_ExpectedDay")
		object.addProperty("xpath", ConditionType.EQUALS, xpath)

		WebUI.click(object)
	}

	@Keyword
	def selectDatepicker(int expectedDay, int expectedMonth, int expectedYear) {
		WebUI.selectOptionByValue(findTestObject('MyInfo/dropdown_DatepickerMonth'), "${expectedMonth-1}", false)

		WebUI.verifyOptionSelectedByValue(findTestObject('MyInfo/dropdown_DatepickerMonth'), "${expectedMonth-1}", false, 2)

		WebUI.selectOptionByValue(findTestObject('MyInfo/dropdown_DatepickerYear'), "${expectedYear}", false)

		WebUI.verifyOptionSelectedByValue(findTestObject('MyInfo/dropdown_DatepickerYear'), "${expectedYear}", false, 2)

		String xpath = "//a[contains(text(),'${expectedDay}')]"
		TestObject object = new TestObject("button_ExpectedDay")
		object.addProperty("xpath", ConditionType.EQUALS, xpath)

		WebUI.click(object)
	}

	@Keyword
	def uploadFile(TestObject to, String filePath) {
		println("filePath: ${filePath}")
		WebUI.click(to)
		StringSelection ss = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(1000)
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.delay(1000)
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

	@Keyword
	def createObject(String xpath) {
		TestObject object = new TestObject("objectName")
		object.addProperty("xpath", ConditionType.EQUALS, xpath)
		return object
	}
}
