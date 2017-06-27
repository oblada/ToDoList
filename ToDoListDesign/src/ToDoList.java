import java.util.ArrayList;
import java.util.HashSet;

import javax.swing.JFrame;
import javax.swing.text.html.HTMLDocument.Iterator;

 
public abstract  class ToDoList {

	
		public static ArrayList<String> creatToDoList(){
			ArrayList<String> myToDoList = new ArrayList <String>();
			
		HashSet<String> myHashSet = new HashSet <String>();
		
		myToDoList.add("Get ready");
		myToDoList.add("eat breakfast");		
		myToDoList.add("Write ToDoList program");
		myToDoList.add("Have lunch");
		myToDoList.add("Shopping");
		myToDoList.add("Meeting");
		myToDoList.add("Sleep");
		
//		myHashSet.add("Get ready");
//		myHashSet.add("eat breakfast");		
//		myHashSet.add("Write ToDoList program");
//		myHashSet.add("Have lunch");
//		myHashSet.add("Shopping");
//		myHashSet.add("Meeting");
//		myHashSet.add("Sleep");

		//System.out.println(myToDoList.size());
//		System.out.println(myHashSet.size());
		
				
		myToDoList.remove(0);
		myToDoList.add(4, "Dinner");
		
		
		for(int i = 0; i <myToDoList.size(); i++){
			System.out.println(myToDoList.get(i));
		}
		
		//Iterator <String> myIterator = myHashSet.iterator();
		//JFrame f = new JFrame();
		return myToDoList;
		}
}
