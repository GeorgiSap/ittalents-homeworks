package homework8;

public class Demo {
	public static void main(String[] args) {
		Person[] people = new Person[10];
		
		people[0] = new Person("Ivan", 25, true);
		people[1] = new Person("Dobri", 28, true);
		people[2] = new Student("Ivailo", 22, true, 5.0);
		people[3] = new Student("Maria", 24, false, 5.5);
		people[4] = new Employee("Krasimira", 32, false, 160);
		people[5] = new Employee("Sava", 28, true, 120);
		
		int index = 0;
		while (people[index] != null) {
			if (people[index] instanceof Student) {
				((Student)people[index]).showStudentInfo((Student)people[index]);
			} else {
				if (people[index] instanceof Employee) {
					((Employee)people[index]).showEmployeeInfo((Employee)people[index]);
				} else {
					people[index].showPersonInfo(people[index]);
				}
			}
			System.out.println();
			index++;
		}
		index = 0;
		while (people[index] != null) {
			if (people[index] instanceof Employee) {
				System.out.println(((Employee)people[index]).calculateOvertime(2));
			}
			index++;
		}
	}
}
