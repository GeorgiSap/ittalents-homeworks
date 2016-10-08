package homework8;

public class Student extends Person {

	double score;
	
	Student() {
		
	}
	
	Student(String name, int age, boolean isMale, double score) {
		super(name, age, isMale);
		if (score >= 2.0 && score <= 6.0) {
		this.score = score;
		}
	}
	
	void showStudentInfo(Student student) {
		if (student != null) {
		showPersonInfo(student);
		System.out.println("score: " + student.score);
		}
	}
}
