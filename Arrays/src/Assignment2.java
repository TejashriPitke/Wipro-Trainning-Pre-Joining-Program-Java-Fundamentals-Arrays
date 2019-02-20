import java.util.Arrays;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {78,62,563,674,97655,6};
		Arrays.sort(arr);
		int min=arr[0];
		int max=arr[arr.length-1];
		System.out.println("Min in array is = " + min + " Max in array is = " + max);

	}

}
