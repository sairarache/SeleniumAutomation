package Excel;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
        String g=Excelcode.readStringData(3, 0);
        System.out.println(g);
		String e=Excelcode.readIntegerData(3, 1);
		System.out.println(e);

	}

}
