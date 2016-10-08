package homework3;
import java.util.Arrays;

public class Zadacha18 {

	public static void main(String[] args) {
		
		int[] a = {18,19,32,1,3,4,5,6,7,8};
		int[] b = {1,2,3,4,5,16,17,18,27,11};
		int length = a.length;
		if (a.length != b.length) {
			length = a.length < b.length ? a.length : b.length;
		}
		int[] c = new int[length];
		for (int index = 0; index < length; index++) {
			c[index] = a[index] > b[index] ? a[index] : b[index];
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
	}

}
