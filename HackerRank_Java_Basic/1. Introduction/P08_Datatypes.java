/*------------------------------------------------------------------------
 * Problem 8: Java Data types 
 * 
 * Task: 
 * 		Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. 
 * 		For this exercise, we'll work with the primitives used to hold integer values (byte, short, int, and long)
 * 			-	A byte is an 8-bit signed integer.
 *			-	A short is a 16-bit signed integer.
 *			-	An int is a 32-bit signed integer.
 *			-	A long is a 64-bit signed integer.
 * 		Given an input integer, you must determine which primitive data types are capable of properly storing that input.
 *
 * Input Format: 
 * 		The first line contains an integer, T, denoting the number of test cases.
 * 		Each test case, T, is comprised of a single line with an integer,n, which can be arbitrarily large or small.
 * 
 * Constraints: 
 * 
 * Output Format:
 *		For each input variable n and appropriate primitive dataType, you must determine if the 
 *		given primitives are capable of storing it. If yes, then print 		
 * 
 * Source: https://www.hackerrank.com/challenges/java-datatypes/problem
 * ------------------------------------------------------------------------
 */

import java.util.*;
//import java.io.*;

public class P08_Datatypes {
	public static void main(String []argh)
    {
        Scanner scan = new Scanner(System.in);
        int t=scan.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=scan.nextLong();
                System.out.println(x+" can be fitted in:");
//             // Approach-1 =========================================
//	                if(x>=-128 && x<=127) System.out.println("* byte");
//	                //Complete the code
//	                if(x >= -Math.pow(2, 15) && x <= Math.pow(2, 15) - 1)
//	                    System.out.println("* short");
//	                if(x >= -Math.pow(2, 31) && x <= Math.pow(2, 31) - 1)
//	                    System.out.println("* int");
//	                if(x >= -Math.pow(2, 63) && x <= Math.pow(2, 63) - 1)
//	                    System.out.println("* long");  
                
//                // Alternative Approach =============================
	                if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE)
	                    System.out.println("* byte");
	                if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE)
	                    System.out.println("* short");
	                if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)
	                    System.out.println("* int");
	                if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE)
	                    System.out.println("* long");
            }
            
            catch(Exception e)
            {
                System.out.println(scan.next()+" can't be fitted anywhere.");
            }
           // System.out.printf("%n");
        }
        scan.close();
    }
}


