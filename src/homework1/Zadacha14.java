package homework1;

import java.util.Scanner;

public class Zadacha14 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x1, y1, x2, y2;
		boolean isValid = true;
		
		do {
			if (!isValid) {
				System.out.println("Nevalidni koordinati - opitaite otnovo");
			}
			System.out.println("Vuvedete X1");
			x1 = sc.nextInt();
			System.out.println("Vuvedete Y1");
			y1 = sc.nextInt();
			System.out.println("Vuvedete X2");
			x2 = sc.nextInt();
			System.out.println("Vuvedete Y2");
			y2 = sc.nextInt();
			
			isValid = false;
			if ((x1 > 0 && x1 <= 8) && (y1 > 0 && y1 <= 8) && (x2 > 0 && x2 <= 8) && (y2 > 0 && y2 <= 8)) {
				isValid = true;
			}
		}while(!isValid);
		
		if (((x1 + x2) % 2) == ((y1 + y2) % 2)) {
			System.out.println("Poziciite sa s ednakuv cviat");
		} else {
			System.out.println("Poziciite sa s razlichen cviat");
		}
	}
}
