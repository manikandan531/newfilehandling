package filehandling;

<<<<<<< HEAD
public class FileRename 
{
  public static void main(String[] args)
	   {    
	    File folder=new File("D:\\Training\\FileHandling\\Practice\\SubFolder\\test.xlsx");
	                    
	     File newName=new File("D:\\Training\\FileHandling\\Practice\\SubFolder\\Renamed.xlsx");
=======
import java.io.File;

public class FileRename 
{
	public static void main(String[] args)
	   {    
	    File folder=new File("D:\\Trainning\\FileHandling\\Practice\\SubFolder\\test.xlsx");
	                    
	     File newName=new File("D:\\Trainning\\FileHandling\\Practice\\SubFolder\\Renamed.xlsx");
>>>>>>> 8ec3020 (initial commit)
	      boolean renameSuccess=folder.renameTo(newName);
	      System.out.println("renameSuccess "+ newName);
	    }
}
