package tohid.usa.testNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.ArrayList;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExelData {

	public static void main(String[] args) throws IOException {

		FileInputStream fileLoc = new FileInputStream("./TestData/TestData.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook(fileLoc);

		XSSFSheet sht = wb.getSheet("Sheet1");

		Iterator<Row> ri = sht.iterator();

		ri.next();

		ArrayList<String> xlList = new ArrayList<String>();

		while (ri.hasNext()) {
			xlList.add(ri.next().getCell(0).getStringCellValue());

		}
		System.out.println(xlList);
	}

}
