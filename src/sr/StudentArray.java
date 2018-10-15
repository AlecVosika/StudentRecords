package sr;

public class StudentArray {

	private Student[] studentArray = null;
	private int lastElement = -1;
	
	public StudentArray() {
		studentArray = new Student[10];
	}
	
	public StudentArray(int size) {
		if(size>=1) {
			studentArray = new Student[size];
		}else {
			studentArray = new Student[10];
		}
	}
	
	public String insertStudent(Student aStudent) {
		String message = "";
		
		// Check to make sure there is room in the array
		if(lastElement < studentArray.length) {
			studentArray[lastElement + 1] = aStudent;
			lastElement++;
			message = message + "The student was added";
		}else {
			message = message + "The student was not added, the array was full";
		}
		
		return message;
		
	}
	public Student findStudentById(int anId) {
		
		int index = 0;
		
		Student foundStudent = null;
		
		while(index <= lastElement) {
			
			if(studentArray[index].getId()==anId) {
				foundStudent = studentArray[index];
			}
			
			index++;	
		}
		
		return foundStudent;
		
	}
	
	public String insertStudentNoDuplicates(Student aStudent) {
		
		Student duplicateStudent = null;
		String message = "";
	
		// first check to see if array is full
		if(lastElement >= studentArray.length) {
			message = message + "Student not added the array was full";
		}else {
		
			//Second check for duplicates
			duplicateStudent = this.findStudentById(aStudent.getId());
		
			if(duplicateStudent == null) {
				studentArray[lastElement + 1] = aStudent;
				lastElement++;
				message = message + "Student added";
			
			}else {
				message = message + "Student not added, it had a duplicate Id";
			}
		}
		
		return message;
		
	}
	
	public String insertStudentNoDuplicatesAndInOrderById(Student aStudent) {
		System.out.println("last element:" + lastElement);
		Student duplicateStudent = null;
		String message = "*";
		int index = 0;
		
		// first check to see if array is full
		if(lastElement >= studentArray.length) {
			
			message = message + "Student not added the array was full";
			
		}else {
			
			//Second check for duplicates
			duplicateStudent = this.findStudentById(aStudent.getId());
		
			if(duplicateStudent == null) {
				System.out.println("***");
				boolean insertionPointFound = false;
				
				// because checkpoint & lastElement is an integer
				// this will be integer division, i.e. no decimal point
				// we will start by checking the middle of the array
				int checkPoint = lastElement/2;
				System.out.println("checkPoint = ***" + checkPoint + "***");
				int boo = 0;
				
				while(insertionPointFound == false && boo < 5) {		
					if(studentArray[checkPoint].getId() > aStudent.getId()) {
						// See if we guessed too high in the array
						insertionPointFound = false;
						checkPoint = checkPoint/2;
					}else if(studentArray[checkPoint].getId() < aStudent.getId() && checkPoint < lastElement) {
						// See if we guessed too low in the array
						insertionPointFound = false;
						checkPoint = (checkPoint + lastElement + 1)/2;
					}else {		 
							insertionPointFound = true;
					}	
					System.out.println("insertionPointFound" + insertionPointFound);
					System.out.println("checkPoint =" + checkPoint + "***");
					System.out.println("Student =" + studentArray[checkPoint].getId() + "***");
					boo++;
				}
				
				// Now shift students over 
				index = lastElement + 1;
				while(index > checkPoint) {
					studentArray[index] = studentArray[index - 1];
					index--;
				}
				
				// finally add the new student
				studentArray[checkPoint] = aStudent;
				message = message + "The student was added";
				lastElement++;
				
			}else {
				message = message + "Student not added, it had a duplicate Id";
			}
		}
		
		return message;
		
	}
	
	@Override
	public String toString() {
		int index = 0;
		String message = "";
		
		while(index <= lastElement) {
			message = message + studentArray[index].toString();
			index++;
		}
		
		return message;
			
	}
	
}
