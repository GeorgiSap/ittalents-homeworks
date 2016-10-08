package homework4;

public class Zadacha7 {

	public static void main(String[] args) {
		int[][] array2d = { 
				{ 11, 12, 13, 14, 15, 16 }, 
				{ 21, 22, 23, 24, 25, 26 }, 
				{ 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46 }, 
				{ 51, 52, 53, 54, 55, 56 }, 
				{ 61, 62, 63, 64, 65, 66 } 
				};
		int row = 0;
		int col = 0;
		int sumRow = 0;
		int sumRows = 0;
		for (int index = 0; index < array2d.length * array2d[0].length; index++) {
			if ((row + col) % 2 == 0) {
				sumRow += array2d[row][col];
				System.out.print(array2d[row][col] + " ");
			}
			col++;
			if (col == 6) {
				System.out.print("Suma na elementite na reda " + sumRow);
				System.out.println();
				sumRows += sumRow;
				sumRow = 0;
				row++;
				col = 0;
			}
		}
		System.out.println("Suma na elementite: " + sumRows);
	}

}
