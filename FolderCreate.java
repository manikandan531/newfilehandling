package filehandling;

import java.io.File;

public class FolderCreate
{
	    public static void main(String[] args) 
	    {
	        File folder=new File("D:\\Training\\FileHandling\\Practice");
	        boolean present=folder.exists();
	        System.out.println(" Folder created: "+" "+present);
	        if(present ==false)
	        {
	            folder.mkdir();
	        }
	        present=folder.exists();
	        System.out.println("Already folder created: "+" "+present);
	    }
}

