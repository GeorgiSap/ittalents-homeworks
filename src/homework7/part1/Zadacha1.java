package homework7.part1;


public class Zadacha1 {

	public static void main(String[] args) {
		
		Computer pravetz = new Computer();
		
		Computer acer = new Computer(2012, 1000, 1024, 200);
		
		Computer mac = new Computer(2010, 900, false, 160, 40, "MacOS");
		
		Computer macbook = new Computer(2010, 900, true, 100, 20, "MacOS");
		
		System.out.println(acer.comparePrices(mac));
		System.out.println(macbook.comparePrices(mac));
		System.out.println(macbook.comparePrices(acer));
		System.out.println(acer.comparePrices(pravetz));
	}

}
