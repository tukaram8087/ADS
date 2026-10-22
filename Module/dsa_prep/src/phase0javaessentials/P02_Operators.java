package phase0javaessentials;

public class P02_Operators {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 5;
		System.out.println(i++ + " " + i);
		int j = 5;
		System.out.println(++j + " " + j);
		
		int[] arr = {10, 20, 30};
		int k = 0;
		System.out.println(arr[k++]);
		System.out.println(arr[k++]);
		
		String s = null;
		if(s != null && s.length() > 0) {
			System.out.println("not reached");
		}else System.out.println("safe");
		
		int a = 5, b = 10;
		int max = (a > b) ? a : b;
		System.out.println(max);
		System.out.println(5 & 3);
		System.out.println(5 | 3); // 101 or 011 
		System.out.println(5 ^ 3);
		System.out.println(~5);
		System.out.println(5 << 1);
		System.out.println(5 >> 1);
		
		System.out.print(-8 >>> 1);
		
		
	}

}
