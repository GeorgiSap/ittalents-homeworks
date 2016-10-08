package homework7.part1;


public class Computer {
	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory = 8192;
	double freeMemory;
	String operationSystem;
	
	Computer () {
		this.operationSystem = "Win XP";
	}
	
	Computer (int year, double price, double hardDiskMemory, double freeMemory) {
		this();
		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
	}
	
	Computer (int year, double price, boolean isNotebook, 
			double hardDiskMemory, double freeMemory, String operationSystem) {
		this(year, price, hardDiskMemory, freeMemory);
		this.isNotebook = isNotebook;
		this.operationSystem = operationSystem;
	}
	
	int comparePrices(Computer c) {
		if (c != null && c.price > 0 && c.price < 100000) {
			if (this.price > c.price) {
				return -1;
			}
			if (this.price == c.price) {
				return 0;
			}
			return 1;
		} else {
			System.out.println("Invalid computer/ price");
			return -1;
		}
		
	}
	
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
