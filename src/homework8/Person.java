package homework8;

public class Person {
	String name;
	int age;
	boolean isMale;
	
	Person() {
		
	}
	
	Person(String name, int age, boolean isMale) {
		if (name != null && name.length() > 1) {
			this.name = name;
		}
		if (age > 0 && age < 150) {
			this.age = age;
		}
		this.isMale = isMale;
	}
	
	void showPersonInfo(Person person) {
		if (person != null) {
			System.out.println("Name: " + this.name);
			System.out.println("Age: " + this.age);
			System.out.println("isMale? " + this.isMale);
		}
	}
}
