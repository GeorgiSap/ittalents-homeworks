package homework3;

public class Zadacha15 {

	public static void main(String[] args) {

		float[] a = {7.13f, 0.2f, 4.9f, 5.1f, 6.34f, 1.12f};
		float[] max = {Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE};

		for (int index = 0; index < a.length; index++) {
			if (a[index] > max[0]) {
				max[2] = max[1];
				max[1] = max[0];
				max[0] = a[index];
			} else {
				if (a[index] > max[1]) {
					max[2] = max[1];
					max[1] = a[index];
				} else {
					if (a[index] > max[2]) {
						max[2] = a[index];
					}
				}
			}
		}
		for (int index = 0; index < max.length; index++) {
			System.out.println(max[index] + " ");
		}
	}

}
