package homework7.part2;


public class Demo {

	public static void main(String[] args) {
		
		Employee ivan = new Employee("Ivan");
		ivan.setHoursLeft(10);
		Task painting = new Task("Painting", 10);
		ivan.setCurrentTask(painting);
		ivan.work();
		ivan.showReport();

	}

}
