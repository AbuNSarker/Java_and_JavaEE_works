package day_10;

//https://www.hackerrank.com/challenges/30-binary-numbers/

import java.io.*;
public class Day10BinaryNumbers {
	 public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        int n = Integer.parseInt(bufferedReader.readLine().trim());
	        int count = 0;
	        while (n != 0) {
	            n = (n & (n << 1));
	            count++;
	        }
	        System.out.println(count);
	        
	        bufferedReader.close();
	    }
	}


