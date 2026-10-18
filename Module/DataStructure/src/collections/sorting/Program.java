package collections.sorting;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
		
		int arr[]= {2,3,6,4,1,7,22,99,35}; 
		
//		Sorting.decreasinginsertionSort(arr);
//		System.out.println(Arrays.toString(arr));
//		
//		Sorting.quickSort(arr, 0, arr.length-1);
//		System.out.println(Arrays.toString(arr));
//		
//		Sorting.decreasingBubbleSort(arr);
//		
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Sorting.isArraySorted(arr));
//		
//		Sorting.quickSort(arr, 0, arr.length-1);
//		System.out.println(Arrays.toString(arr));
//		
//		
		
    

        HeapSort sorter = new HeapSort();
        sorter.HeapSort(arr);

        System.out.print("Sorted Array:"+Arrays.toString(arr));
        

	}

}
