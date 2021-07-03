package Com.Actitime.Generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * Gerenic class for data driven testing
 * @author kalyan
 *
 */
public class FileLib {
	/**
	 * generic method to read the data from property file
	 * @param key
	 * @return String
	 * @throws IOException
	 */
    public String getPropertyValue(String key) throws IOException {
    FileInputStream file=new FileInputStream("./data/Commondata.property");
    Properties p=new Properties();
    p.load(file);
    String value=p.getProperty(key);
    return value;
    }
    /**
     * generic method to read data from excel
     * @param sheetname
     * @param row
     * @param cell
     * @return String
     * @throws EncryptedDocumentException
     * @throws IOException
     */
    public String getExcelData(String sheetname, int row, int cell ) throws EncryptedDocumentException, IOException{
    	FileInputStream file=new FileInputStream("./data/TestScript.xlsx");
    	Workbook wb = WorkbookFactory.create(file);
    	String data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
    	return data;
    }
    
    public void setExcelData(String sheetname, int row,int cell) throws EncryptedDocumentException, IOException
    {
    	FileInputStream file=new FileInputStream("./data/TestScript.xlsx");
    	Workbook wb = WorkbookFactory.create(file);
    	wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue("pass");
    }

}
