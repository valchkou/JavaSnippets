package code.snippet.sorting;

/**
 * Efficiency: O(n^2)
 * Worth case comparisons: N*(N-1)/2
 * Worth case swaps: N*(N-1)/2
 * @author Eugene Valchkou
 */
public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {2,4,5,3,1,7,6,4,9,-8};
		sort(arr);
		print(arr);
	}
	
	static void sort(int[] arr) {
		for (int i = 0; i<arr.length; i++) {
			for (int j=i+1; j<arr.length; j++) {
				if (arr[i]>arr[j]) {
					swap(i, j, arr);
				}
			}
		}		
	}
	
	static void swap(int i, int j, int[] arr) {
		int s = arr[i];
		arr[i] = arr[j];
		arr[j] = s;
	}
	
	static void print (int[] arr) {
		for (int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}		
	}
}
