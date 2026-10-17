package collections.sorting;

public class Sorting {

	// Bubble sort
	public static void decreasingBubbleSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr.length - i - 1; j++) {

				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
		}
	}

	//insertion sort
	public static void decreasinginsertionSort(int[] arr) {

		int sortedSize = 1;
		while(sortedSize < arr.length) {
			int insertElement = arr[sortedSize];
			int i = sortedSize -1;
			while(i>=0) {
				if(arr[i] < insertElement) {
					arr[i+1] = arr[i];
					
				}else {
					break;
				}
				i = i-1;
			}
			arr[i+1] = insertElement;
			sortedSize = sortedSize+1;
		}

	}
	
	//quickSort
	public static void quickSort(int[] arr, int low, int high) {
		if(low<high) {
			int pi = partition(arr,low,high);
			quickSort(arr, low, pi-1);
			quickSort(arr, pi+1,high);
		}
	}
	
	static int partition(int arr[], int low, int high) {
		 int pivot = arr[high];
		    int i = (low - 1);
		    for (int j = low; j < high; j++) {
		        if (arr[j] < pivot) {
		            i++;
		            int temp = arr[i];
		            arr[i] = arr[j];
		            arr[j] = temp;
		        }
		    }
		    int temp = arr[i + 1];
		    arr[i + 1] = arr[high];
		    arr[high] = temp;
		    return i + 1;
	}

	// return is sorted or not
	public static boolean isArraySorted(int[] arr) {
      for (int i=0;i<arr.length-1;i++) {
    	  if(arr[i]>arr[i+1])
    			  return false;
      }
		return true;
	}

}
