package filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcelDemo 
{
	public static void main(String[] args) throws IOException
	{
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet =workbook.createSheet("EMP Info");
		
		Object empdata [][] = { {"EMPID","NAME","JOB"},
								{ 101,"MANI","ENGINEER"},
								{102,"BALAJI","MANAGER"},
								{103,"NAVEEN","ANALYST"}
							  };
		
		//Using for loop
		
		/*int rows=empdata.length;
		int cols=empdata[0].length;
		
		System.out.println(rows);
		System.out.println(cols);
		
		for(int r=0;r<rows;r++)//0
		{
			XSSFRow row=sheet.createRow(r);
			
			for(int c=0;c<cols;c++)
			{
			XSSFCell cell=row.createCell(c);//0
			Object value=empdata[r][c];
			
			if(value instanceof String)
				cell.setCellValue((String)value);
			if(value instanceof Integer)
				cell.setCellValue((Integer)value);
			if(value instanceof Boolean)
				cell.setCellValue((Boolean)value);
				
			}
		}*/
		
		//Using for each loop
		
		int rowCount=0;
		
		for(Object emp[]:empdata)
		{
			XSSFRow row=sheet.createRow(rowCount++);
			int columnCount=0;
			
			for(Object value:emp)
			{
				XSSFCell cell=row.createCell(columnCount++);
				
				if(value instanceof String)
					cell.setCellValue((String)value);
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);
			}
		}
		
			
			String filepath=".\\datafiles\\employee.xlsx";
			FileOutputStream outstream=new FileOutputStream(filepath);
			workbook.write(outstream);
			
			outstream.close();
		
		
		System.out.println("Employee.xls file written successfully....");
	}
}
