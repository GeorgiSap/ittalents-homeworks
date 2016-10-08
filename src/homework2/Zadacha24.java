package homework2;
import java.util.Scanner;

public class Zadacha24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int pal = 0;
		do {
			System.out.println("Enter num");
			num = sc.nextInt();

		} while(num < 10 || num > 30000);
		
		int init = num;
		while (num != 0) {
			int rest = num % 10;
			num -= rest;
			num /= 10;
			pal *= 10;
			pal += rest;
		}
		if (init == pal) {
			System.out.println("Palindrom e");
		}
		else {
			System.out.println("Ne e palindrom");
		}
		
		

	}

}
