package filehandling;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileOperations {
	
	public static void main(String[] args) throws IOException{
		WelcomeScreen.printWelcomeScreen("Virtual Key Repository", "Savithasini kutti");
		Scanner sc=new Scanner(System.in);
		
		ListFileNames display=new ListFileNames();
		AddFile add=new AddFile();
		DeleteFile delete=new DeleteFile();
		SearchFile search=new SearchFile();
		
		String path="C:\\Users\\Savitha\\Desktop\\Documents\\";
		
		label:while(true) {
			 System.out.println("Enter your choice\n1.list the files in the Directory\n2.File Operations(Add,Delete,Search)\n3.Close Application ");
			 int choice=sc.nextInt();
			
			 switch(choice) {
			 case 1:display.displayTheFile(path);
			        System.out.println("\n");
			        break;
			 case 2:while(true) {
				
				  		System.out.println("Enter Which file operation you want\n1.Add File\n2.Delete File\n3.Search File\n4.Back to Our main choices");
				  		int choice1=sc.nextInt();
				  		
				  		switch(choice1){
				  		case 1:add.addToFile(path);
				  			   break;
				  		case 2:delete.deleteTheFile(path);
				  			   break;
				  		case 3:search.searchTheFile(path);
				  			   break;
				  		case 4:continue label;
				  		
				  		default: System.out.println("Invalid Operation in File opeartions");
				  		
				  		       
				  		}
				}
			 
			 case 3:System.out.println("Program terminated Succesfully");
				    System.exit(0);
			        break;
			 default:System.out.println("invalid operation");
			}
		}

	}

	
}


