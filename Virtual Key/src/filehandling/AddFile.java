package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddFile {
	public  void addToFile(String path) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter filename to Create File with file type");
		 String filename=sc.nextLine();
		try {
		 
		 String filepath=path+filename;
		 File file = new File(filepath);
		 
		 
		 if(file.createNewFile()) {
			System.out.println("file is created successfully");
		    System.out.println("Would you like to add some content to the file? (YES/NO)");
		    String choice = sc.next().toLowerCase();
		    sc.nextLine();
		    if (choice.equals("yes")) {
		    System.out.println("Input content and press enter\n");
		    String content = sc.nextLine();
		    FileWriter writer = new FileWriter(file);
	        writer.write(content);
	        System.out.println("Given content is written in the created document");
	        writer.close();
		    }}
		 else
			 System.out.println("File already exists.");
		} 
		catch (IOException e) {
			System.out.println("Failed to create file " + filename);
			System.out.println(e.getClass().getName());
		}
	
		

	}

}
