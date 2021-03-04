

package apoidemo;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class poiexample_1 {

	public static void main(String[] args)throws Exception {
	    
		try {
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		FileOutputStream out = new FileOutputStream(new File("C:\\TestGit\\basic_assignment.xlsx"));
		XSSFSheet Spreadsheet = workbook.createSheet("Sheet_1");
		
		
		workbook.write(out);
		out.close();
	}
		catch(Exception e) {
			
			System.out.println(e);
		}
	
		System.out.println("Excel file created");
}
}



