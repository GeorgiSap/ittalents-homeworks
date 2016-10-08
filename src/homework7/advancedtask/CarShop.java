package homework7.advancedtask;


public class CarShop {
	Car[] cars;
	int freeSpace;
	int currentCar;
	
	CarShop(int capacity){
		if (capacity >= 0) {
			cars = new Car[capacity];
			freeSpace = capacity;
		}
	} 
	
	boolean addCar(Car car) {
		if (car != null && freeSpace > 0) {
			cars[cars.length - freeSpace] = car;
			freeSpace--;
			return true;
		}
		return false;
	}
	
	Car getNextCar() {
		if (cars != null && freeSpace < cars.length) {
			if (currentCar >= (cars.length - freeSpace)) {
				currentCar = 0;
			}
			if (cars[currentCar] != null) {
			return cars[currentCar++];
			}
		} else {
			System.out.println("No cars in the shop.");
		}
		return null;
	}
	
	void sellNextCar(Person buyer) {
		if (buyer != null) {
			Car nextCar = getNextCar();
			if (nextCar != null) {
				nextCar.owner = buyer;
				buyer.car = nextCar;
				boolean isRemoved = removeCar(nextCar);
				if (isRemoved) {
					if (currentCar > 0) {
						currentCar--;
					} else {
						currentCar = cars.length - freeSpace - 1;	
					}
				}
			}
		}
	}
	
	boolean removeCar(Car car) {
		if (car != null) {
			for (int index = 0; index < cars.length - freeSpace; index++) {
				if (cars[index] == car) {
					for (int index1 = index; index1 < cars.length - freeSpace - 1; index1++) {
						cars[index1] = cars[index1 + 1];
					}
					cars[cars.length - freeSpace - 1] = null;
					freeSpace++;
					return true;
				}
			}
		}
			return false;
	}
	
	 void showAllCarsInTheShop() {
		 for (int index = 0; index < cars.length - freeSpace; index++) {
			System.out.println(cars[index].model + " " + cars[index].color);
		}
	 }

}
