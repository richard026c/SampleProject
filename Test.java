public class Employee {

	private int employeeID;
	private String name;
	
	public Employee() {
		this.employeeID = 1;
		this.name = "Andres Bonifacio";
	}
	
	public void setEmployeeId(int employeeID){
		this.employeeID = employeeID;
	}
	
	public int getEmployeeId(){
		return employeeID;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
}