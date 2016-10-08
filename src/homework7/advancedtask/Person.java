package homework7.advancedtask;


public class Person {
	String name;
	int age;
	long personalNumber;
	double weight;
	Gender gender;
	Person[] friends;
	double money;
	Car car;
	
	Person () {
		this.age = 0;
		this.weight = 4.0;
	}
	
	Person(int age, String name) {
		if (age > 0 && age <= 150) {
		this.age = age;
		}
		if (name != null && !name.equals("")) {
		this.name = name;
		}
	}
	
	Person(String name, long personalNumber, Gender gender) {
		this();
		if (name != null && !name.equals("")) {
		this.name = name;
		}
		if (("" + personalNumber).length() == 10) {
		this.personalNumber = personalNumber;
		}
		this.gender = gender;
		this.friends = new Person[3];
	}


	
	
	
}
