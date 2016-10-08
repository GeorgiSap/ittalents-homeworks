package homework2;
import java.util.Scanner;

public class Zadacha21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte num;
		
		do {
			System.out.println("Enter num");
			num = sc.nextByte();

		} while(num < 1 || num > 51);
		
		byte color = ((byte) ((num % 4)));
		byte card = (byte) ((num / 4) + 2);
		if (color == 0) {
			color = 4;
			card--;
		}
		
		for (int i = num; i <= 52; i++) {

			if (card < 11) {
				System.out.print(card);
			}
			else {
				if (card == 11) {
					System.out.print("Vale");
				}
				if (card == 12) {
					System.out.print("Dama");
				}
				if (card == 13) {
					System.out.print("Pop");
				}
				if (card == 14) {
					System.out.print("Aso");
				}
			}
			
			if (color == 1) {
				System.out.print(" spatia, ");
			}
			if (color == 2) {
				System.out.print(" karo, ");
			}
			if (color == 3) {
				System.out.print(" kupa, ");
			}
			if (color == 4) {
				System.out.print(" pika");
				if (i != 52) {
					System.out.print(", ");
				}
			}
			color++;
			if (color > 4) {
				color = 1;
				card++;
			}
		}
		
	}
	
}
