package section6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class scanner {
public void filescan(String filename) {
	try {
		Scanner scfile = new Scanner(new File(filename));
		String line = "", first = "", second = "";
		int age = 0;
		while (scfile.hasNext()) {
			line = scfile.nextLine();
			Scanner scline = new Scanner(line).useDelimiter("#");
			first = scline.next();
			second = scline.next();
			age = scline.nextInt();
			scline.close();
			System.out.println(first.charAt(0) + "." + second + " " + age);
		}
		scfile.close();
	    }catch(FileNotFoundException e) {
	    	System.out.println("Its all broken");
	    }
		}


}
