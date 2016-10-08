package homework9;

public class Employee {
	
	private String name; 
	private Task currentTask;
	private int hoursLeft;
	private static AllWork allWork;
	
	Employee(String name) {
		if (name != null && name.length() > 1) {
			this.name = name;
		}
	}
	
	public static void setAllWork (AllWork allWork) {
		Employee.allWork = allWork;
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
				if (this.currentTask.getWorkingHours() <= 0) {
					if (AllWork.getCurrentUnassignedTask() > 0) {
						assignNewTask();
						workOnCurrentTaskTillEndOfTheDay();
					} else {
						System.out.println(this.name + " does not have any task.");
						System.out.println(this.name + " leaves the workplace.");
					}
				} else {
					System.out.println(this.name + " continues " + this.currentTask.getName() + "...");
					workOnCurrentTaskTillEndOfTheDay();
				}
			} else {
				assignNewTask();
				if (this.currentTask != null) {
					work();
				}
			}
	}
	
	void startWorkingDay() {
		this.hoursLeft = 8;
	}
	
	void assignNewTask() {
		this.currentTask = allWork.getNextTask();
		if (this.currentTask != null) {
			System.out.println(this.name + " starts working on " + this.currentTask.getName() + "...");
			AllWork.setCurrentUnassignedTask(AllWork.getCurrentUnassignedTask() - 1);
		}
	}
	
	void workOnCurrentTaskTillEndOfTheDay() {
		if (this.hoursLeft > this.currentTask.getWorkingHours()) {		
			completeTask();
		} else {
			leaveWorkBeforeCompletion();
		}
	}
	
	void completeTask() {
		this.hoursLeft -= this.currentTask.getWorkingHours();
		this.currentTask.setWorkingHours(0);
		System.out.println(this.name + " completes " + this.currentTask.getName() + "!");
		work();
	}
	
	void leaveWorkBeforeCompletion() {
		this.currentTask.setWorkingHours(this.currentTask.getWorkingHours() - this.hoursLeft);
		this.setHoursLeft(0);
		System.out.println(this.name + " leaves the workplace.");
	}

	
}
