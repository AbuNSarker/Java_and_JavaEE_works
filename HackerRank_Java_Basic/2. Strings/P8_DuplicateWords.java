/*------------------------------------------------------------------------
 * Problem 8: Java Regex 2 - Duplicate Words
 * 
 * Task: 
 * 		To solve this challenge, complete the following three lines:
 *		1. Write a RegEx that will match any repeated word.
 *		2. Complete the second compile argument so that the compiled RegEx is case-insensitive.
 *		3. Write the two necessary arguments for replaceAll such that each repeated word is replaced with the very first instance the word found in the sentence. It must be the exact first occurrence of the word, as the expected output is case-sensitive.
 * 
 * Input Format: 
 * 		The first line contains an integer, , denoting the number of sentences.
 *      Each of the  subsequent lines contains a single sentence consisting of English alphabetic letters and whitespace characters.
 * 
 * Constraints: 
 * 
 * Output Format:
 *		Stub code in the editor prints the sentence modified by the replaceAll line to stdout. The modified string must be a 
 *      modified version of the initial sentence where all repeat occurrences of each word are removed.
 * 
 * Source: https://www.hackerrank.com/challenges/duplicate-word/problem
 * ------------------------------------------------------------------------
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P8_DuplicateWords {

	public static void main(String[] args) {

		// String regex = "/* Write a RegEx matching repeated words here. */";
		String pattern = "\\b(\\w+)(\\b\\W+\\b\\1\\b)*";
		Pattern p = Pattern.compile(pattern,
				Pattern.MULTILINE + Pattern.CASE_INSENSITIVE); /* Insert the correct Pattern flag here. */

		Scanner in = new Scanner(System.in);
		int numSentences = Integer.parseInt(in.nextLine());

		while (numSentences > 0) {
			String input = in.nextLine();

			Matcher m = p.matcher(input);
			boolean findMatch = true;
			// Check for subsequences of input that match the compiled pattern
			while (m.find()) {
				input = input.replaceAll(m.group(), m.group(1));/// * The regex to replace */, /* The replacement. */;
				findMatch = false;
			}

			// Prints the modified sentence.
			System.out.println(input);
			numSentences = numSentences - 1;
		}

		in.close();
	}
}