package filehandling;

<<<<<<< HEAD
public class FileCreate
{
  public static void main(String[] args)
=======
import java.io.File;
import java.io.IOException;

public class FileCreate 
{
	public static void main(String[] args)
>>>>>>> 8ec3020 (initial commit)
	   {
	       File folder=new File("D:\\Training\\FileHandling\\Practice\\SubFolder\\test.xlsx");
	        boolean present=folder.exists();
	        if(present ==false)
	        try 
	       {
	        	boolean created =folder.createNewFile();
	        	System.out.println("File created "+ created);
<<<<<<< HEAD
	        }
        catch(IOException v)
=======
	       }
	        catch(IOException v)
>>>>>>> 8ec3020 (initial commit)
        	{
        	System.out.println("error occured");
	        }
	    }
}

