
// How we can work with inner classes (non-static nested classes) in java?

package nestedClassPackage;

public class Employee {

	String empName; // members of outer class
	int empID;

	public Employee(String empName, int empID) {
		this.empName = empName;
		this.empID = empID;
	}

	// Non-static nested class / inner class // Class inside outer class
	private class Details { 
		int empIdentificationPin;
		String empSalary;

		public Details(int empIdentificationPin, String empSalary) {
			this.empIdentificationPin = empIdentificationPin;
			this.empSalary = empSalary;
		}

		// a method inside nested class can access members of outer class
		void getdetails() {
			System.out.println(empName);
			System.out.println(empID);
			System.out.println(empIdentificationPin);
			System.out.println(empSalary);
		}
	}

	/* 
	 * NOTE:- Since inner class exists within outer class,
	 * We must instantiate the outer class first, in order
	 * to instantiate inner class.
	 * 
	 * NOTE:- We use the dot (.) operator to create an instance
	 *  of inner class using the outer class
	 */
	public static void main(String[] args) {
		Employee emp = new Employee("John", 101);
		Employee.Details dtl = emp.new Details(7059, "$15000");
		dtl.getdetails();
	}

}
