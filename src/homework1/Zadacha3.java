package homework1;
import java.util.Scanner;

public class Zadacha3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete A:");
		int numA = sc.nextInt();
		System.out.println("Vuvedete B:");
		int numB = sc.nextInt();
		
		int numC = numA;
		numA = numB;
		numB = numC;
		
		System.out.println(numA);
		System.out.println(numB);
	}

}
