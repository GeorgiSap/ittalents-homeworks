package homework6;

public class Computer {
	short year;
	short price;
	boolean isNotebook;
	short hardDiskMemory = 8192;
	short freeMemory;
	String operationSystem;
	
	void changeOperationSystem(String newOperationSystem) {
		if (newOperationSystem != null && !newOperationSystem.equals("")) {
			operationSystem = newOperationSystem;
		} else {
			System.out.println("Invalid operating system.");
		}
		
	}
	
	void useMemory(short memory) {
		if (memory > 0 && memory <= freeMemory) {
			freeMemory -= memory;
		} else {
			System.out.println("Not enough free memory!");
		}
	}
	
}
