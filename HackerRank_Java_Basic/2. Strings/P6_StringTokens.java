
/*------------------------------------------------------------------------
 * Problem 6: Java String Tokens
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

public class P6_StringTokens {

//	public static boolean isMatches(String str) {
//		String pattern = "([A-Za-z !,?._'@]+)*";
//		return str.matches(pattern);
//	}

	private static String removeLeadingNonLetters(String str) {
		int i;
		for (i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i))) {
				break;
			}
		}
		return str.substring(i);
	}

	public static void main(String[] args) {
		/* Input section */
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		scan.close();

//		if (isMatches(s)) {	
//	     	System.out.println("Input string does matches with the pattern");
//		} else {
//			System.out.println("Input string does not matches with the pattern");
//		}

		s = removeLeadingNonLetters(s);

		/* special cases checking */
		if (s.length() == 0) {
			System.out.println(0);
			return;
		}

		/* all non-alphabetic characters splitting */
		String[] words = s.split("[^a-zA-Z]+");

		/* output section */
		System.out.println(words.length);
		for (String str : words) { // "for-each" loop, which is used exclusively to loop through elements in an
									// array
			System.out.println(str);
		}

	}
}
