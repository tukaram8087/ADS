package collections.searching;

public class LinearSearch {
	boolean  findUsingLinearSearch(int[] arr, int element) {
		for(int i=0;i<arr.length;i++) 
		if(arr[i]== element) {
			return true;
		}
		return false;
		
	}

	public static void main(String[] args) {
	
		LinearSearch linearSearch = new LinearSearch();
		int[] arr = {2,3,4,5,6,7};
		
		if(linearSearch.findUsingLinearSearch(arr, 9)) {
			System.out.println("Element found");
		}else {
			System.out.println("Not found!!");
		}
		
		

	}

}
