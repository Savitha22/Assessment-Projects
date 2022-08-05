package filehandling;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListFileNames {

	public void displayTheFile(String path) {
		File f=new File(path);
		File[] files=f.listFiles();
		for(File list:files) {
			System.out.println(list.getName());
		}
		System.out.println();
	}

}
