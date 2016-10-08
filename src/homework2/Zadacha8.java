package homework2;
import java.util.Scanner;

public class Zadacha8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete chislo");
		int n = sc.nextInt();
		int num = 1;
		
		for (int i = 1; i < n; i++) {
			num = num * 10 + 1;
		}
		
		for (int i = n - 1; i <= (n - 1) * 3; i+=2) {
			System.out.println(num * i);			
		}

	}

}
