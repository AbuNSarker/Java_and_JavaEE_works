/*------------------------------------------------------------------------
 * Problem 11: Java Int to String
 * 
 * Task: 
 * 		You are given an integer n, you have to convert it into a string.
 * 
 * Input Format: 
 * 		100
 * 
 * Constraints: 
 * 
 * Output Format:
 *		Good job
 * 
 * Source: https://www.hackerrank.com/challenges/java-int-to-string/problem
 * ------------------------------------------------------------------------
 */

//import java.io.*;
import java.util.Scanner;

public class P11_IntToString {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			scan.close();

			String s;
			// Approach-1:
			// s = Integer.toString(n);

			// Approach-2:
			s = String.valueOf(n);

			if (n == Integer.parseInt(s)) {
				System.out.println("Good job");
			} else {
				System.out.println("Wrong answer.");
			}

		} catch (Exception e) {
			System.out.println("Something went wrong.");
		}

	}
}
