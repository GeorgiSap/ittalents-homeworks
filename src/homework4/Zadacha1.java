package homework4;

public class Zadacha1 {

	public static void main(String[] args) {
		
		int[][] array2d = {
				{48,72,13,14,15},
				{21,22,53,24,75},
				{31,57,33,34,35},
				{41,95,43,44,45},
				{59,52,53,54,55},
				{61,69,63,64,65}
				};
		int minValue = Integer.MAX_VALUE;
		int maxValue = Integer.MIN_VALUE;
		for (int row = 0; row < array2d.length; row++) {
			for (int col = 0; col < array2d[row].length; col++) {
				if (minValue > array2d[row][col]) {
					minValue = array2d[row][col];
				}
				if (maxValue < array2d[row][col]) {
					maxValue = array2d[row][col];
				}
			}
		}
		System.out.println("Min value is: " + minValue);
		System.out.println("Max value is: " + maxValue);
	}

}
