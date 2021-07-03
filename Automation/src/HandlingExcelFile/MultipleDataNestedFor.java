package HandlingExcelFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipleDataNestedFor {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file=new FileInputStream("./data/TestScript.xlsx");
	Workbook wb = WorkbookFactory.create(file);
	int rowCount = wb.getSheet("InvalidLogin").getLastRowNum();
	short cellCount = wb.getSheet("InvalidLogin").getRow(0).getLastCellNum();
    for (int i = 0; i <cellCount; i++) {
		for (int j = 1; j <=rowCount; j++) {
			String un= wb.getSheet("InvalidLogin").getRow(j).getCell(i).getStringCellValue();
			System.out.println(un);
		}
	}

	}

}
