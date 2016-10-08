package homework2;
import java.util.Scanner;

public class Zadacha17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int b; 
		char c;
		String s = "?";
		
		do {
			System.out.println("Enter b:");
			b = sc.nextInt();
			System.out.println("Enter c:");
			s = sc.next();
		}
		while ((b < 3 || b > 20) || s.length() != 1);
		
		c = s.charAt(0);
		
		for (int i = 0; i < b; i++) {
			System.out.print('*');
		}
		System.out.println();
		
		for (int i = 0; i < b - 2; i++) {
			System.out.print('*');
			for (int j = 0; j < b - 2; j++) {
				System.out.print(c);
			}
			System.out.println('*');
		}
		
		for (int i = 0; i < b; i++) {
			System.out.print('*');
		}
	}

}
