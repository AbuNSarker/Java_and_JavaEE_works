	/*------------------------------------------------------------------------
	 * Problem 3: Java If Else 
	 * 
	 * Task: Given an integer, n, perform the following conditional actions:
	 *	If  n is odd, print Weird
	 *	If  n is even and in the inclusive range of 2 to 5, print Not Weird
	 *	If  n is even and in the inclusive range of 6 to 20, print Weird
	 *	If  n is even and greater than 20, print Not Weird
	 *	Complete the stub code provided in your editor to print whether or not n is weird.
	 * 
	 * https://www.hackerrank.com/challenges/java-if-else/problem
	 * ------------------------------------------------------------------------
	 */
	import java.util.*;

	public class P03_IfElse {
	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int N = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        if(N>100) {
	        	System.out.println( "Enter a number in the inclusive range of 1 to 100");
	        	N = scanner.nextInt();
	         }
	        scanner.close();
	       
	        String result = "";
	        
	        if(N%2 == 1){
	        	result = "Weird";
	          }
	          else if (N >= 2 && N <= 5){
	        	  result = "Not Weird";      
	          }
	          else if (N >= 6 && N <= 20){
	        	  result = "Weird";      
	          }
	          else{
	        	  result = "Not Weird"; 
	          }
	        System.out.println(result);
	    }
	}


