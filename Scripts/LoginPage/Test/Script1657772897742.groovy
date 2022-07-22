import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter

import org.openqa.selenium.Keys

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('https://schroleeduspatest.azurewebsites.net/#/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Test/input_Email'), 'testqa33@gmail.com')

WebUI.setText(findTestObject('Test/input_Password'), 'Quality33')

WebUI.click(findTestObject('Test/button_Login'))

WebUI.click(findTestObject('Test/tab_Engage'))

WebUI.delay(2)

WebUI.click(findTestObject('Test/div_SendContract'))

WebUI.setText(findTestObject('Test/input_ApplicantEmail'), 'xyz@gmail.com')

WebUI.sendKeys(findTestObject('Test/input_ApplicantEmail'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('Test/input_FirstName'), 5)

WebUI.sendKeys(findTestObject('Test/input_FirstName'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('Test/input_FirstName'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Test/input_FirstName'), 'a')

WebUI.sendKeys(findTestObject('Test/input_LastName'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('Test/input_LastName'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Test/input_LastName'), 'b')

WebUI.setText(findTestObject('Test/input_Position'), 'c')

WebUI.click(findTestObject('Test/button_NextStep'))

//WebUI.click(findTestObject('Test/input_UploadContract'))
String filePath = RunConfiguration.getProjectDir() + '/UploadFiles/Automation Assignment.pdf'

filePath = filePath.replace('/', '\\')

CustomKeywords.'common.CommonKeywords.uploadFile'(findTestObject('Test/input_UploadContract'), filePath)

WebUI.delay(5)

value = WebUI.getAttribute(findTestObject('Test/input_UploadContract'), 'value')

WebUI.verifyMatch(value, 'Automation Assignment.pdf', false)

WebUI.delay(3)

date = WebUI.getAttribute(findTestObject('Test/input_DateContract'), 'value')

WebUI.click(findTestObject('Test/input_DateContract'))

WebUI.verifyElementVisible(findTestObject('Test/calendar_Datepicker'))

WebUI.click(findTestObject('Test/text_Month'))
List<String> months = Arrays.asList('January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December')

int month = 3
xpath_month = "(//div[@class='q-date__content col relative-position']//descendant::span[@class='block'])[${month}]"
object_month = CustomKeywords.'common.CommonKeywords.createObject'(xpath_month)
WebUI.click(object_month)
WebUI.verifyElementText(findTestObject('Test/text_Month'), months.get(month-1))

WebUI.click(findTestObject('Test/text_Year'))
int year = 2060
if(year < 2020) {
	int move = Math.ceil((double)(2020 - year)/20)
	for(int i=0; i<move;i++) {
		WebUI.click(findTestObject('Test/button_PreviousYear'))
	}
}
else if(year > 2040) {
	int move = Math.ceil((double)(year-2040)/20)
	for(int i=0; i<move;i++) {
		WebUI.click(findTestObject('Test/button_NextYear'))
	}
}
xpath_year = "//div[@class='q-date__years-content col self-stretch row items-center']//descendant::span[text()=${year}]"
object_year = CustomKeywords.'common.CommonKeywords.createObject'(xpath_year)
WebUI.click(object_year)
WebUI.verifyElementText(findTestObject('Test/text_Year'), year.toString())

day = 3
xpath_day = "//div[@class='q-date__calendar-days-container relative-position overflow-hidden']//descendant::span[text()=${day}]"
object_day = CustomKeywords.'common.CommonKeywords.createObject'(xpath_day)
WebUI.click(object_day)

date = WebUI.getAttribute(findTestObject('Test/input_DateContract'), 'value')

SimpleDateFormat DateFor = new SimpleDateFormat("dd MMM yyyy");
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
//String date = String.join('/', day.toString(), month.toString(), year.toString())
LocalDate dateString = new LocalDate(year,month,day)
println("dateString: ${dateString}")
LocalDate datex = dateString.parse(dateString.toString(), formatter)
//String dateString = DateFor.format(c)
println("dateString: ${datex.toString()}")

WebUI.closeBrowser()

