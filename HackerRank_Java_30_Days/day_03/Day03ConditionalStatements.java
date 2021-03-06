package day_03;

//https://www.hackerrank.com/challenges/30-conditional-statements/

import java.io.*;


public class Day03ConditionalStatements {
	 public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        int N = Integer.parseInt(bufferedReader.readLine().trim());
	        if (1 <= N && N <= 100) {
	            if (N % 2 != 0) {
	                System.out.println("Weird");
	            } else if (N % 2 == 0 && (2 <= N && N <= 5)) {
	                System.out.println("Not Weird");
	            } else if (N % 2 == 0 && (6 <= N && N <= 20)) {
	                System.out.println("Weird");
	            } else if (N % 2 == 0 && N > 20) {
	                System.out.println("Not Weird");
	            }
	        }
	        bufferedReader.close();
	    }
	}
