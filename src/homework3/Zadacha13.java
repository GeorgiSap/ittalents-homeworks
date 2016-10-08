package homework3;
import java.util.Scanner;

public class Zadacha13 {

	public static void main(String[] args) {

		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int powerOfTwo = 1;
		int arrayLength = 0;
		
		while (num >= powerOfTwo) {
			powerOfTwo *= 2;
			arrayLength++;
		}
		int[] binary = new int[arrayLength];
		
		for (int index = binary.length - 1; index >= 0; index--) {
			binary[index] = num % 2;
			num /= 2;
		}
		
		for (int index = 0; index < binary.length; index++) {
			System.out.print(binary[index]);
		}

	}

}
