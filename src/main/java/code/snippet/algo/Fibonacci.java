package code.snippet.algo;

public class Fibonacci {

	public static void main(String[] args) {
		int n = 10; // n-th number in fibonacci sequence
		
		int fib = iterational(n);
		System.out.println(n+"th iterational fib:"+fib);

		fib = recursive(n);
		System.out.println(n+"th recursive fib:"+fib);

		fib = scientific(n);
		System.out.println(n+"th scientific fib:"+fib);
		
	}
	
	static int iterational(int n) {
		if (n==0) return 0;
		if (n<3) return 1;
		
		int prev = 1; 
		int next = 1;
		int fib = 0;
		for (int i=3; i<=n; i++) {
			fib = prev + next;
			prev = next;
			next = fib;
		}
		return fib;
	}

	static int recursive(int n) {
		if (n==0) return 0;
		if (n<3) return 1;
		return recursive(n-1)+ recursive(n-2);
	}
	
	static int scientific(int n) {
		if (n==0) return 0;
		if (n<3) return 1;
		double root5 = Math.sqrt(5);
		double fib = 1/root5*( Math.pow((1+root5)/2, n) - Math.pow((1-root5)/2, n));
		return (int)Math.round(fib);
	}
	

}
