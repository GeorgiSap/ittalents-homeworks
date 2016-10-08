package homework1;
import java.util.Scanner;

public class Zadacha8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		do {
			System.out.println("Vuvedete chislo:");
			num = sc.nextInt();
		}
		while (num < 1000 || num > 9999);
		
		int [] digits = new int[4];
		
		for (int i = digits.length - 1; i >= 0; i--) {
			int digit = num % 10;
			num = (num - digit) / 10;
			digits[i] = digit;
		}
		
		char sign;
		int numA = (digits[0]*10) + digits[3];
		int numB = (digits[1]*10) + digits[2];
		
		if (numA > numB) {
			sign = '>';
		} else {
			if (numA == numB) {
				sign = '=';
			} else {
				sign = '<';
			}
		}	
		
		System.out.println("" + numA + sign + numB);
		
	}
	

}
