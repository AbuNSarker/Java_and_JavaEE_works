package day_01;

//https://www.hackerrank.com/challenges/30-data-types/

import java.util.*;

public class Day01DataTypes {
	public static void main(String[] args) {
      /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      
      /* Declare second integer, double, and String variables. */

      /* Read and save an integer, double, and String to your variables. */
      // Note: If you have trouble reading the entire String, please go back and
      // review the Tutorial closely.

      /* Print the sum of both integer variables on a new line. */

      /* Print the sum of the double variables on a new line. */

      /*
       * Concatenate and print the String variables on a new line; the 's' variable
       * above should be printed first.
       */
      int i = 4;
      double d = 4.0;
      String s = "HackerRank ";

      Scanner scan = new Scanner(System.in);
      int i1;

      double d1;
      String s1;
      i1 = scan.nextInt();
      d1 = scan.nextDouble();
      scan.nextLine();
      s1 = scan.nextLine();

      System.out.println(i + i1);
      System.out.println(d + d1);
      System.out.println(s + s1);
      scan.close();
  }

}
