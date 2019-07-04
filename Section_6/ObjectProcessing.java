package section6;

import javax.swing.*;
public class ObjectProcessing {

	public static void main(String[] args) {
		String filename=JOptionPane.showInputDialog("Enter the name of the text file");
		FileReader test=new FileReader(filename);
		test.findold();
		test.process();
		test.PrintToFile();
	}

}
