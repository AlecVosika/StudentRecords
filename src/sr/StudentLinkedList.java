package sr;

public class StudentLinkedList {

	private StudentNode firstStudentNode = null;
	private StudentNode lastStudentNode = null;
	
	public void InsertFirstStudent(Student aStudent) {
		StudentNode temp = new StudentNode(aStudent);
		
		// if the list is empty then just add the Node
		if(firstStudentNode==null) {
			this.firstStudentNode = temp;
			this.lastStudentNode = temp;
		}
		// else the list already has items in it
		else {
			temp.setNextStudent(this.firstStudentNode);
			this.firstStudentNode = temp;
		}
		
		this.firstStudentNode.setNextStudent(null);
	}
	
	public void InsertLastStudent(Student aStudent) {
		StudentNode temp = new StudentNode(aStudent);
		
		// if the list is empty then just add the Node
		if(firstStudentNode==null) {
			this.firstStudentNode = temp;
			this.lastStudentNode = temp;
		}
		// else the list already has items in it
		else {
			this.lastStudentNode.setNextStudent(temp);
			this.lastStudentNode = temp;
			
		}
		this.lastStudentNode.setNextStudent(null);
		
	}
	
}
