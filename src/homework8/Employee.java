package homework8;

public class Employee extends Person {
	double daySalary;
	static float workingHoursPerDay = 8f;
	static float overtimeRate = 1.5f;
	
	Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);
		if (daySalary > 0) {
			this.daySalary = daySalary;
		}
	}
	
	double calculateOvertime(double hours) {
		if (hours < 0 || this.age < 18) {
			return 0;
		} else {
			return ((daySalary/workingHoursPerDay)*overtimeRate)*hours;
		}
	}	
	
	void showEmployeeInfo(Employee employee) {
		if (employee != null) {
			showPersonInfo(employee);
			System.out.println("Day Salary: " + this.daySalary);
		}
	}
}
