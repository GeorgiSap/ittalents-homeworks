package homework4;

public class Zadacha6 {

	public static void main(String[] args) {
		int [][] array2d = {
				{11,12,13,14,15,16},
				{21,22,23,24,25,26},
				{31,32,33,34,35,36},
				{41,42,43,44,45,46},
				{51,52,53,54,55,56},
				{61,62,63,64,65,66}
		};
		int sumEvenRows = 0;
		for (int row = 1; row < array2d.length; row+=2) {
			int sumRow = 0;
			for (int col = 0; col < array2d[row].length; col++) {
					sumRow += array2d[row][col];
					System.out.print(array2d[row][col] + " ");
			}
			System.out.print("suma " + sumRow);
			System.out.println();
			sumEvenRows += sumRow;
		}
		System.out.println("Suma na elementite " + sumEvenRows);

	}

}
