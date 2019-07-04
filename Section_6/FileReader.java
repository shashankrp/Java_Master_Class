package section6;

import java.io.*;
import java.util.Scanner;

public class FileReader {
		private String arr[]=new String[50];
		private int count=0;
		private String oldest="";
		private String result="";

		public FileReader(String filename) {
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
		public void findold() {
			int old=0;
			for(int i=0;i<count;i++) {
				Scanner scline=new Scanner(arr[i]).useDelimiter("#");
				String temp=scline.next()+" "+scline.next();
				int num=scline.nextInt();
				scline.close();
				if(num>old) {
					old=num;
					oldest= temp +" " +old+" is the oldest";
				}
			}
		}
		public void process() {
			for(int i=0;i<count;i++) {
				Scanner scline=new Scanner(arr[i]).useDelimiter("#");
				result=result + scline.next().charAt(0) + ". " +scline.next().charAt(0)+" " +scline.nextInt()+"\n";
				scline.close();
			}
		}
		public void PrintToFile() {
			try {
			PrintWriter outfile=new PrintWriter(new FileWriter("finalresult.txt"));
			outfile.println(oldest+"\n"+result);
			outfile.close();
			}
			catch(IOException e) {
				System.out.println("Final result file could not be found");
			}
			 
		}

}
