
/*------------------------------------------------------------------------
 * Problem 3: Java Substring Comparisons
 * 
 * Source: https://www.hackerrank.com/challenges/java-string-compare/problem
 * ------------------------------------------------------------------------
 */
import java.util.Scanner;

public class P3_SubstringComparisons {

	public static void main(String[] args) {
		/* Input section */
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int k = scan.nextInt();
		scan.close();

		/* Find smallest and largest strings and initialize them */
		String smallest = str.substring(0, k);
		String largest = str.substring(0, k);

		for (int i = 0; i <= str.length() - k; i++) {
			String substr = str.substring(i, i + k);
			if (smallest.compareTo(substr) > 0) {
				smallest = substr;
			}
			if (largest.compareTo(substr) < 0) {
				largest = substr;
			}
		}

		/* Outputs */
		System.out.println(smallest);
		System.out.println(largest);
	}
}