package assignment2;

public class Fibonacci {

	/**
	*The main method calls the ficonacci sequence
	*@param n is the position of the number
	*@return the number resulting from the sequence
	*@author KMRoberts
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
