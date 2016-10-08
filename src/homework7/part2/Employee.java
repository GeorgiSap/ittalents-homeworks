package homework7.part2;


public class Employee {
	
	private String name; 
	private Task currentTask;
	private int hoursLeft;
	
	Employee(String name) {
		if (name != null && name.length() > 1) {
			this.name = name;
		}
	}
	
	public String getName() {
			return this.name;
	}

	public void setName(String name) {
		if (name != null && name.length() > 1) {
			this.name = name;
		}
	}
	
	public Task getCurrentTask() {
		return currentTask;
	}

	public void setCurrentTask(Task currentTask) {
		this.currentTask = currentTask;
	}

	public int getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(int hoursLeft) {
		if (hoursLeft >= 0) {
		this.hoursLeft = hoursLeft;
		}
	}
	
	void work() {
		if (this.currentTask != null) {
			if (this.hoursLeft > this.currentTask.getWorkingHours()) {
				this.hoursLeft -= this.currentTask.getWorkingHours();
				this.currentTask.setWorkingHours(0);
			} else {
				this.currentTask.setWorkingHours(this.currentTask.getWorkingHours() - this.hoursLeft);
				this.setHoursLeft(0);
			}
		} else {
			System.out.println("No task");
		}
	}

	void showReport() {
		System.out.println("Employee name: " + this.name);
		if (this.currentTask != null &&  this.currentTask.getName() != null && !this.currentTask.getName().equals("")) {
		System.out.println("Task name: " + this.currentTask.getName());
		} else {
			System.out.println("No task");
		}
		System.out.println("Working hours left: " + this.hoursLeft);
		if (this.currentTask != null) {
		System.out.println("Hours left to complete task: " + this.currentTask.getWorkingHours());
		}
	}

	
}
