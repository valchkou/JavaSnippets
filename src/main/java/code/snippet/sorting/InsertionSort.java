package code.snippet.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {11, 2, 4, 5, 3, 1, 7, 6, 4, 9, -8, 10 };
		sort(arr);
		print(arr);
	}

	static void sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			 // find the position where to insert
			int j = i; 
			while (j > 0 && arr[j - 1] > arr[i]) {
				--j; 
			}
			// swap
			if (j<i) {
				int temp = arr[i];
				System.arraycopy(arr, j, arr, j+1, i-j);
				arr[j] = temp; // insert marked item
			}	
		} 
	}

	static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
