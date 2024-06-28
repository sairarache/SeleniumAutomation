package Excel;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excelcode {
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet sh;
	
	public static String readStringData(int row,int col) throws IOException
	{
		f=new FileInputStream("C:\\Users\\USER\\Desktop\\exceldata.xlsx");
		w=new XSSFWorkbook(f);
		sh=w.getSheet("Sheet1");
		XSSFRow r=sh.getRow(row);
		XSSFCell d=r.getCell(col);
		return d.getStringCellValue();
		
	}
   public static String readIntegerData(int row,int col) throws IOException
   {
	   f=new FileInputStream("C:\\Users\\USER\\Desktop\\exceldata.xlsx");
		w=new XSSFWorkbook(f);
		sh=w.getSheet("Sheet1");
		XSSFRow r=sh.getRow(row);
		XSSFCell d=r.getCell(col);
		int x=(int) d.getNumericCellValue();
		return String.valueOf(x);

   }
}
