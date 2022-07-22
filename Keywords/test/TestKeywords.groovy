package test

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI




public class TestKeywords {
	
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
}
