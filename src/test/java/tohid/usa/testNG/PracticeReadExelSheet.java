package tohid.usa.testNG;

import java.util.ArrayList;
import java.util.Iterator;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class PracticeReadExelSheet {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fileLoc = new FileInputStream("./TestData/TestData.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook("fileLoc");
		
		XSSFSheet sht = wb.getSheet("Sheet1");
		
		Iterator<Row> ri = sht.iterator();
		
		ri.next();
		
		ArrayList<String> xList = new ArrayList<String>();
		
		while(ri.hasNext()) {
			xList.add(ri.next().getCell(0).getStringCellValue());
		}
		
		System.out.println(xList);
	}

}
