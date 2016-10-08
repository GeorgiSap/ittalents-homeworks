package homework4;

public class Zadacha3 {

	public static void main(String[] args) {
		int[][] array2d = {
				{48,72,13,14,15},
				{21,22,53,24},
				{31,57,33,34,35},
				{41,95,43},
				{59,52,53,54,55},
				{61,69}
				};
		int sum = 0;
		int count = 0;
		for (int row = 0; row < array2d.length; row++) {
			for (int col = 0; col < array2d[row].length; col++) {
				sum += array2d[row][col];
				count++;
			}
		}
		int avg = sum/count;
		System.out.println("Sum is: " + sum + ", avg is: " + avg);
	}

}
