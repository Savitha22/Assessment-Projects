package filehandling;

import java.io.File;
import java.util.Scanner;

public class DeleteFile {

	public void deleteTheFile(String path) {
		

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter file name to delete file with file type  (File name is case sensitive. so,carefully enter the fuile name)");
		String filename=sc.nextLine();
		String filepath=path+filename;
		
		
        int flag=0;
		
		File file=new File(path);
		File files=new File(filepath);
		File[] filelist=file.listFiles();
		
		for (int i = 0; i < filelist.length; i++) {
	        if(filelist[i].getName().equals(filename)) {
	        	if(files.delete()) {
	        	   flag=1;
	        	   break;
	        }}
	        else 
				flag=0;
		}
		if(flag==1) 
	        	System.out.println("file deleted successfully");
		else
			System.out.println("File not Found");
		
	}

}
