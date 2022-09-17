import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('loginORM'), [:], FailureHandling.STOP_ON_FAILURE)

text1 = CustomKeywords.'customkeywordepackage.keywordclass.getTextMethod'(findTestObject('Page_OrangeHRM/span_(37) Records Found'))

text1=CustomKeywords.'customkeywordepackage.keywordclass.fetchnumber'(text1)

CustomKeywords.'customkeywordepackage.keywordclass.clickMethod'(findTestObject('Page_OrangeHRM/a_Add Employee'))

CustomKeywords.'customkeywordepackage.keywordclass.setTextMethod'(findTestObject('Page_OrangeHRM/input_Employee Full Name_firstName'), 
    'sujay')

CustomKeywords.'customkeywordepackage.keywordclass.setTextMethod'(findTestObject('Page_OrangeHRM/input_Employee Full Name_lastName'), 
    'damodar')

CustomKeywords.'customkeywordepackage.keywordclass.setTextMethod'(findTestObject('Page_OrangeHRM/input_Employee Full Name_middleName'), 
    'thakur')

CustomKeywords.'customkeywordepackage.keywordclass.setTextMethod'(findTestObject('Page_OrangeHRM/input_Employee Id_oxd-input oxd-input--focus'), 
    '3448')

CustomKeywords.'customkeywordepackage.keywordclass.clickMethod'(findTestObject('Page_OrangeHRM/button_Save'))

CustomKeywords.'customkeywordepackage.keywordclass.clickMethod'(findTestObject('Object Repository/Page_OrangeHRM/a_Employee List'))

text2 = CustomKeywords.'customkeywordepackage.keywordclass.getTextMethod'(findTestObject('Page_OrangeHRM/span_(37) Records Found'))

text2=CustomKeywords.'customkeywordepackage.keywordclass.fetchnumber'(text2)

WebUI.verifyEqual(text2, Integer.parseInt(text1) + 1)

CustomKeywords.'customkeywordepackage.keywordclass.displayallrecpords'(findTestObject('Object Repository/Page_OrangeHRM/allname'))

CustomKeywords.'customkeywordepackage.keywordclass.clickMethod'(findTestObject('Page_OrangeHRM/div_-- Select --'))

CustomKeywords.'customkeywordepackage.keywordclass.clickMethod'(findTestObject('Page_OrangeHRM/div_Full-Time Contract'))

CustomKeywords.'customkeywordepackage.keywordclass.clickMethod'(findTestObject('Page_OrangeHRM/button_Search'))

CustomKeywords.'customkeywordepackage.keywordclass.displayallrecpords'(findTestObject('Object Repository/Page_OrangeHRM/allname'))

