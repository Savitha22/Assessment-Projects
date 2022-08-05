package filehandling;

import java.io.File;
import java.util.Scanner;

public class SearchFile {

	public void searchTheFile(String path) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter file name to search with file type");
		String filename=sc.nextLine();
		File file=new File(path);
		File[] filelist=file.listFiles();
		int flag=0;
	
		for (int i = 0; i < filelist.length; i++) {
        if(filelist[i].getName().equals(filename)) {
        	flag=1;
			break;
        }
        else
        	flag=0;
	    } 
		if(flag==1)
			System.out.println("Searched File is found in directory");
		else
			System.out.println("File not found");
	}

}
