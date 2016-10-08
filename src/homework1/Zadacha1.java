package homework1;
import java.util.Scanner;

public class Zadacha1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete A:");
		double numA = sc.nextDouble();
		System.out.println("Vuvedete B:");
		double numB = sc.nextDouble();
		System.out.println("Vuvedete C:");
		double numC = sc.nextDouble();
		
		boolean isBetween = (numA < numC  && numC < numB) || (numA > numC  && numC > numB); 
		
		if (isBetween) {
			System.out.println("Chisloto " + numC + " e mejdu " + numA + " i " + numB);
		}
		else {
			System.out.println("Chisloto " + numC + " NE e mejdu " + numA + " i " + numB);
		}
	}

}
