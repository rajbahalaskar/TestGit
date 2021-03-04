

package apoidemo;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writedata {

	public static void main(String[] args)throws Exception {
	    
		try {
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		FileOutputStream out = new FileOutputStream(new File("C:\\TestGit\\basic_assignment.xlsx"));
		XSSFSheet Spreadsheet = workbook.createSheet("Sheet_1");
		
		Spreadsheet.createRow(0);
		Spreadsheet.getRow(0).createCell(0).setCellValue("Sr.no.");
		Spreadsheet.getRow(0).createCell(1).setCellValue("student_First_name");
		Spreadsheet.getRow(0).createCell(2).setCellValue("student_last_name");
		Spreadsheet.getRow(0).createCell(3).setCellValue("Roll_no.");
		Spreadsheet.getRow(0).createCell(4).setCellValue("DOB");
		Spreadsheet.getRow(0).createCell(5).setCellValue("contact");
		Spreadsheet.getRow(0).createCell(6).setCellValue("E-mail");
		
		Spreadsheet.createRow(1);
		Spreadsheet.getRow(1).createCell(0).setCellValue("1.");
		Spreadsheet.getRow(1).createCell(1).setCellValue("Sachin");
		Spreadsheet.getRow(1).createCell(2).setCellValue("wagh");
		Spreadsheet.getRow(1).createCell(3).setCellValue("1.");
		Spreadsheet.getRow(1).createCell(4).setCellValue("1/1/99");
		Spreadsheet.getRow(1).createCell(5).setCellValue("8954761565");
		Spreadsheet.getRow(1).createCell(6).setCellValue("Sachinwagh@gmail.com");
		
		
		Spreadsheet.createRow(2);
		Spreadsheet.getRow(2).createCell(0).setCellValue("2.");
		Spreadsheet.getRow(2).createCell(1).setCellValue("Suresh");
		Spreadsheet.getRow(2).createCell(2).setCellValue("deore");
		Spreadsheet.getRow(2).createCell(3).setCellValue("2.");
		Spreadsheet.getRow(2).createCell(4).setCellValue("1/10/98");
		Spreadsheet.getRow(2).createCell(5).setCellValue("8954761565");
		Spreadsheet.getRow(2).createCell(6).setCellValue("Sureshdeore@gmail.com");
		
		Spreadsheet.createRow(3);
		Spreadsheet.getRow(3).createCell(0).setCellValue("3.");
		Spreadsheet.getRow(3).createCell(1).setCellValue("ramesh");
		Spreadsheet.getRow(3).createCell(2).setCellValue("sonawane");
		Spreadsheet.getRow(3).createCell(3).setCellValue("3.");
		Spreadsheet.getRow(3).createCell(4).setCellValue("12/12/99");
		Spreadsheet.getRow(3).createCell(5).setCellValue("8954761565");
		Spreadsheet.getRow(3).createCell(6).setCellValue("rameshsonawane@gmail.com");
		
		workbook.write(out);
		out.close();
	}
		catch(Exception e) {
			
			System.out.println(e);
		}
	
		System.out.println("Excel file created");
}
}



