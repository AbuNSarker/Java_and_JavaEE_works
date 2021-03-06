package day_17;

// https://www.hackerrank.com/challenges/30-more-exceptions/

import java.util.Scanner;

//Write your code here
class Calculator {
    public int power(int n, int p) {
        int result = 1;
        if (n < 0 || p < 0) {
            throw new IllegalArgumentException("n and p should be non-negative");
        } else {
            while (p != 0) {
                result *= n;
                --p;
            }
            return result;
        }
    }        
}


public class Day17MoreExceptions {

	public static void main(String[] args) {
	    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
