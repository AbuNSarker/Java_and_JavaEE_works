/*------------------------------------------------------------------------
 * Problem 2: Java BigInteger
 * 
 * Task: 
 * 		In this problem, you have to add and multiply huge numbers! These numbers are so big that you 
 * 		can't contain them in any ordinary data types like a long integer.
 * 		Use the power of Java's BigInteger class and solve this problem.
 * 
 * Input Format: There will be two lines containing two numbers, a and b.
 * 		
 * Constraints:  a and b are non-negative integers and can have maximum 200 digits.
 * 
 * Output Format: Output two lines. The first line should contain a+b, and the second line should contain axb. 
 * 		Don't print any leading zeros.
 * 
 * Sample Input: 
 * 		1234
 * 		20
 * 
 * Sample Output: 
 * 		1254
 *		24680
 * 
 * Source: https://www.hackerrank.com/challenges/java-biginteger/problem
 * ------------------------------------------------------------------------
 */

import java.math.BigInteger;
import java.util.Scanner;

public class P3_BigInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			// System.out.print("Enter two non-negative numbers:\n ");
			BigInteger a = sc.nextBigInteger();
			BigInteger b = sc.nextBigInteger();
			System.out.println(a.add(b));
			System.out.println(a.multiply(b));
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			System.exit(1);
		}
		sc.close();
	}
}
