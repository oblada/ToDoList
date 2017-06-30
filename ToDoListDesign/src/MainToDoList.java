import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;


import ui.FrameOfToDo;




public class MainToDoList {



	public static void main(String[] args) {
		System.out.println("\n"
				+ "1= Add a new item.\n"
				+ "2= Show the itemList.\n"
				+ "3= Remove an existed item.\n"
				+ "4= Witch task do you want to change?"
				+ "5= Remane an item.\n"
				+ "6= Search for an item.\n"
				+ "7= Witch task is done?\n"
				+ "8= Remove all done items.\n"
				+ "9= Mark a item.\n"
				+ "10= unmark a item.\n"
				+ "0= Exit.\n");

		ToDoList myList = new ToDoList();

		//ArrayList<String> myToDoList = new ArrayList <String>();


		Scanner scan = new Scanner(System.in);

		//		int textIn = scan.nextInt();
		//		scan.nextLine();
		//		


		

		exit: while(true) { //while
//			
			int textIn = 0;
			
			//do{
			
			System.out.println("Chose a number 0-8!");
			
			//try {//try
			 textIn = scan.nextInt();
		
//			}
//			
//			catch (InputMismatchException ime){
//			System.out.println("You should enter a numer between 0-8");
//			userInputBad = true;	
//			
//			}
//			
			scan.nextLine();
//			if (i>3)break;
//				
//			}		
//			while(userInputBad);
//			if (userInputBad == true)break;
//			
//			
				
			switch (textIn) {
			case 0: 
				System.out.println("Exit!");
				break exit;


			case 1: {
				System.out.println("Enter a task!");
				String item = scan.nextLine();
				ToDo t = new ToDo(item);
				myList.myToDoList.add(t);

				break;
			}


			case 2: {
				System.out.println("List of tasks to do: ");
				for(ToDo next:myList.myToDoList )
					System.out.println(next);
				break;
			}
			
			

			case 3: {
				System.out.println("Enter the name of task you want to remomve: ");
				String text = scan.nextLine();
				Iterator<ToDo> itr = myList.myToDoList.iterator();
				while (itr.hasNext()){					
					ToDo td = itr.next();
					if(td.getText().equalsIgnoreCase(text)){				
						itr.remove();	
					}
				}

				break;
			} 

			case 4:{
				System.out.println("Enter a task you want to change it's name?");
				String str = scan.next();
				
				Iterator<ToDo> itr = myList.myToDoList.iterator();
				while (itr.hasNext()){	
					ToDo td = itr.next();
					if (td.getText().equalsIgnoreCase(str)){
//						td.getText();
//						td.setText(itr);
					}
				
				}
				break;
			}


			case 5:{ 
				System.out.println("Enter a new task:");
				break;
			}
			

			case 6:{ 
				System.out.println ("Search an item!");
				searchmyToDoList(myList);
				break;
			}


			case 7:{
				System.out.println("Entre the name of task that is done?");
				String str = scan.next();
				
				Iterator<ToDo> itr = myList.myToDoList.iterator();
				while (itr.hasNext()){	
					ToDo td = itr.next();
					if (td.getText().equalsIgnoreCase(str)){
						td.setActive(true);
					}

				}
				break;
			}
			

			case 8: {
				System.out.println("Remove all done items");

				Iterator<ToDo> itr = myList.myToDoList.iterator();
				while (itr.hasNext()){	
					ToDo td = itr.next();
					if (td.isActive() == true){
						itr.remove();
					}

				}

				break;
			}

			case 9: 
			case 10: 
				break;


				//InputMismatchException


			default: {
				System.out.println("Unkown choice!");
				break;
			}



			}//switch
		
			
		}//while
	}

	private static void searchmyToDoList(ToDoList myList) {


	}//Main



}//class
