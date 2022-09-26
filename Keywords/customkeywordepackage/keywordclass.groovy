package customkeywordepackage

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

import org.openqa.selenium.WebElement as WebElement
import internal.GlobalVariable

public class keywordclass {

	/*KeywordObjet=is name of keyword*/
	@Keyword(keywordObject = "test1")
	def getTextMethod(TestObject obj) {
		'println(obj)'
		return WebUI.getText(obj)
	}

	@Keyword(keywordObject = "test2")
	def clickMethod(TestObject obj) {
		WebUI.click(obj)
	}


	@Keyword(keywordObject = "test3")
	def setTextMethod(TestObject obj,String name) {
		WebUI.setText(obj, name)
	}

	@Keyword(keywordObject="test4")
	def displayallrecpords(TestObject obj) {
		List<WebElement> listElement = WebUI.findWebElements(obj, 10)
		println('number of records present' + listElement.size())

		for (WebElement e : listElement) {
			println(e.getText())

			'println(e)'
		}
	}

	@Keyword(keywordObject = "test5")
	def fetchnumber(String text1) {
		text1 = ((text1[1]) + (text1[2]))
		println(text1)
		return text1
	}
}
