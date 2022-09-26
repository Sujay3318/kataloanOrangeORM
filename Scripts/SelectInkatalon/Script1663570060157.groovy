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

'follow the reference'

'https://docs.katalon.com/docs/katalon-studio-enterprise/test-execution/advanced-guides/web-testing/how-to-handle-drop-down-menu'

'open browser'
WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.amazon.in/')

'maximize the window'
WebUI.maximizeWindow()

'Select the dropdown value by Select option By index Method'
WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_OrangeHRM/selectInAmazon'), 2)

def str = WebUI.getText(findTestObject('Object Repository/Page_OrangeHRM/selectInAmazon'))

'Verifying the Option is Selected by Index option'
println(str)

WebUI.verifyOptionSelectedByIndex(findTestObject('Object Repository/Page_OrangeHRM/selectInAmazon'), 2, 60)

println(WebUI.getNumberOfSelectedOption(findTestObject('Page_OrangeHRM/selectInAmazon')))

