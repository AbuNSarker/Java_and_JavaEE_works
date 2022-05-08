
/*------------------------------------------------------------------------
 * Problem 4: Java Anagrams
 * 
 * Task: 
 * 		Two strings, a and b, are called anagrams if they contain all the same characters in the 
 * 		same frequencies. For this challenge, the test is not case-sensitive. For example, the 
 * 		anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.
 * 
 * Source: https://www.hackerrank.com/challenges/java-anagrams/problem
 * ------------------------------------------------------------------------
 */
import java.util.Arrays;
import java.util.Scanner;

public class P5_Anagrams {

	/* Method: sort a string alphabetically */
	public static String sortString(String inputString) {
		/* convert string to char array */
		char tempArray[] = inputString.toCharArray();

		/* sort the tempArray */
		Arrays.sort(tempArray);

		/* new sorted string */
		return new String(tempArray);
	}

	/* Method: anagram testing */
	static boolean isAnagram(String a, String b) {
		// Complete the function

		/* convert to lower-case strings then sort the strings alphabetically */
		a = a.toLowerCase();
		b = b.toLowerCase();

		String sortedA = sortString(a);
		String sortedB = sortString(b);

		/* convert string to char array */
		char charArray1[] = sortedA.toCharArray();
		char charArray2[] = sortedB.toCharArray();

		boolean matches = true;
		if (a.length() == b.length()) {
			/* check each elements of the charArrays are same */
			for (int i = 0; i < a.length(); i++) {
				if (charArray1[i] == charArray2[i])
					matches = true;
				else {
					matches = false;
					break;
				}
			}
		} else {
			matches = false;
		}

		return matches;
	}

	public static void main(String[] args) {
		/* Input section */
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String b = scan.nextLine();
		scan.close();

		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");

	}
}
