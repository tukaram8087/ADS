package collections.searching;

public class BinarySearch {
    boolean findUsingBinarySearch(int[] arr, int element) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (arr[mid] == element) {
                return true;
            }
            if (arr[mid] < element) {
                start = mid + 1;       
            } else {
                end = mid - 1;        
            }
        }
        return false;
    }

    public static void main(String[] args) {
        BinarySearch Bs = new BinarySearch();
        int[] arr = {2, 3, 4, 5, 6, 7};
        
        if (Bs.findUsingBinarySearch(arr, 5)) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
    }
}
