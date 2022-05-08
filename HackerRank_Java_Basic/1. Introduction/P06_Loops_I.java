/*------------------------------------------------------------------------
 * Problem 6: Java Loops I 
 * 
 * Task: 
 * 		Given an integer, N, print its first 10 multiples. Each multiple Nxi  (where 1<=i<=10 ) 
 * 		should be printed on a new line in the form: N x i = result.
 * 
 * Input Format: A single integer, N.
 * 
 * Constraints: 2<= N <=20
 * 
 * Output Format:
 * 		Print  10 lines of output; each line i (where 1<= i <= 10) contains the result of N x i  in 
 * 		the form: N x i = result.
 * 
 * Source: https://www.hackerrank.com/challenges/java-loops-i/problem
 * ------------------------------------------------------------------------
 */
import java.io.*;

public class P06_Loops_I {

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        //System.out.println("N =: " + N);
        
        for(int i=1;i<=10;i++)
        {
            System.out.printf("%d x %d = %d%n", N, i, N*i);

        }
    }
}
