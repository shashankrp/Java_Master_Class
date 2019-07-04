package section6;

import java.util.*;
import java.io.*;

public class ReadClass {
	private String arr[]=new String[50];
	private int count=0;
	private String result="";
	
	public void readfile(String filename) {
		try {
			Scanner sc=new Scanner(new File(filename));
			while(sc.hasNext()) {
				arr[count]=sc.nextLine();
				count++;
			}

			sc.close();
		}catch(FileNotFoundException e) {
			System.out.println("File not found");
		}
	}
	public void process() {
		for(int i=0;i<count;i++) {
			Scanner scline=new Scanner(arr[i]);
			result=result + scline.next().charAt(0) + ". " +scline.next()+" " +scline.nextInt()+" "+scline.next().charAt(0)+"\n";
			scline.close();
		}
	}
	public String printresult() {
		return result;
	}
}
