/*------------------------------------------------------------------------
 * Problem 2: Java Stdin and Stdout 
 * 
 * Task: In this challenge, you must read  integers from stdin and then print them to stdout. 
 * Each integer must be printed on a new line. To make the problem a little easier, a 
 * portion of the code is provided for you in the editor below.
 * 
 * https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem 
 * ------------------------------------------------------------------------
 */
import java.util.*;

public class P02_StdinAndStdout_I {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        // Complete this line
        // Complete this line
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();

        System.out.println(a);
        // Complete this line
        // Complete this line
        System.out.println(b);
        System.out.println(c);
    }
}