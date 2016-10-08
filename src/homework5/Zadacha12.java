package homework5;
import java.util.Scanner;

public class Zadacha12 {

	public static void main(String[] args) {
	
		int num = new Scanner(System.in).nextInt();
		int [] arr = createArrayFromNumber(num);
		printArray(arr);
	}
	
	static int[] createArrayFromNumber(int num) {
		int[] arr = new int[num];
		for (int index = 0; index < arr.length; index++) {
			arr[index] = index + 1;
		}
		return arr;
	}
	
	static void printArray (int[] arr) {
		for (int index = 0; index < arr.length; index++) {
			System.out.print(arr[index] + " ");
		}
	}

}
