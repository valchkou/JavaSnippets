package code.snippet.algo;

public class PrimeNumber {
	
	public static void main(String[] args) {
		int n = (int)Math.round(Math.random()*1000); 
		System.out.println("is "+n+" prime ? "+ isPrime(n));
	}
	
	static boolean isPrime(int n) {
		if (n==2 || n==3 || n==5) return true;
	    
		//quick check if n is a multiple of 2,3,5
	    if (n%2==0 || n%5==0 || n%2==3) return false;
	    
	    //if not, then just check the odds
	    for(int i=7; i*i<=n; i+=2) {
	        if(n%i==0) return false;
	    }
	    return true;
	}

}
