/*------------------------------------------------------------------------
 * Problem 5: Java Output Formatting 
 * 
 * Task: Java's System.out.printf function can be used to print formatted output. The purpose of 
 * this exercise is to test your understanding of formatting output using printf. 
 * 
 * Input Format:
 * Every line of input will contain a String followed by an integer.
 * Each String will have a maximum of 10 alphabetic characters, and each integer will be in the 
 * inclusive range from 0 to 999 .
 * 
 * Output Format
 * In each line of output there should be two columns:
 * The first column contains the String and is left justified using exactly 15 characters.
 * The second column contains the integer, expressed in exactly 3 digits; if the original input 
 * has less than three digits, you must pad your output's leading digits with zeroes. 
 * 
 * https://www.hackerrank.com/challenges/java-output-formatting/problem
 * ------------------------------------------------------------------------
 */
import java.util.Scanner;

public class P05_OutputFormatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.printf("%-15s%03d%n", s1, x);
            /*We use PrintStream methods to format the output:
              the "-" is used to left indent
              the "15" makes the String's minimum length it takes up be 15
              the "s" will be substituted by our String
              the 0 pads our integer with 0s on the left
              the 3 makes our integer be a minimum length of 3
              the "%n" which outputs a line break
            */
        }
        sc.close();
        System.out.println("================================");

}
}