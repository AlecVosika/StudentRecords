package sr;

public class StudentNode {

	private Student aStudent = null;
	private StudentNode nextStudent = null;
	
	public StudentNode(Student aStudent) {
		
		this.aStudent = aStudent;
		
	}
	
	public void setStudent(Student aStudent) {
		this.aStudent = aStudent;
	}
	
	public Student getStudent() {
		return this.aStudent;
	}
	
	public void setNextStudent(StudentNode aStudent) {
		this.nextStudent = aStudent;
	}	
	
	public StudentNode getNextStudent() {
		return this.nextStudent;
	}
	
	@Override
	public String toString() {
		// return aStudent.toString();
		// return this.aStudent.toString();
		return this.getStudent().toString();
	}
	
	
}
