public class Employee {

	private int employeeID;
	private String firstName;
	
	public Employee() {
		this.employeeID = 1;
		this.firstName = "Juan";
	}
	
	public void setEmployeeId(int employeeID){
		this.employeeID = employeeID;
	}
	
	public int getEmployeeId(){
		return employeeID;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public String getFirstName(){
		return firstName;
	}
}