import java.util.Arrays;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {56,56,5678,67,567,3,234,678,8098};
		Arrays.sort(arr);
		int v = arr[arr.length-1];
		int e = arr[arr.length-2];
		int n = arr[0];
		int k = arr[1];
		System.out.println("Largest 2 Numbers in Array are " + e + " " + v);
		System.out.println("Smallest 2 Numbers in Array are " + n + " " + k);

	}

}
