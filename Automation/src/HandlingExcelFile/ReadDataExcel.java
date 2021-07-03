package HandlingExcelFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file=new FileInputStream("./data/TestScript.xlsx");
	Workbook wb = WorkbookFactory.create(file);
	String value = wb.getSheet("InvalidLogin").getRow(0).getCell(1).getStringCellValue();
	System.out.println(value);
	}
}
