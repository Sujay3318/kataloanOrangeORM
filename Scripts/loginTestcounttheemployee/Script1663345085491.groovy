import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

try {
	'read data from profiles'
    WebUI.navigateToUrl(GlobalVariable.url)
}
catch (Exception ex) {
    println('General issue occurs.')
} 

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('objects/Page_OrangeHRM/button_Login'))

text1 = WebUI.getText(findTestObject('Page_OrangeHRM/span_(37) Records Found'))

text1 = ((text1[1]) + (text1[2]))

println(text1)

WebUI.click(findTestObject('Page_OrangeHRM/a_Add Employee'))

WebUI.setText(findTestObject('Page_OrangeHRM/input_Employee Full Name_firstName'), 'sujay')

WebUI.setText(findTestObject('Page_OrangeHRM/input_Employee Full Name_lastName'), 'damodar')

WebUI.setText(findTestObject('Page_OrangeHRM/input_Employee Full Name_middleName'), 'thakur')

WebUI.setText(findTestObject('Page_OrangeHRM/input_Employee Id_oxd-input oxd-input--focus'), '3448')

WebUI.click(findTestObject('Page_OrangeHRM/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Employee List'))

text2 = WebUI.getText(findTestObject('Page_OrangeHRM/span_(37) Records Found'))

text2 = ((text2[1]) + (text2[2]))

println(text2)

WebUI.verifyEqual(text2, Integer.parseInt(text1)+1)

