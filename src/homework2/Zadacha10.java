package homework2;
import java.util.Scanner;

public class Zadacha10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete chislo");
		int n = sc.nextInt();
		boolean isPrime = true;
		
		if (n == 1) {
			isPrime = false;
		}
		
		 for(int i = 2; i < n; i++) {
		        if(n % i == 0) {
		        	isPrime = false;
		        }
		    }
		
		System.out.println("Prosto li e? - " + isPrime);

	}

}
