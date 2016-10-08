package homework7.advancedtask;


public class CarDemo {

	public static void main(String[] args) {
		
		Car volga = new Car("volga", false, "cheren");
		Car warburg = new Car("warburg", false, "byal");
		Car moskvich = new Car("moskvich", false, "cherven");
		Car lada = new Car("lada", false, "sinya");
		Car zaporojec = new Car("zaporojec", false, "zelen");
		Car trabant = new Car("trabant", true, "bejov");
		
		CarShop avtokushta = new CarShop(6);
		System.out.println(avtokushta.addCar(volga));
		System.out.println(avtokushta.addCar(warburg));
		System.out.println(avtokushta.addCar(moskvich));
		System.out.println(avtokushta.addCar(lada));
		System.out.println(avtokushta.addCar(zaporojec));
		System.out.println(avtokushta.addCar(trabant));
		System.out.println();
		avtokushta.showAllCarsInTheShop();
		avtokushta.removeCar(lada);
		avtokushta.sellNextCar(new Person());
		avtokushta.sellNextCar(new Person());
		avtokushta.removeCar(moskvich);
		avtokushta.sellNextCar(new Person());
		avtokushta.sellNextCar(new Person());
		avtokushta.showAllCarsInTheShop();

	}

}
