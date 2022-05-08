/*------------------------------------------------------------------------
 * Problem 10: Java Static Initializer Block
 * 
 * Task: 
 * 		Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.
 * 
 * Input Format: 
 * 		There are two lines of input. The first line contains : the breadth of the parallelogram. 
 * 		The next line contains : the height of the parallelogram.
 * 
 * Constraints: -100<= B <= 100,  -100< H <= 100
 * 
 * Output Format:
 *		If both values are greater than zero, then the main method must output the area of the 
 *		parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes
 * 
 * Source: https://www.hackerrank.com/challenges/java-static-initializer-block/problem
 * ------------------------------------------------------------------------
 */

//import java.io.*;
import java.util.*;

public class P10_StaticInitializerBlock {
	  static int B, H;
	  static boolean flag= true;
	  
	  static{
		  Scanner scan = new Scanner(System.in);
		  B = scan.nextInt();
		  H = scan.nextInt();
		  scan.close();
		  
		    try{
		        if(B <= 0 || H <= 0){
		            flag = false;
		            throw new Exception("Breadth and height must be positive");
		        }
		    }catch(Exception e){
		        System.out.println(e);
		    }

		}
	  public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		  if(flag){
				int area = B*H;
				System.out.println(area);
			}
	  }
}

