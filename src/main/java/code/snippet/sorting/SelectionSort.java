package code.snippet.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {2,4,5,3,1,7,6,4,9,-8};
		sort(arr);
		print(arr);
	}
	
	static void sort(int[] arr) {
		for (int i = 0; i<arr.length; i++) {
			int min = i;
			for (int j=i+1; j<arr.length; j++) {
				if (arr[min]>arr[j]) {
					min = j;
				}
			}
			// swap
			if (min != i) {
				int s = arr[i];
				arr[i] = arr[min];
				arr[min] = s;
			
			}
		}		
	}
	
	static void print (int[] arr) {
		for (int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}		
	}

}
