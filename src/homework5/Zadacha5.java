package homework5;
import java.util.Scanner;

public class Zadacha5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String word1 = sc.next();
		String word2 = sc.next();
		int equalSignIndex1 = -1;
		int equalSignIndex2 = -1;
		boolean equalSignExists = false;
		
		for (int index2 = 0; index2 < word2.length(); index2++) {
			for (int index1 = 0; index1 < word1.length(); index1++) {
				if (word1.charAt(index1) == word2.charAt(index2)) {
					equalSignIndex1 = index1;
					equalSignIndex2 = index2;
					equalSignExists = true;
					break;
				}
			}
			if (equalSignExists) {
				break;
			}
		}
		
		if (equalSignExists) {
			for (int index1 = 0; index1 < word1.length(); index1++) {
				for (int index2 = 0; index2 < word2.length(); index2++) {
					if (index1 == equalSignIndex1 || index2 == equalSignIndex2) {
						if (index2 == equalSignIndex2) {
							System.out.print(word1.charAt(index1));
						} else {
							if (index1 == equalSignIndex1) {
								System.out.print(word2.charAt(index2));
							}
						}
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		else {
			System.out.println("Niama obsht znak.");
		}
		
	}

}
