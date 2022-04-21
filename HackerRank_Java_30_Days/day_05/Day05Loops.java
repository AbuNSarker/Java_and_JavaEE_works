package day_05;

//https://www.hackerrank.com/challenges/30-class-vs-instance/problem

import java.io.*;


public class Day05Loops {
  public static void main(String[] args) throws IOException {
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

      int n = Integer.parseInt(bufferedReader.readLine().trim());
      if (2 <= n && n <= 20) {
          int i;
          for (i = 1; i <= 10; i++) {
              System.out.println(n + " x " + i + " = " + n * i);
          }
      }
      
      bufferedReader.close();
  }
}
