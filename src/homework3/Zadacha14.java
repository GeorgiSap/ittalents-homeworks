package homework3;
import java.util.Arrays;

public class Zadacha14 {

	public static void main(String[] args) {
		
		float[] a = {7.1f,8.5f,0.2f,3.7f,0.99f,1.4f,-3.5f,-110f,212f,341f,1.2f};
		int newArrayLength = 0;
		for (int index = 0; index < a.length; index++) {
			if (a[index] >= -2.99 && a[index] <= 2.99) {
				newArrayLength++;
			}
		}
		float[] newArray = new float[newArrayLength];
		int newArrayIndex = 0;
		for (int index = 0; index < a.length; index++) {
			if (a[index] >= -2.99 && a[index] <= 2.99) {
				newArray[newArrayIndex] = a[index];
				newArrayIndex++;
			}
		}
		System.out.println(Arrays.toString(newArray));
	}

}
