package FrameworkLibraries;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;





public class ExcelHandling {
	
	private Workbook wb ;
	private Sheet  ws ;
//	ws = new 
	
	public ExcelHandling(String filePath) throws IOException {
		
		this.wb = setExcel(filePath);
	}

	public ExcelHandling(String filePath, String sheetName) throws IOException {
		this.wb = setExcel(filePath);
		this.ws = setSheet(sheetName);
	}
	
	private XSSFWorkbook setExcel(String filePath) throws IOException {
		FileInputStream file = new FileInputStream(new File(filePath));
		return new XSSFWorkbook(file);
	}
	
	private Sheet setSheet(String sheetName) {
		return wb.getSheet(sheetName);
	}
	
	public String getCellValue(String header) {
		return "";	
	}
	
	public String getCellValue(int intRow, String strHeader) {
		
		FormulaEvaluator evaluator = wb.getCreationHelper().createFormulaEvaluator();
		DataFormatter formatter = new DataFormatter();
		
		int colNum = getColumnNumber(1,strHeader);		
		Row xlRow = ws.getRow(intRow-1);
		
		Cell cell = xlRow.getCell(colNum-1);
		String val1 = formatter.formatCellValue(cell, evaluator);
		
		return val1;
		
		
		
	}
	
	public int getColumnNumber(int intRow, String strVal) {
		Row xlRow = ws.getRow(intRow-1);
		
		FormulaEvaluator evaluator = wb.getCreationHelper().createFormulaEvaluator();
		DataFormatter formatter = new DataFormatter();
		
		for(int i=0;i<xlRow.getLastCellNum();i++) {
			Cell cell = xlRow.getCell(i);
			String val1 = formatter.formatCellValue(cell, evaluator);
			if(val1.equals(strVal))
				return i+1;			
		}
		return -1;
	}
	
//	public List<String> getRow(int row, int StartCol, int endCol ){
//		Row xlRow = ws.getRow(intRow-1);
//		FormulaEvaluator evaluator = wb.getCreationHelper().createFormulaEvaluator();
//		DataFormatter formatter = new DataFormatter();
//		
//		for(int i=StartCol-1;i<endCol-1;i++) {
//			
//		}
		
//	}
}
