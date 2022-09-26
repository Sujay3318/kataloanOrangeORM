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

import customkeywordepackage.ExcelUtility
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


ExcelUtility.SetExcelFile("C:/Users/gs-3448/Downloads/ExcelFiles/", "testfile.xlsx");
def row=ExcelUtility.GetRowCount("Sheet1");

  println(row); for(int i=0;i<row;i++) { for(int j=0;j<2;j++) {
  println(ExcelUtility.GetCellData("Sheet1", j, i)); } }
 

ExcelUtility.setCelltex("testfile.xlsx", "Sheet1", row, "username", "UserName");
ExcelUtility.setCelltex("testfile.xlsx", "Sheet1", row, "password", "passord ");