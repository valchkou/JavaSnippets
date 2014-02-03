package code.snippet.sorting;

/**
 * Efficiency: O(N*logN)
 * Merge Sort splits array by smaller pieces, sorts those pieces and merges them.
 * 
 * @author Eugene Valchkou
 */
public class MergeSort {

	static int compare = 0;
	static int swaps = 0;
	
	public static void main(String[] args) {
		int[] arr = {546,67,90,87,90,-67, 567, -45, 567, 98, 99, 200,10, 1, 3, 15, 4, -8, 20, 0, 2, 0, 25, -1, 21, 22, 23, 3,43,5,45,23,76,83,45,32,56,43,12,34,76,34,56,87,55,33,2,5,6,8,6,55,4,3,44,7};
		sort(arr);
		print(arr);
		System.out.println("");
		System.out.println("size:"+arr.length);
		System.out.println("compares:"+compare);
		System.out.println("swaps:"+swaps);
	}
	
	static void sort(int[] arr) {
		mergeSort(arr, 0, arr.length-1);
	}
	
	/** 
	 * merges sorted parts. Compare 2 parts and swap elements in necessary
	 * part A: from start to mid inclusive
	 * part B: from mid+1 to end
	 */
	static void mergeSort(int[] arr, int start, int end) {
		// 1 element, nothing to compare with
		if (end-start<=0) return; 
		
		// 2 elements, compare and swap if necessary
		compare++;
		if (end-start==1 && arr[end] < arr[start]) {
			swap(arr, start, end);
			return;
		} 
		
		//This is the hart of the Merge Sort
		// 3 and more elements require sort then merge
		
		// step 1. sort recursively each part.
		int mid = (start+end)/2;
		mergeSort(arr, start, mid);
		mergeSort(arr, mid+1, end);
		
		// step 2. merge sorted parts 
		// compare 2 sorted pieces and swap elements if necessary 
		// piece 1: from start to mid
		// piece 2: from mid+1 to end
		int count = 0;
		int next = mid+1;
		while (start<=mid) {
			int from = next;
			compare++;
			while(next <= end && arr[start]>=arr[next]) {
				count++;
				next++;
			}
			
			if (count>0) {
				swapAndShift(arr, start, from, count);
				start = start+count;
				mid = mid+count;
				count = 0;
			}
			 
			if (next > end) {
				break;
			}
			start++;
		}
	}
	
	/**
	 * 
	 * @param insertTo position where elements will be copied to
	 * @param insertFrom starting position where elements will be copied from
	 * @param count number of elements to be copied
	 * @param arr
	 */
	static void swapAndShift(int[] arr, int insertTo, int startFrom, int count) {
		swaps++;
		int[] tmp = new int[count];
		// temporary save elements to be copied 
		System.arraycopy(arr, startFrom, tmp, 0, count);
		// shift elements in array to make space for copied elements
		System.arraycopy(arr, insertTo, arr, insertTo+count, startFrom-insertTo);
		// copy elements  
		System.arraycopy(tmp, 0, arr, insertTo, count);
	}

	static void swap(int[] arr, int i, int j) {
		swaps++;
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
