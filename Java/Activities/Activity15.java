package Activities;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Activity15 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		final String FILE_NAME = "TestSheet2.xlsx";
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sh = wb.createSheet("DataTypes in Java");
		
		Object[][] Data = {
				{"DataType","Type","Size in Bytes"},
				{"Integer", "Primitive",2},
				{"String","Non Primitive","No fixed size"},
				{"double", "Primitive", 8},
			    {"char", "Primitive", 1}
		};
		
		for (int d=0;d<=Data.length-1;d++) {
			Row row = sh.createRow(d);
			for (int f=0;f<=Data[0].length-1;f++) {
				Cell cell = row.createCell(f);
				if(Data[d][f] instanceof String) {
					cell.setCellValue((String)Data[d][f]);
				}else if(Data[d][f] instanceof Integer) {
					cell.setCellValue((Integer) Data[d][f]);
				}
			}
		}
		
		FileOutputStream fos = new FileOutputStream(FILE_NAME);
		wb.write(fos);
		wb.close();
		
		System.out.println("Done");
	}
}
