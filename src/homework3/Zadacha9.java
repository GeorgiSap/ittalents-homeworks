package homework3;

public class Zadacha9 {

	public static void main(String[] args) {

		// int [] a = {2,7,3,6,5,1};
		// int [] b = new int[a.length];
		//
		// for (int index = 0; index < a.length; index++) {
		// b[a.length - 1 - index] = a[index];
		// }
		//
		// for (int index = 0; index < b.length; index++) {
		// System.out.print(b[index] + " ");
		// }

		int[] a = {2, 3, 1, 5, 4};

		for (int index = 0; index < a.length / 2; index++) {
			int temp = a[index];
			a[index] = a[a.length - 1 - index];
			a[a.length - 1 - index] = temp;
		}

		for (int index = 0; index < a.length; index++) {
			System.out.print(a[index] + " ");
		}

	}

}
