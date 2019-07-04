package section6;
import javax.swing.*;
public class ObjectPracties {

	public static void main(String[] args) {
		String filename=JOptionPane.showInputDialog("Enter a file name");
		ReadClass rs=new ReadClass();
		rs.readfile(filename);
		rs.process();
		System.out.println(rs.printresult());
	}

}
