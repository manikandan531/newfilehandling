package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class DeleteCell
{
	public static void main(String[] args) throws IOException 
	{
         File file = new File(".\\datafiles\\Book.xlsx");
         
         FileInputStream fis = new FileInputStream(file);
         
         XSSFWorkbook wb = new XSSFWorkbook(fis);
         XSSFSheet sheet = wb.getSheet("sheet2");
         
         XSSFRow getRow=sheet.getRow(3);
         getRow.removeCell(getRow.getCell(2));
         
         FileOutputStream out=new FileOutputStream(new File(".\\datafiles\\Book.xlsx"));
         wb.write(out);
         
         System.out.println("Cell removed successfully");
         wb.close();
         fis.close();
   }
}
