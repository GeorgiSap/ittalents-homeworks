package homework5;
import java.util.Scanner;

public class Zadacha14 {

	public static void main(String[] args) {
		
		int num = new Scanner(System.in).nextInt();
		int fact = factorial(num);
		System.out.println(fact);

	}
	
	static int factorial (int n) {
		int f = 1;
		while(n > 1) {
			f *= n;
			n--;
		}
		return f;
	}

}
