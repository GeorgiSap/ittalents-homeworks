package homework1;
import java.util.Scanner;

public class Zadacha11 {
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int a;
	boolean isZero = false;
	int [] digits = new int[3];
	do {
		System.out.println("Vuvedete a:");
		a = sc.nextInt();
		int num = a;
		isZero = false;
		for (int i = 2; i >= 0; i--) {
			int digit = num % 10;
			digits[i] = digit;
			num = (num - digit) / 10;
			if (digit == 0) {
				isZero = true;
			}
		}
	}
	while (a < 100 || a > 999 || isZero);
	
	if (a % digits[0] == 0 && a % digits[1] == 0 && a % digits[2] == 0) {
		System.out.println("Deli se na vsichkite si chisla.");
	}
	else {
		System.out.println("Ne se deli na vsichkite si chisla.");
	}
}
}
