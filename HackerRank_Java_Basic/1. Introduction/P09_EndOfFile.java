/*------------------------------------------------------------------------
 * Problem 9: Java End-of-file 
 * 
 * Task: 
 * 		The challenge here is to read  lines of input until you reach EOF, then number and print all  lines of content.
 * 		Hint: Java's Scanner.hasNext() method is helpful for this problem.
 * 
 * Input Format: 
 * 		Read some unknown n  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.
 * 
 * Constraints: 
 * 
 * Output Format:
 *		For each line, print the line number, followed by a single space, and then the line content received as input.		
 * 
 * Source: https://www.hackerrank.com/challenges/java-end-of-file/problem
 * ------------------------------------------------------------------------
 */
//import java.io.*;
import java.util.*;

public class P09_EndOfFile {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		   Scanner scan = new Scanner(System.in);
		   // Approach-1: Using For loop 
		   for(int i = 1; scan.hasNext()== true; i++){
		       System.out.println(i + " " + scan.nextLine());
		   }
		   
//		  // Approach-2: Using While loop System
//		   int i = 1;
//		   while(scan.hasNext()){
//		       System.out.println(i + " " + scan.nextLine());
//		       i++;
//		   }
		   scan.close();
	}
}
