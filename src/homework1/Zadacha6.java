package homework1;
import java.util.Scanner;

public class Zadacha6 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete a1:");
		int a1 = sc.nextInt();
		System.out.println("Vuvedete a2:");
		int a2 = sc.nextInt();
		System.out.println("Vuvedete a3:");
		int a3 = sc.nextInt();
		
		int temp = a1;
		a1 = a2;
		a2 = a3;
		a3 = temp;
		
		System.out.println("a1 = " + a1);
		System.out.println("a2 = " + a2);
		System.out.println("a3 = " + a3);
		
	}

}
