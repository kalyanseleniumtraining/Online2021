package javaCode;

public class Employee {

	String empName;
	String empId;
	String empSalary;
	String compName;
	//4000 variables

	// constructor

	public Employee(String empName, String empId, String empSalary, String compName) {
		this.empName = empName;
		this.empId = empId;
		this.empSalary = empSalary;
		this.compName = compName;

	}

	public static void main(String[] args) {
		System.out.println("**********Akhila Details*************");
		Employee akhila = new Employee("Akhila", "E1", "10 Lakhs", "IBM");
		System.out.println(akhila.empName);
		System.out.println(akhila.empId);
		System.out.println(akhila.empSalary);
		System.out.println(akhila.compName);

		System.out.println("************Pavan Details******************");

		Employee pavan = new Employee("Pavan", "E2", "8 lakhs", "Wipro");
		System.out.println(pavan.empName);
		System.out.println(pavan.empId);
		System.out.println(pavan.empSalary);
		System.out.println(pavan.compName);

	}

}
