package homework5;
import java.util.Scanner;

public class Zadacha3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String symbols1 = sc.next();
		String symbols2 = sc.next();
		if (symbols1.length() == symbols2.length()) {
			System.out.println("Dvata niza sa s ravna duljina");
		} else {
			System.out.println("Dvata niza ne sa s ravna duljina");
		}
		boolean diffAvailable = false;
		int shorterLength = (symbols1.length() > symbols2.length()) ? symbols2.length() : symbols1.length();
		for (int index = 0; index < shorterLength; index++) {
			if (symbols1.charAt(index) != symbols2.charAt(index)) {
				if (!diffAvailable) {
					diffAvailable = true;
					System.out.println("Razlika po pozicii:");
				}
				System.out.println((index+1) + " " + symbols1.charAt(index) + "-" + symbols2.charAt(index));
			}
		}
		if (!diffAvailable) {
		System.out.println("Niama razliki po pozicii");
		}
	}
}
