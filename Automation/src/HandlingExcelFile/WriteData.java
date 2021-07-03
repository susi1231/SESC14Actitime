package HandlingExcelFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file=new FileInputStream("./data/TestScript.xlsx");
	Workbook wb = WorkbookFactory.create(file);
	wb.getSheet("CreateCustomer").getRow(1).getCell(4).setCellValue("pass");
	FileOutputStream fos=new FileOutputStream("./data/TestScript.xlsx");
	wb.write(fos);
	wb.close();
	
	}

}
