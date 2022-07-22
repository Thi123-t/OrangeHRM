package keywords

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


import com.kms.katalon.core.util.KeywordUtil
/**
 * Verify file Download
 */
@Keyword
def isFileDownloaded(String downloadPath, String fileName) {
	long timeout = 3 * 60 * 1000

	long start = new Date().getTime()
	boolean downloaded = false
	File file = new File(downloadPath, fileName)
	while (!downloaded) {
		KeywordUtil.logInfo("Verify file saved successfully at ${file.absolutePath}")
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


