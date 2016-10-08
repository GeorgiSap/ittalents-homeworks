package homework7.part1;


public class Student {
	String name; 
	String subject;
	double grade;
	byte yearInCollege;
	byte age;
	boolean isDegree;
	double money;
	
	Student() {
		this.grade = 4.0;
		this.yearInCollege = 1;
		this.money = 0;
	}
	
	Student(String name, String subject, byte age, boolean isDegree) {
		this();
		this.name = name;
		this.subject = subject;
		this.age = age;
		this.isDegree = isDegree;
	}
	
	void upYear () {
		if (!isDegree && yearInCollege > 0 && yearInCollege <= 4) {
			yearInCollege++;
			if (yearInCollege == 4) {
				isDegree = true;
			}
		} else {
			System.out.println("Student has already graduated/ Invalid year");
		}
	}
	
	double receiveScholarship (double min, double amount) {
		if (min < 0 || min > 6.00 || amount < 0) {
			System.out.println("Invalid parameters");
			return this.money;
		}
		if (grade >= min && age < 30) {
			this.money += amount;
		}

		return this.money;
	}
	
	
}
