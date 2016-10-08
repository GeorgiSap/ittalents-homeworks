package homework7.part2;


public class Task {
	
	private String name;
	private int workingHours;
	
	Task(String name, int workingHours) {
		if (name != null && name.length() > 1) {
			this.setName(name);
		}
		if (workingHours > 0) {
			this.setWorkingHours(workingHours);
		}
	}
	
	public String getName() {
		if (this.name != null && !this.name.equals("")) {
			return this.name;
		}
		return "No name";
	}

	public void setName(String name) {
		if (name != null && name.length() > 1) {
			this.name = name;
		}
	}

	public int getWorkingHours() {
		return this.workingHours;
	}

	public void setWorkingHours(int workingHours) {
		if (workingHours >= 0) {
			this.workingHours = workingHours;
		}
	}
}
