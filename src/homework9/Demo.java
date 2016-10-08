package homework9;

public class Demo {

	public static void main(String[] args) {
		
		AllWork allWork = new AllWork();
		Employee.setAllWork(allWork);
		Employee[] employees = new Employee[4];
		employees[0] = new Employee("Ivan");
		employees[1] = new Employee("Goran");
		employees[2] = new Employee("Asen");
		employees[3] = new Employee("Dora");
		
		allWork.addTask(new Task("software development", 40));
		allWork.addTask(new Task("customer service", 4));
		allWork.addTask(new Task("marketing", 2));
		allWork.addTask(new Task("planning", 2));
		allWork.addTask(new Task("reporting", 2));
		allWork.addTask(new Task("IT support", 20));
		allWork.addTask(new Task("data entry", 8));
		allWork.addTask(new Task("bookkeeping", 12));
		allWork.addTask(new Task("building a website", 10));
		allWork.addTask(new Task("translating text", 6));
		
		int days = 0;

		while (!AllWork.isAllWorkDone(allWork)) {
			System.out.println("WORKING DAY " + (++days) + " STARTS");
			for (Employee employee : employees) {
				employee.startWorkingDay();
				employee.work();
			}
			System.out.println();
		}

		
		System.out.println("WORK COMPLETED FOR " + days + " DAYS.");
		

		

	}

}
