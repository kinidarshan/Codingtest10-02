package codingtest;

class Employee
{
	String FirstName;
	String LastName;
	public Employee(String firstName, String lastName) {
		super();
		this.FirstName = firstName;
		this.LastName = lastName;
	}
	@Override
	public String toString() {
		return "Employee [FirstName=" + FirstName + ", LastName=" + LastName + "]";
	}


public class instancedemo {

	public void main(String[] args) {
		
		Employee e1= new Employee("Darshan","Kini");
		System.out.println(e1);
		Employee e2= new Employee("Ninad","N");
		System.out.println(e2);
		Employee e3= new Employee("Suraj","S");
		System.out.println(e3);
		
	
		
	}

}
}