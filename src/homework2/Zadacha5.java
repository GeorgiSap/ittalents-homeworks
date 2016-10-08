package homework2;
import java.util.Scanner;

public class Zadacha5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete purvoto chislo");
		int a = sc.nextInt();
		System.out.println("Vuvedete vtoroto chislo");
		int b = sc.nextInt();
		
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		for (int i = a; i <= b; i++) {
			System.out.print(i + " ");
		}
		
		
	}

}
