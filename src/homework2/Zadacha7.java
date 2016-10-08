package homework2;
import java.util.Scanner;

public class Zadacha7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete chislo");
		int n = sc.nextInt();
		
		for (int i = 3; i <= n * 3; i += 3) {	
			System.out.print(i);
			if (i != n * 3) {
				System.out.print(",");	
			}
			
		}
	}

}
