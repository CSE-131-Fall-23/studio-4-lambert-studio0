package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		//String[] array= new String[10];
		//for (int i=0; i<10; i+=1) {
		//	array[i]=in.nextLine();
		//}
		
		//double x = (double) array[6];
		//double y = (double) array[7];
		//double width = (double) array[8];
		//double heigh = (double) array[9];
		
		
		String second = in.next();
		int third = in.nextInt();
		int fourth = in.nextInt();
		int fifth = in.nextInt();
		boolean sixth = in.nextBoolean();
		double x = in.nextDouble();
		double y = in.nextDouble();
		double width = in.nextDouble();
		double heigh = in.nextDouble();
				
				
		StdDraw.rectangle(x, y, width, heigh);
		
		
		
	}
}
