package sr;

public class Student {

	private int id = -9999999;
	private String firstName = "N/A";
	private String lastName = "N/A";
	private boolean isCommuter = false;	

	public int getId(){
		
		return this.id;

	}	
	public void setId(int anId){
		
		this.id = anId;

	}


	public String getFirstName(){
		
		return this.firstName;

	}
	public void setFirstName(String aName){
		
		this.firstName = aName;

	}

	public String getLastName(){
		
		return this.lastName;

	}
	public void setLastName(String aName){
		
		this.lastName = aName;

	}

	public boolean getIsCommuter(){
		
		return this.isCommuter;

	}
	public void setIsCommuter(boolean aCommuter){
		
		this.isCommuter = aCommuter;

	}

	@Override
	public String toString(){
		
		String message = "";
		message = message + "ID: " + this.getId() + "\n";
		message = message + "First Name: " + this.getFirstName() + "\n";
		message = message + "Last Name: " + this.getLastName() + "\n";
		message = message + "Is Commuter: " + this.getIsCommuter() + "\n\n";
		return message;

	}
}
