package openkart;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ConfigXL {
	public static XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public Row row;
	public Cell cell;
	
	

	public void openXL(String filepath) throws IOException
	{
		
		FileInputStream fis=new FileInputStream(filepath);
		workbook= new XSSFWorkbook(fis);	
		//fis.close();
	}
	public String strGetData(int sheetNo,int rowNo,int cellNo)
	{
		sheet= workbook.getSheetAt(sheetNo);
		row=sheet.getRow(rowNo);
		cell=row.getCell(cellNo);
		cell.setCellType(Cell.CELL_TYPE_STRING);
		String data=cell.getStringCellValue();
		return data;
		
	}
	public void strSetData(String filepath,int sheetNo,int rowNo,int cellNo,String data) throws IOException
	{
		
		sheet= workbook.getSheetAt(sheetNo);
		row=sheet.getRow(rowNo);
		cell=row.createCell(cellNo);
		cell.setCellType(Cell.CELL_TYPE_STRING);
	     cell.setCellValue(data);
	     FileOutputStream fos = new FileOutputStream(filepath);
		 workbook.write(fos);
		 fos.close();
	   
		
	}

}
