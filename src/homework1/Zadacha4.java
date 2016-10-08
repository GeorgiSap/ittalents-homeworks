package homework1;
import java.util.Scanner;

public class Zadacha4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete A:");
		int numA = sc.nextInt();
		System.out.println("Vuvedete B:");
		int numB = sc.nextInt();
		
		if (numA > numB) {
			System.out.println(numB);
			System.out.println(numA);
		}
		else {
			System.out.println(numA);
			System.out.println(numB);
		}

	}

}
