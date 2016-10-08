package homework6;

public class Zadacha1 {

	public static void main(String[] args) {
		
		Computer acer = new Computer();
		acer.year = 2012;
		acer.price = 1000;
		acer.isNotebook = true;
		acer.hardDiskMemory = 1024;
		acer.freeMemory =200;
		acer.operationSystem = "Linux";
		
		Computer mac = new Computer();
		mac.year = 2010;
		mac.price = 900;
		mac.isNotebook = false;
		mac.hardDiskMemory = 160;
		mac.freeMemory = 40;
		mac.operationSystem = "MacOS";
		
		mac.useMemory((short)30);
		acer.changeOperationSystem("Windows");
		
		System.out.println("Acer - Year: " + acer.year + " Price: " + acer.price + " Is a notebook: " + acer.isNotebook +
				" Hard Disc Memory: " + acer.hardDiskMemory + " Free memory: " + acer.freeMemory + 
				" Operating system: " + acer.operationSystem);

		System.out.println("Mac - Year: " + mac.year + " Price: " + mac.price + " Is a notebook: " + mac.isNotebook +
				" Hard Disc Memory: " + mac.hardDiskMemory + " Free memory: " + mac.freeMemory + 
				" Operating system: " + mac.operationSystem);

	}

}
