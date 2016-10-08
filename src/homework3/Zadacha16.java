package homework3;

public class Zadacha16 {

	public static void main(String[] args) {
		
		float[] a = {-1.12f, -2.43f, 3.1f, 4.2f, 0f, 6.4f, - 7.5f, 8.6f, 9.1f, -4f};

		for (int index = 0; index < a.length; index++) {
			System.out.print(a[index] + " ");
		}
		for (int index = 0; index < a.length; index++) {
			if (a[index] < -0.231) {
				a[index] = (((index+1)*(index+1)) + 41.25f);
			}
			else {
				a[index] *= (index+1);
			}
		}
		System.out.println();
		for (int index = 0; index < a.length; index++) {
			System.out.print(a[index] + " ");
		}
		
	}

}
