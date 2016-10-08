package homework7.part1;


public class College {

	public static void main(String[] args) {
		
		Student haralampi = new Student("Haralampi", "Istoria", (byte)20, false);
		Student petar = new Student("Petar", "Istoria", (byte)21, false);
		Student dimitar = new Student("Dimitar", "Fililogia", (byte)21, false);
		Student mariika = new Student("Mariika", "Fililogia", (byte)20, false);
		Student ivanka = new Student("Ivanka", "Istoria", (byte)22, false);
		Student aneta = new Student("Aneta", "Fililogia", (byte)22, false);
		
		haralampi.receiveScholarship(3.0, 10000);
		aneta.receiveScholarship(3.0, 15000);
		
		haralampi.upYear();
		haralampi.upYear();
		haralampi.upYear();
		ivanka.upYear();
		mariika.upYear();
		
		StudentGroup istoria = new StudentGroup("Istoria");
		StudentGroup fililogia = new StudentGroup("Fililogia");
		
		istoria.addStudent(haralampi);
		istoria.addStudent(petar);
		istoria.addStudent(ivanka);	
		fililogia.addStudent(dimitar);
		fililogia.addStudent(mariika);
		fililogia.addStudent(aneta);
	
		aneta.grade = 6.0;
		petar.grade = 5.0;
		
		System.out.println(istoria.theBestStudent());
		System.out.println(fililogia.theBestStudent());
		
		istoria.printStudentsInGroup();
		fililogia.printStudentsInGroup();
		
	}

}
