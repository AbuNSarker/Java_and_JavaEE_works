/*------------------------------------------------------------------------
 * Problem 7: Pattern Syntax Checker
 * 
 * Task: 
 * 		Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, split the string 
 * 		into tokens. We define a token to be one or more consecutive English alphabetic letters. 
 *      Then, * print the number of tokens, followed by each token on a new line.
 *      
 *		Note: You may find the String.split method helpful in completing this challenge
 * 
 * Source: https://www.hackerrank.com/challenges/java-string-tokens/problem
 * ------------------------------------------------------------------------
 */

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class P7_PatternSyntaxChecker {

	public static void main(String[] args) {
		/* input number of cases */
		Scanner scan = new Scanner(System.in);
		int numberOfCases = scan.nextInt();
		scan.nextLine();

		/* input the cases and validate */
		while (numberOfCases-- > 0) {
			String pattern = scan.nextLine();
			try {
				Pattern.compile(pattern);
				System.out.println("Valid");
			} catch (PatternSyntaxException exception) {
				System.out.println("Invalid");
			}
		}
		scan.close();
	}
}
