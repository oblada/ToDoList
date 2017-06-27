import java.util.ArrayList;
import java.util.Date;



public class MainToDoList {

	public static void main(String[] args) {
	
		//ToDo myToDo = new ToDo ("Get ready");
		ArrayList<String> myToDoList = new ArrayList <String>();
		
		myToDoList = ToDoList.creatToDoList();
		CheckList.myCheckalist(myToDoList);

		//System.out.println(myToDo.getText());
		//System.out.println(myToDo.getIsActive());
		
		
		//System.out.println(myToDoList.get(1).length());
		System.out.println(myToDoList.get(1)+ myToDoList.toString());
	}

	
	
}
