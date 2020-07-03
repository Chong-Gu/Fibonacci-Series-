
public class fibonacci {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++)
			System.out.println(fib(i));
	}
	
	private static int fib(int n) {
		if (n == 0)
			return 0;
		
		int[] a = new int[n+1];
		a[0] = 0;
		a[1] = 1;
		
		for (int i = 2; i <= n; i++)
			a[i] = a[i-1] + a[i-2];
		
		return a[n];
	}
}
