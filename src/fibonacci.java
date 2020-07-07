
public class fibonacci {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++)
			System.out.println(fib2(i));
	}
	
	private static int fib(int n) {
		if (n == 0)
			return 0;
		
		/* Declare an array to store Fibonacci numbers. */
		int[] f = new int[n+1];
		f[0] = 0;
		f[1] = 1;
		
		/* Add the previous 2 numbers in the series and store it */
		for (int i = 2; i <= n; i++)
			f[i] = f[i-1] + f[i-2];
		
		return f[n];
	}
	
	//Fibonacci Series using Recursion 
	private static int fib2(int n) {
		if (n <= 1)
			return n;
		
		return fib2(n-1) + fib(n-2);
	}
}
