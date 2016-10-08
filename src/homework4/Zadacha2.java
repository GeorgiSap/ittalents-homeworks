package homework4;
import java.util.Scanner;

public class Zadacha2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array row/col length:");
		int length = sc.nextInt();
		int[][] array2d = new int[length][length];
		for (int row = 0; row < length; row++) {
			for (int col = 0; col < length; col++) {
				array2d[row][col] = sc.nextInt();
			}
		}
		for (int row = 0; row < length; row++) {
			for (int col = 0; col < length; col++) {
				if (row == col) {
					System.out.print(array2d[row][col]+ " ");
				}
			}
		}
		System.out.println();
		for (int row = 0; row < length; row++) {
			for (int col = 0; col < length; col++) {
				if (row == length - 1 - col) {
					System.out.print(array2d[row][col]+ " ");
				}
			}
		}
	}
}
