package day_16;

// https://www.hackerrank.com/challenges/30-exceptions-string-to-integer/

import java.io.*;

public class Day16ExceptionsTringToInteger  {
public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    String S = bufferedReader.readLine();
    try {
        int i = Integer.parseInt(S);
        System.out.println(i);
    } catch (NumberFormatException ex) {
        System.out.println("Bad String");
    }

    bufferedReader.close();
}
}
