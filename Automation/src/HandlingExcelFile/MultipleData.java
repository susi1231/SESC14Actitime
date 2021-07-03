package HandlingExcelFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipleData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("./data/TestScript.xlsx");
		Workbook wb = WorkbookFactory.create(file);
	    int rowCount = wb.getSheet("InvalidLogin").getLastRowNum();
	    for (int i = 1; i <=rowCount; i++) {
			 
	    	String un = wb.getSheet("InvalidLogin").getRow(i).getCell(0).getStringCellValue();
	    	String pws = wb.getSheet("InvalidLogin").getRow(i).getCell(1).getStringCellValue();
	    	System.out.println(un+"\t"+pws);
		    wb.close();
	    }
	}

}
