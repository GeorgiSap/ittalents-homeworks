package homework1;
import java.util.Scanner;

public class Zadacha10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a;
		
		do {
			System.out.println("Vuvedete a:");
			a = sc.nextInt();
		}
		while (a < 10 || a > 9999);
		
		int times = a / 5;
		int rest = a % 5;
		if (rest == 1) {
			times--;
		}
		
		System.out.println(times + " puti po 2 litra");
		System.out.println(times + " puti po 3 litra");
		
		switch (rest) {
		case 1:
			System.out.println("Dopulnitelno 2 kofi ot 3 litra");	
			break;
		case 2:
			System.out.println("Dopulnitelno kofa ot 2 litra");
			break;
		case 3:
			System.out.println("Dopulnitelno kofa ot 3 litra");	
			break;
		case 4:
			System.out.println("Dopulnitelno 2 kofi ot 2 litra");
			break;
		default:
			break;
		}
	}

}
