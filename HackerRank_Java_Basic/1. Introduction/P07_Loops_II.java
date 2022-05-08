/*------------------------------------------------------------------------
 * Problem 7: Java Loops II 
 * 
 * Task: 
 * 		We use the integers a, b, and n  to create the following series:
 * 		(a + 2^0.b), (a+2^0.b + 2^1.b),..., (a+2^0.b + 2^1.b+ ... +2^(n-1).b),
 *		You are given q queries in the form of a, b, and n. For each query, print the series 
 *		corresponding to the given a, b, and n values as a single line of  space-separated integers..
 * 
 * Input Format: The first line contains an integer, q, denoting the number of queries.
 * 		Each line i of the q subsequent lines contains three space-separated integers describing the 
 * 		respective a_i, b_i, and n_i values for that query.
 * 
 * Constraints: 0<= q <=500; 0<= a,b <=50; 1<= n <=15; 
 * 
 * Output Format:
 * 		For each query, print the corresponding series on a new line. Each series must be printed 
 * 		in order as a single line of  space-separated integers.
 * 
 * Source: https://www.hackerrank.com/challenges/java-loops/problem
 * ------------------------------------------------------------------------
 */
import java.util.*;
import java.lang.Math;


public class P07_Loops_II {
		public static void main(String []argh){
	        Scanner in = new Scanner(System.in);
	        int q=in.nextInt();
	        for(int i=0;i<q;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            
	           // System.out.printf("q = %d, a = %d, b = %d, n = %d%n", q, a, b, n);
	            
	            int s = a;
	            for(int j=0;j<n;j++){
		            s = s + (int) (Math.pow(2,j)*b);
	                System.out.printf("%d ", s);
	            //  System.out.printf("s%d = %d ", j, s);
	            }
	            System.out.printf("%n");
	            }
	        in.close();  
	 }
}
	
