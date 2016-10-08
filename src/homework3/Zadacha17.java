package homework3;
import java.util.Scanner;

public class Zadacha17 {

	public static void main(String[] args) {
		
		int[] a = new int[6];
		Scanner sc = new Scanner(System.in);
		for (int index = 0; index < a.length; index++) {
			a[index] = sc.nextInt();
		}
		boolean isZigZag = true;
		for (int index = 1; index < a.length - 1; index++) {
			if (index % 2 != 0) {
				if (a[index] <= a[index - 1] || a[index] <= a[index + 1]) {
					isZigZag = false;
					break;
				}
			}
			else {
				if (a[index] >= a[index - 1] || a[index] >= a[index + 1]) {
					isZigZag = false;
					break;
				}
			}
		}
		if (isZigZag) {
			System.out.println("Izpalniava iziskvaniata za zigzagoobrazna nagore redica");
		}
		else {
			System.out.println("Ne izpalniava iziskvaniata za zigzagoobrazna nagore redica");
		}

	}

}
