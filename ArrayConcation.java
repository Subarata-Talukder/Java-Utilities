import java.util.Arrays;

// Merge two arrays into a single array
// @Author Subarata Chandra Talukder
public class ArrayConcation {

	public static <T> T[] concateArray(T[] arrayT1, T[] arrayT2) {
		T[] newArray = Arrays.copyOf(arrayT1, arrayT1.length + arrayT2.length);
		System.arraycopy(arrayT2, 0, newArray, arrayT1.length, arrayT2.length);
		return newArray;
	}
}
