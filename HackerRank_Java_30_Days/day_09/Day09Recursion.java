package day_09;

//https://www.hackerrank.com/challenges/30-recursion/problem

	import java.io.*;

	class Result {

	    /*
	     * Complete the 'factorial' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts INTEGER n as parameter.
	     */

	    public static int factorial(int n) {
	    // Write your code here
	    	 return (n == 1) ? 1 : n * factorial(n - 1);
	    }

	}

	public class Day09Recursion {	    
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int n = Integer.parseInt(bufferedReader.readLine().trim());

	        int result = Result.factorial(n);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	}

