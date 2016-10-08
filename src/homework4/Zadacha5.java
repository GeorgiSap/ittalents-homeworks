package homework4;

public class Zadacha5 {

	public static void main(String[] args) {
		
		int [][] array2d = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		
		int maxSumRow = Integer.MIN_VALUE;
		int maxSumCol = Integer.MIN_VALUE;
		for (int index1 = 0; index1 < array2d.length; index1++) {
			int sumRow = 0;
			int sumCol = 0;
			for (int index2 = 0; index2 < array2d[index1].length; index2++) {
				sumRow += array2d[index1][index2];
				sumCol += array2d[index2][index1];
			}
			if (sumRow > maxSumRow) {
				maxSumRow = sumRow;
			}
			if (sumCol > maxSumCol) {
				maxSumCol = sumCol;
			}
		}
		System.out.println("Nai-goliama suma po redove: " + maxSumRow);
		System.out.println("Nai-goliama suma po koloni: " + maxSumCol);
		
		if (maxSumRow > maxSumCol) {
			System.out.println("Maks. suma po redove e > ot maks. suma po koloni.");
		}
		else {
			if (maxSumRow == maxSumCol) {
				System.out.println("Maks. suma po redove e = na maks. suma po koloni.");
			}
			else {
				System.out.println("Maks. suma po redove e < ot maks. suma po koloni.");
			}
		}
		
	}

}
