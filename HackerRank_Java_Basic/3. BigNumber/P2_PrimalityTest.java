/*------------------------------------------------------------------------
 * Problem 2: Java Primality Test
 * 
 * Task: 
 * 		A prime number is a natural number greater than  whose only positive divisors are  and itself. 
 * 		For example, the first six prime numbers are 2, 3, 5, 7, 11, and 13.
 * 		Given a large integer, , use the Java BigInteger class' isProbablePrime method to determine and 
 * 		print whether it's prime or not prime.
 * 
 * Input Format: A single line containing an integer, n (the number to be checked).
 * 		
 * Constraints: n contains at most 100 digits.
 * 
 * Output Format: If  n is a prime number, print prime; otherwise, print not prime.
 * 
 * Sample Input: 13
 * 
 * Sample Output: prime
 * 
 * Source: https://www.hackerrank.com/challenges/java-primality-test/problem
 * ------------------------------------------------------------------------
 */

import java.math.BigInteger;
import java.util.Scanner;

public class P2_PrimalityTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger n = in.nextBigInteger();
		in.close();
		if (n.isProbablePrime(1)) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
	}
}

/* ---------Alternative ----- */
//public class P2_PrimalityTest {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String n = bufferedReader.readLine();
//        BigInteger biObj = new BigInteger(n);
//        System.out.println(biObj.isProbablePrime(10) ? "prime" : "not prime");
//        bufferedReader.close();
//    }
//}