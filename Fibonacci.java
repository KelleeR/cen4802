package assignment2;

public class Fibonacci {
	/**
	 * This method returns the number in the fibonacci sequence
	 * @param n The position on the number in the sequence
	 * @return the number in the specified position
	 * @author KMRoberts
	 */
	
	static int fib(int n)
    {
    if (n <= 1)
       return n;
    return fib(n-1) + fib(n-2);
    }

	public static void main(String[] args) {
		
		int numTen = 10;
		System.out.println("The "+numTen+"th term in the fibonacci sequence is: "+fib(numTen));

	}

}
