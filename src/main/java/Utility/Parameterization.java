package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization {
	 public static String getdata(int row, int cell) throws EncryptedDocumentException, IOException {
			FileInputStream file = new FileInputStream("D:\\AUTOMATION CODES\\Zerodha\\src\\test\\resources\\Test Data.xlsx");
			String value = WorkbookFactory.create(file).getSheet("Credential").getRow(row).getCell(cell).getStringCellValue();
			return value;
		}

}
