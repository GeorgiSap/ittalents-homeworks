package homework4;

public class Zadacha4 {

	public static void main(String[] args) {
		
		int [][] array2d = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		int [][] newArray2d = new int[array2d.length][array2d[0].length];
		for (int row = 0; row < array2d.length; row++) {
			for (int col = 0; col < array2d[row].length; col++) {
				newArray2d[row][col] = array2d[array2d[row].length - 1 - col][row];
			}
		}
		for (int row = 0; row < newArray2d.length; row++) {
			for (int col = 0; col < newArray2d[row].length; col++) {
				System.out.print(newArray2d[row][col] + " ");
			}
			System.out.println();
		}
		
	}
}
