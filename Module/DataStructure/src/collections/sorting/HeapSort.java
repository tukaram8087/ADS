package collections.sorting;

public class HeapSort {
	
	public void HeapSort(int arr[]) {
		int n = arr.length;
		for (int i = n / 2 - 1; i >= 0; i--) { //formaxHeap
		 heapify(arr, n, i);
		}
		 //extract element
	        for (int i = n - 1; i > 0; i--) {
	            int temp = arr[0];
	            arr[0] = arr[i];
	            arr[i] = temp;
	            heapify(arr, i, 0);
	        }
          

	}
	public void heapify(int arr[], int n, int i) {

		int parentNode = i;//root
		int leftNode = 2 *i+1;
		int rightNode = 2 *i+2;
		// If left child is larger than root
		if (leftNode < n && arr[leftNode] < arr[parentNode]) {
			parentNode = leftNode;
		}
		// If right child is large
		if (rightNode < n && arr[rightNode] < arr[parentNode]) {
			parentNode = rightNode;
		}
		// If largest is not root, swap and continue heap
		if (parentNode != i) {
	        int swap = arr[i];
	        arr[i] = arr[parentNode];
	        arr[parentNode] = swap;
	        heapify(arr, n, parentNode);
	
		
		}

	}
}
