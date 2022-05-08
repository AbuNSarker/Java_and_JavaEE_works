/*------------------------------------------------------------------------
 * Problem 2: Java Substring
 * 
 * Task: 
 * 		Given a string, s, and two indices, start and end, print a substring consisting of all 
 * 		characters in the inclusive range from start to end-1. You'll find the String class' 
 * 		substring method helpful in completing this challenge.
 * 
 * Input Format: 
 * 		The first line contains a single string denoting s.
 * 		The second line contains two space-separated integers denoting the respective values of start and end.
 * 
 * Constraints: 1<= |s| <=100;  0<+start< end <=n; String  consists of English alphabetic letters (i.e., [a-z A-Z]) only.
 * 
 * Output Format:
 *		Print the substring in the inclusive range from start to end-1.
 * 
 * Source: https://www.hackerrank.com/challenges/java-substring/problem
 * ------------------------------------------------------------------------
 */

//import java.io.*;
import java.util.Scanner;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;

public class P2_Substring {

	public static void main(String[] args) {

		/* input section */
		Scanner in = new Scanner(System.in);
		String S = in.next();
		int start = in.nextInt();
		int end = in.nextInt();
		in.close();

		/* finding out the substring of this string using the substring() method */
		System.out.println(S.substring(start, end));

	}
}
