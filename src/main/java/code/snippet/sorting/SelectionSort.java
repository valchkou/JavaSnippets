package code.snippet.sorting;

/**
 * Efficiency: O(n^2)
 * Worth case comparisons: N*(N-1)/2
 * Worth case swaps: N-1
 * In Selection sort we still iterate outer and inner loops to  find the smallest element.
 * But in contrast to Bubble we don't swap immediately but memorize position of that element.
 * Than do 1 swap per outer loop. That's makes number of swaps N-1.
 * Though efficiency is O(n^2) this sort is more efficient than Bubble Sort due to less swaps.
 * @author Eugene Valchkou
 */
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
			
			// one swap per outer iteration
			if (min != i) {
				swap(i, min, arr);
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
