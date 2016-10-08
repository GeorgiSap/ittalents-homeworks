package homework9;

public class AllWork {
	Task[] tasks;
	private int freePlacesForTask;
	private static int currentUnassignedTask;
	
	AllWork() {
		tasks = new Task[10];
		freePlacesForTask = 10;
		currentUnassignedTask = 0;
	}
	
	static int getCurrentUnassignedTask () {
		return AllWork.currentUnassignedTask;
	}
	
	static void setCurrentUnassignedTask (int currentUnassignedTask) {
		AllWork.currentUnassignedTask = currentUnassignedTask;
	}
	
	void addTask (Task task) {
		if (task != null) {
			if (freePlacesForTask-- > 0 && currentUnassignedTask < tasks.length) {
				tasks[currentUnassignedTask++] = task;
			} else {
				System.out.println("No free places.");
			}
		}
	}
	
	Task getNextTask () {
		if (currentUnassignedTask - 1 >= 0 && currentUnassignedTask - 1 < this.tasks.length) {
			return tasks[currentUnassignedTask - 1];
		}	
		return null;
	}
	
	static boolean isAllWorkDone (AllWork allWork) {
		for (Task task : allWork.tasks) {
				if (task.getWorkingHours() != 0) {
					return false;
				}
		}
		return true;
	}
}
