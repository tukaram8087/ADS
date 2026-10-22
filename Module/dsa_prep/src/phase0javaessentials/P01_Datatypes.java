package phase0javaessentials;

public class P01_Datatypes {
	
	public static void main(String[] args) {
		int a = Integer.MAX_VALUE; //2147483647
		System.out.println(a);
		byte b = 127; //range -> -128 to 127
		b++;
		System.out.println(b);
		long big = 100_000_000_000L * 5;
		System.out.println(big);
		System.out.println(7.0 / 2);
		System.out.println(-7 % 2); 
		System.out.println(7 % -2);
		String c = "A";
		System.out.println(c + '0');
		char c2 = 'A';
		System.out.println(c2 + '0');
		
		
	}
}
