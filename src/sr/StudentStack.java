package sr;

public class StudentStack {

	// define the Student array
	private int size = 10;
	private Student[] students = new Student[10];
	private int top = -1;
	
	
	public StudentStack() {
		// default the student array to size 10	
		this.size = 10;
		this.students = new Student[10];
		top = -1;
			
	}
	
	public StudentStack(int aSize) {
		// Allow the user to choose their own size
		this.size = aSize;
		this.students = new Student[aSize];
		top = -1;
			
	}
	
	public void push(Student aStudent) {
		// add one to top and then add the student to that location
		this.top++;
		// to do add an if statement here to check for a stack overflow
		// if(this.top >= this.students.length - 1){
		// throw stackoverflow exception here
		// }
		this.students[top] = aStudent;
			
	}
	
	public Student peek() {
		
		return this.students[top];
		
	}
	
	public Student pop() {
		
		Student tempStudent = this.students[top];
		this.students[top] = null;
		top--;
		return tempStudent;
		
		// the book does this
		// return this.students[top--];
		
	}	
	
	public boolean isFull() {
		boolean temp = false;
		
		if(this.top >= this.students.length -1) {
			temp = true;
		}else {
			temp = false;
		}
		
		return temp;
	}
	
	public boolean isEmpty() {
		boolean temp = false;
		
		if(this.top <= -1) {
			temp = true;
		}else {
			temp = false;
		}
		
		return temp;
	}	
	
	@Override
	public String toString() {
		
		String message = "";
		int index = 0;
		
		while(index < this.top) {
			message = message + this.students[index].toString();
			index++;
		}
		
		return message;
		
	}
	
	
	
}
