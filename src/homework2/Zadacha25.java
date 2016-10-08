package homework2;
import java.util.Scanner;

public class Zadacha25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num:");
		int num = sc.nextInt();
		long fact = 1L;
		int count = 1;
		
		do {
			count++;
			fact *= count;	
		} while (count != num);	
		
		System.out.println(fact);
	}

}
