package homework7.part1;


public class StudentGroup {
	String groupSubject;
	Student[] students;
	int freePlaces;
	
	StudentGroup() {
		students = new Student[5];
		freePlaces = 5;
	}
	
	StudentGroup(String subject) {
		this();
		if (subject != null && !subject.equals("")) {
		this.groupSubject = subject;
		} else {
			System.out.println("Invalid subject");
		}
		
	}
	
	void addStudent(Student s) {
		if (s != null && s.subject != null && s.subject.equalsIgnoreCase(this.groupSubject) && freePlaces > 0) {
			this.students[students.length - freePlaces] = s;
			freePlaces--;
		} else {
			System.out.println("Invalid student/ subject");
		}
	}
	
	void emptyGroup() {
		this.students = new Student[5];
		freePlaces = 5;
	}
	
	String theBestStudent() {
		int studentWithMaxGrade = 0;
		for (int index = 0; index < this.students.length - freePlaces; index++) {
			if (this.students[index].grade > this.students[studentWithMaxGrade].grade) {
				studentWithMaxGrade = index;
			}
		}
		return this.students[studentWithMaxGrade].name;
	}
	
	void printStudentsInGroup() {
		for (int index = 0; index < this.students.length - freePlaces; index++) {
			System.out.println("Name: " + students[index].name + " Grade: " + students[index].grade + 
					" Age: " + students[index].age + " Year in college: " + students[index].yearInCollege + 
					" hasDegree: " + students[index].isDegree + " Money: " + students[index].money);
		}
	}
}
