package homework5;

public class Zadacha13 {

	public static void main(String[] args) {
		
		int[] a1 = {1, 2, 3, 4};
		int[] a2 = {5, 6, 7, 8, 9, 10};
		int[] a3 = concatArrays(a1, a2);
		printArray(a3);
	}
	
	static int[] concatArrays(int[] arr1, int[] arr2) {
		int[] arr3 = new int[arr1.length + arr2.length];
		for (int index = 0; index < arr1.length; index++) {
			arr3[index] = arr1[index];
		}	
		for (int index = 0; index < arr2.length; index++) {
			arr3[index + arr1.length] = arr2[index];
		}
		return arr3;
	}
	
	static void printArray (int[] arr) {
		for (int index = 0; index < arr.length; index++) {
			System.out.print(arr[index] + " ");
		}
	}

}
