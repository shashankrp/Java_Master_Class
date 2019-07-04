package section6;

import java.util.*;
import java.io.*;
import javax.swing.*;

//The scanner will have the filenotfoundexception that may arrise so we use throws FileNotFoundException in the main line
public class FileReaderPracties {

	public static void main(String[] args) throws FileNotFoundException {
		String filename = JOptionPane.showInputDialog("Enter your file name");
		scanner filereader = new scanner();
		filereader.filescan(filename);
		}

}
