package sr;
import java.util.ArrayList;
import java.util.List;

public class MainController {
	
	public static void main(String[] args) {
		
		ConsoleView aView = new ConsoleView();
		TextConnection aTextConnection = new TextConnection();
		List<String> MyData = new ArrayList<String>();
		
		MyData = aTextConnection.getFile("C:\\CodeRepository\\", "Records.csv");
		String[] aStudent = new String[4];

		for(String s : MyData) {
			aStudent = s.split(",");
			System.out.printf("%3s %-3s %-1s %-10s %-10s %n "
					         +"%9s %-1s %-1s %n "
					         +"%9s %-1s %-1s %n %n", 
							  "id:", aStudent[0], "||", "FirstName:", aStudent[1], 
							  "||", "LastName:", aStudent[2],
							  "||", "Commuter:", aStudent[3]);
		}
		System.out.println("...Done");
	}
	
	
	/*
	public static void main(String[] args) {

		ConsoleView aView = new ConsoleView();
		StudentArray anArray = new StudentArray();
		
		Student aStudent1 = new Student();
		Student aStudent2 = new Student();
		Student aStudent3 = new Student();
		Student aStudent4 = new Student();
		Student aStudent5 = new Student();
		Student aStudent6 = new Student();
		Student aStudent7 = new Student();
		Student aStudent8 = new Student();
		Student aStudent9 = new Student();
		
		aStudent1.setId(1);
		aStudent1.setFirstName("Jane");
		aStudent1.setLastName("Doe");	
		aStudent1.setIsCommuter(true);

		aStudent2.setId(3);
		aStudent2.setFirstName("John");
		aStudent2.setLastName("Doe");	
		aStudent2.setIsCommuter(true);		
		
		aStudent3.setId(5);
		aStudent3.setFirstName("Carlos");
		aStudent3.setLastName("Doe");	
		aStudent3.setIsCommuter(false);		
		
		aStudent4.setId(7);
		aStudent4.setFirstName("Maria");
		aStudent4.setLastName("Smith");	
		aStudent4.setIsCommuter(false);		
		
		aStudent5.setId(9);
		aStudent5.setFirstName("Anna");
		aStudent5.setLastName("Lee");	
		aStudent5.setIsCommuter(true);
		
		aStudent6.setId(11);
		aStudent6.setFirstName("Cynthia");
		aStudent6.setLastName("Lee");	
		aStudent6.setIsCommuter(false);
		
		aStudent7.setId(0);
		aStudent7.setFirstName("Jacob");
		aStudent7.setLastName("Stevens");	
		aStudent7.setIsCommuter(false);
		
		aStudent8.setId(100);
		aStudent8.setFirstName("Anna");
		aStudent8.setLastName("Ives");	
		aStudent8.setIsCommuter(true);
		
		aStudent9.setId(6);
		aStudent9.setFirstName("Kendra");
		aStudent9.setLastName("Jones");	
		aStudent9.setIsCommuter(false);
		
		
		
		aView.print("Now inserting students, duplicates allowed");
		aView.print(anArray.insertStudent(aStudent1));
		aView.print(anArray.insertStudent(aStudent2));	
		aView.print(anArray.insertStudent(aStudent3));
		aView.print(anArray.insertStudent(aStudent4));
		aView.print(anArray.insertStudent(aStudent5));
		
		aView.print("\n");
		aView.print(anArray.toString());
		
		aView.print("Now inserting students, no duplicates allowed");
		aView.print(anArray.insertStudentNoDuplicates(aStudent1));
		aView.print(anArray.insertStudentNoDuplicates(aStudent2));
		aView.print(anArray.insertStudentNoDuplicates(aStudent3));
		aView.print(anArray.insertStudentNoDuplicates(aStudent4));
		aView.print(anArray.insertStudentNoDuplicates(aStudent5));
		aView.print(anArray.insertStudentNoDuplicates(aStudent6));
		
		aView.print("\n");
		aView.print(anArray.toString());
		
		aView.print("Now inserting students in order, no duplicates allowed");
		aView.print(anArray.insertStudentNoDuplicatesAndInOrderById(aStudent7));
		aView.print(anArray.insertStudentNoDuplicatesAndInOrderById(aStudent8));
		aView.print(anArray.insertStudentNoDuplicatesAndInOrderById(aStudent9));
		
		aView.print("\n");
		aView.print(anArray.toString());
		
		
		aView.print("Now inserting students in order, no duplicates allowed");
		aView.print(anArray.insertStudentNoDuplicatesAndInOrderById(aStudent1));
		aView.print(anArray.insertStudentNoDuplicatesAndInOrderById(aStudent2));
		aView.print(anArray.insertStudentNoDuplicatesAndInOrderById(aStudent3));
		aView.print(anArray.insertStudentNoDuplicatesAndInOrderById(aStudent4));
		aView.print(anArray.insertStudentNoDuplicatesAndInOrderById(aStudent5));
		aView.print(anArray.insertStudentNoDuplicatesAndInOrderById(aStudent6));
		aView.print(anArray.insertStudentNoDuplicatesAndInOrderById(aStudent7));
		aView.print(anArray.insertStudentNoDuplicatesAndInOrderById(aStudent8));
		aView.print(anArray.insertStudentNoDuplicatesAndInOrderById(aStudent9));
		
		aView.print("\n");
		aView.print(anArray.toString());
	
	
		
	
		// Student stack results
		aView.print("Now inserting students in order, no duplicates allowed");
		aStack.push(aStudent1);
		aStack.push(aStudent2);
		aStack.push(aStudent3);
		aStack.push(aStudent4);
		aStack.push(aStudent5);
		aStack.push(aStudent6);
		aStack.push(aStudent7);
		aStack.push(aStudent8);
		//aStack.push(aStudent9);
			
		
	
		aView.print("\n");
		aView.print(aStack.toString());
	
	}
	*/
}



