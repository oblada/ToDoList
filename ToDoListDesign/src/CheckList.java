import java.awt.GraphicsConfiguration;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;

public abstract class CheckList {
	
	
	
	

 public static void myCheckalist(ArrayList myToDoList){
		
	
		
		Scanner scan = new Scanner(System.in);
		//System.out.println("Are you ready?" + myToDoList.toString());
		System.out.println("Are you ready?" );
		String s = scan.next();
		int textIn = scan.nextInt();

		scan.close();
	
	
 }
}
