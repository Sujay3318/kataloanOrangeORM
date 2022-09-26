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
import org.apache.poi.xssf.usermodel.XSSFCell
import org.apache.poi.xssf.usermodel.XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook


import internal.GlobalVariable

public class ExcelUtility {
	//C:\Users\gs-3448\Downloads\ExcelFiles\testfile.xlsx
	static String sTestDataPath = "C:/Users/gs-3448/Downloads/ExcelFiles/";
	static String Filename = "testfile.xlsx";
	static XSSFWorkbook ExcelWbook;
	static XSSFSheet ExcelWsheet;
	static XSSFCell Cell;
	static XSSFRow Row;

	public static void SetExcelFile(String Path,String FileName) throws Exception {
		try {
			FileInputStream File = new FileInputStream(Path+FileName);
			ExcelWbook = new XSSFWorkbook(File);
		} catch(Exception error_message) {
			System.out.println("SetExcelFile||Error||"+error_message.getMessage());
		}
	}


	public static int GetRowCount(String SheetName)throws Exception {
		int RowCount=0;
		ExcelWsheet = ExcelWbook.getSheet(SheetName);
		try {
			//index start from zero and we want row count so +1  3rd row it will get index by 2 so 1 added
			RowCount = ExcelWsheet.getLastRowNum()+1;
		} catch(Exception e) {
			RowCount = 0;
			System.out.println("ExcelUtils||GetRowCount||" +e.getMessage());
		}
		return RowCount;
	}

	public static String GetCellData(String SheetName,int ColNum,int RowNum)throws Exception {
		Object Cellvalue=null;
		ExcelWsheet = ExcelWbook.getSheet(SheetName);
		try {
			Cell = ExcelWsheet.getRow(RowNum).getCell(ColNum);
			int type = Cell.getCellType();

			switch(type) {
				case 0: double x = Cell.getNumericCellValue();
					int y = (int) x;
					Cellvalue = y;
					break;
				case 1: Cellvalue = Cell.getStringCellValue();
					break;
				case 2: Cellvalue = Cell.getDateCellValue();
					break;
			}
		} catch(Exception error_message) {
			Cellvalue = "";
		}
		return Cellvalue.toString();
	}

	public static void setCelltex(String fileName, String sheetName, int rowNum,  String colName, String value) {



		try {

			int col_Num = -1;
			ExcelWsheet = ExcelWbook.getSheet(sheetName);

			//getRow(int rownum)
			//Returns the logical row (not physical) 0-based.
			Row = ExcelWsheet.getRow(0);
			//finding column
			for (int i = 0; i < Row.getLastCellNum(); i++) {
				if (Row.getCell(i).getStringCellValue().trim().equals(colName)) {
					col_Num = i;
				}
			}

			//	autoSizeColumn(int column, boolean useMergedCells)
			//	Adjusts the column width to fit the contents.
			ExcelWsheet.autoSizeColumn(col_Num);
			Row = ExcelWsheet.getRow(rowNum);

			//createRow(int rownum)
			//Create a new row within the sheet and return the high level representation
			if(Row==null)
				Row = ExcelWsheet.createRow(rowNum);


			Cell = Row.getCell(col_Num);
			if(Cell == null)
				Cell = Row.createCell(col_Num);

			Cell.setCellValue(value);
			FileOutputStream fileOut = new FileOutputStream( new File(sTestDataPath+fileName));

			ExcelWbook.write(fileOut);

			fileOut.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
