package homework7.advancedtask;


public class Car {
	String model;
	float maxSpeed;
	float currentSpeed;
	String color;
	char currentGear;
	Person owner;
	double price;
	boolean isSportCar;
	
	Car(){
		
	}
	
	Car(String model, boolean isSportCar, String color) {
		if (model != null && !model.equals("")) {
		this.model = model;
		}
		this.isSportCar = isSportCar;
		if (color != null && !color.equals("")) {
		this.color = color;
		}
		this.currentSpeed = 0;
		this.currentGear = 'N';
	}
	
	boolean isMoreExpensive(Car car) {
		if (car != null && car.price > 0) {
			if (this.price > car.price) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}


}
